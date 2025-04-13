package code.with.vanilson.demospring;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class DemoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }

}

@Getter
@Setter
class Shape {
    @Id
    private Long id;
    private String type;
    private String color;

    // Getters e Setters
}

class ShapeRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Shape> findShapesByType(String type) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Shape> query = builder.createQuery(Shape.class);
        Root<Shape> root = query.from(Shape.class);

        query.select(root).where(builder.equal(root.get("type"), type));

        return entityManager.createQuery(query).getResultList();
    }

    public List<Shape> findShapesByCriteria(Map<String, String> criteria) {
        // Cria a especificação usando o método estático
        Specification<Shape> specification = ShapeSpecification.shapeSpecification(criteria);

        // Cria a consulta usando a especificação
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Shape> query = builder.createQuery(Shape.class);
        Root<Shape> root = query.from(Shape.class);

        // Aplica a especificação à consulta
        Predicate predicate = specification.toPredicate(root, query, builder);
        query.select(root).where(predicate);

        return entityManager.createQuery(query).getResultList();
    }
}

class ShapeSpecification {

    private ShapeSpecification() {
        // Cannot be instantiated
    }

    public static Specification<Shape> shapeSpecification(Map<String, String> shape) {
        return (root, query, builder) -> {
            // Verifica se o mapa shape é nulo ou vazio
            if (shape == null || shape.isEmpty()) {
                return builder.conjunction(); // Retorna um Predicate que sempre é verdadeiro
            }

            Predicate predicate = null; // Inicializa o predicate

            for (var pair : shape.entrySet()) {
                // Cria uma Predicate para a entrada atual
                Predicate expression = builder.equal(root.get(pair.getKey()), pair.getValue());

                // Se o predicate for nulo, inicializa com a expressão
                if (predicate == null) {
                    predicate = expression; // Retorna a expressão se for a primeira
                } else {
                    // Caso contrário, adiciona a expressão ao predicate existente
                    predicate = builder.and(predicate, expression);
                }
            }
            return predicate; // Retorna o predicate combinado
        };
    }
}