package code.vanilson.solid.lsp.good;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {

        // Upcasting: Subclass to superclass (implicit, safe).
        Sparrow sparrow = new Sparrow();
        Bird b1 = new Sparrow(); // upcating

        /**
         *
         Downcasting: Superclass to subclass (explicit, requires type checking).
         */
        Bird bird = new Sparrow();
        if (bird instanceof Sparrow) {
            Sparrow sparrows = (Sparrow) bird; // downcasting
            sparrows.eat();
            sparrows.fly();
        }

    }
}
