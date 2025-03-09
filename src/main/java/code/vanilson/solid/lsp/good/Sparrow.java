package code.vanilson.solid.lsp.good;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }

    @Override
    protected void eat() {
        System.out.println("Sparrow eat");
    }
}
