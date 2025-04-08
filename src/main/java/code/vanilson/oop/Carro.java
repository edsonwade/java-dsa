package code.vanilson.oop;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Carro
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */

@Getter
@EqualsAndHashCode
@ToString
@SuppressWarnings("all")
public class Carro {
    private final String marca;
    private final String modelo;
    private final String cor;
    private final String ano;

    public Carro(CarroBuilder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.cor = builder.cor;
        this.ano = builder.ano;
    }

    static class CarroBuilder {
        private String marca;
        private String modelo;
        private String cor;
        private String ano;

        public CarroBuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarroBuilder setCor(String cor) {
            this.cor = cor;
            return this;
        }

        public CarroBuilder setAno(String ano) {
            this.ano = ano;
            return this;
        }

        public static CarroBuilder builder() {
            return new CarroBuilder();
        }

        public Carro build() {
            return new Carro(this);
        }

        public void ligar() {
            System.out.println("Carro ligado");
        }

        public void desligar() {
            System.out.println("Carro desligado");
        }

    }

    public static void main(String[] args) {
        Carro carro = CarroBuilder
                .builder()
                .setModelo("Toyota")
                .setMarca("Corolla")
                .setCor(Cor.PRETO.name())
                .setAno("2020")
                .build();

        Carro carro1 = CarroBuilder
                .builder()
                .setModelo("Ford")
                .setMarca("Fiesta")
                .setCor(Cor.VERMELHO.name())
                .setAno("2018")
                .build();

        Carro carro2 = CarroBuilder
                .builder()
                .setModelo("Honda")
                .setMarca("Civic")
                .setCor(Cor.PRETO.name())
                .setAno("2021")
                .build();

        Carro carro3 = CarroBuilder
                .builder()
                .setModelo("Chevrolet")
                .setMarca("Onix")
                .setCor(Cor.BRANCO.name())
                .setAno("2019")
                .build();

        Carro carro4 = CarroBuilder
                .builder()
                .setModelo("Toyota")
                .setMarca("Corolla")
                .setCor(Cor.VERMELHO.name())
                .setAno("2020")
                .build();

        Carro carro5 = CarroBuilder
                .builder()
                .setModelo("Toyota")
                .setMarca("Corolla")
                .setCor(Cor.VERMELHO.name())
                .setAno("2020")
                .build();

        Carro carro6 = CarroBuilder
                .builder()
                .setModelo("Honda")
                .setMarca("Civic")
                .setCor(Cor.BRANCO.name())
                .setAno("2021")
                .build();

        Carro carro7 = CarroBuilder
                .builder()
                .setModelo("Honda")
                .setMarca("Civic")
                .setCor(Cor.BRANCO.name())
                .setAno("2021")
                .build();

        Carro carro8 = CarroBuilder
                .builder()
                .setModelo("Chevrolet")
                .setMarca("Onix")
                .setCor(Cor.PRETO.name())
                .setAno("2019")
                .build();

        Carro carro9 = CarroBuilder
                .builder()
                .setModelo("Chevrolet")
                .setMarca("Onix")
                .setCor(Cor.PRETO.name())
                .setAno("2019")
                .build();

        List<Carro> carros = List.of(carro, carro1, carro2, carro3, carro4, carro5, carro6, carro7, carro8);

//        System.out.println("carros com mesma marca ou cores : " + findAllCarsByBrandOrColor(carros));
//        System.out.println();
//        System.out.println("carros com mesma marca : " + findAllCarsByBrandName(carros));

        System.out.println(countNumberOfCarrFromSameModel(carros));

    }

    public static List<Carro> findAllCarsByBrandName(List<Carro> cars) {
        if (cars == null || cars.size() == 0) {
            return Collections.emptyList();
        }
        return cars
                .stream()
                .filter(marca -> "Corolla".equals(marca.getMarca()))
                .collect(Collectors.toList());
    }

    public static List<Carro> findAllCarsByBrandOrColor(List<Carro> cars) {
        if (cars == null || cars.size() == 0) {
            return Collections.emptyList();
        }
        return cars
                .stream()
                .filter(marca -> "Civic".equals(marca.getMarca()) ||
                        Cor.PRETO.name().equals(marca.getCor()))
                .collect(Collectors.toList());

    }

    public static Map<String, Integer> countNumberOfCarrFromSameModel(List<Carro> cars) {
        if (cars == null || cars.size() == 0) {
            return Collections.emptyMap();
        }
        Map<String, Integer> map = new HashMap<>();
        for (Carro marcas : cars) {
            // Marca não está no mapa, adicione com contagem inicial de 1
            if (!map.containsKey(marcas.getMarca())) {
                map.put(marcas.getMarca(), 1);
            } else {
                // Marca já está no mapa, incremente a contagem
                int currentCount = map.get(marcas.getMarca());
                map.put(marcas.getMarca(), currentCount + 1);
            }
        }
        return map;

    }

}