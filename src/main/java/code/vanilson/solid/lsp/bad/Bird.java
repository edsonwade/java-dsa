package code.vanilson.solid.lsp.bad;

@SuppressWarnings("all")
public class Bird {

    protected void fly() {
        System.out.println("Bird fly");
    }
}

@SuppressWarnings("all")
class Sparrow extends Bird {
    @Override
    protected void fly() {
        System.out.println("Sparrow fly");
    }
}

@SuppressWarnings("all")
class Ostrich extends Bird {
    //Viola o princípio do LSP (principio da substituição)
    // Subclass que herdam de superclasses devem manter o comportamento definido pela superclass.
    // Ostricth apesar de se Bird, contudo não voa.
    @Override
    protected void fly() {
        System.out.println("Ostrich dont fly");
    }
}
