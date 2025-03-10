package code.vanilson.solid.isp.bad;

/**
 * Uma classe não deve ser forçado a implementar ‘interfaces’ que não vai utilizar.
 * Neste eexmplo vemos a class Dog a ser forçado a implementar a ‘interface’ animal,
 * apesar de ser Animal, contudo Dog não voa.
 */
public class Dog implements Animal {
    @Override
    public void walk() {
        System.out.println("Dog walk");
    }

    @Override
    public void swin() {
        System.out.println("Dog Swin");
    }

    @Override
    public void fly() {
        // Viola o princípio ISR(Principio da segregação da ‘interface’)
        System.err.println("Dog cant fly");
    }

}
