package code.vanilson.basics;

import java.util.Map;
import java.util.function.Predicate;

/**
 * Method
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-13
 */
public class Method {
    public static void main(String[] args) {

    }

//    public static Specification<Shape> shapeSpecification(Map<String, String> shape) {
//        return (Root<Shape> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
//            Predicate predicate = null;
//            for (var pair : shape.entrySet()) {
//                var expression = builder.equals(root.get(pair.getKey()), pair.getValue());
//                return (predicate == null) ? expression : builder.and(predicate, expression);
//            }
//            return null;
//        };
//
//    }
}

interface Specification<T> {
    T shapesSpecification(Map<String, String> map);

}

class Shape implements Specification<Shape> {

    @Override
    public Shape shapesSpecification(Map<String, String> map) {
        return null;
    }
}