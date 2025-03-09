package code.vanilson.design_pattern.builder;

import java.math.BigDecimal;

/**
 * Carro
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-09
 */
@SuppressWarnings("all")
public class Carro implements Cloneable{
    //Objeto complexo
    private String marca;
    private String cor;
    private String modelo;
    private String motor;
    private int ano;
    private int portas;
    private int capacidadePassageiros;
    private BigDecimal price;

    // Separacção de construção de objetos da sua Representação usando builder.
    private Carro(CarroBuilder builder) {
        this.marca = builder.marca;
        this.cor = builder.cor;
        this.modelo = builder.modelo;
        this.motor = builder.motor;
        this.ano = builder.ano;
        this.portas = builder.portas;
        this.capacidadePassageiros = builder.capacidadePassageiros;
        this.price = builder.price;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", ano=" + ano +
                ", portas=" + portas +
                ", capacidadePassageiros=" + capacidadePassageiros +
                ", price=" + price +
                '}';
    }

    static class CarroBuilder {
        //Objeto complexo
        private String marca;
        private String cor;
        private String modelo;
        private String motor;
        private int ano;
        private int portas;
        private int capacidadePassageiros;
        private BigDecimal price;

        // Representação
        public CarroBuilder(String marca, String cor) {
            this.marca = marca;
            this.cor = cor;
        }

        public CarroBuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder setMotor(String motor) {
            this.motor = motor;
            return this;
        }

        public CarroBuilder setAno(int ano) {
            this.ano = ano;
            return this;
        }

        public CarroBuilder setPortas(int portas) {
            this.portas = portas;
            return this;
        }

        public CarroBuilder setCapacidadePassageiros(int capacidadePassageiros) {
            this.capacidadePassageiros = capacidadePassageiros;
            return this;
        }

        public CarroBuilder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
    }

}