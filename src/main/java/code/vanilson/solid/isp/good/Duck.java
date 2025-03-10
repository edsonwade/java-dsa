package code.vanilson.solid.isp.good;

@SuppressWarnings("all")
public class Duck implements Animal, Swimmer, Flyer {
    @Override
    public void walk() {
        System.out.println("Duck walk");
    }

    @Override
    public void fly() {
        System.out.println("Duck fly");

    }

    @Override
    public void swin() {
        System.out.println("Duck swin");

    }
}
