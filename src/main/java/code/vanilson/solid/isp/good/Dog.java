package code.vanilson.solid.isp.good;

/**
 * Agora a classe só implementa a interface necessária ,sem ser forçado a implementar métodos
 * desnecessário.
 */
@SuppressWarnings("all")
public class Dog implements Animal, Swimmer {
    @Override
    public void walk() {
        System.out.println("Dog walk");
    }

    @Override
    public void swin() {
        System.out.println("Dog Swin");
    }

}
