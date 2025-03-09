package code.vanilson.static_block_instance_block;

/**
 * Ordem de execuação final
 * 1- bloco static
 * 2- Bloco de instância
 * 3 -Construtor
 */
@SuppressWarnings("all")
public class StaticVsIntanceBlock {
    // Será executado sempre que uma nova instância da classe for criada, antes do contrutor.
    {
        System.out.println("instance block");
    }

    //Será executado primeiro quando a class for carregado
    static {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        System.out.println("static block");
    }

    public StaticVsIntanceBlock() {
        System.out.println("Bloco contructor : " + Integer.sum(123_456, 3456));
    }

    @Override
    public String toString() {
        return "StaticVsIntanceBlock{}";
    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Main thread : " + Thread.currentThread().getName()));
        thread.setDaemon(true);// Termina automaticamente todas as deamon threads ,quando a main thread terminar.
        thread.start();
        StaticVsIntanceBlock obj = new StaticVsIntanceBlock();

    }
}
