package code.vanilson.thread;

/**
 * Sincronization
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
@SuppressWarnings("all")
public class Sincronization {
    private int count = 0;

    public void sincronizacaoVariavelPartilhada() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public synchronized void sincornizacaoMetodoPartilhado() {
        count++;
    }

    public static void main(String[] args) {
        Sincronization sincronization = new Sincronization();

        // Criar múltiplos threads que incrementam o contador
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sincronization.sincronizacaoVariavelPartilhada();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sincronization.sincornizacaoMetodoPartilhado();
            }
        });

        // Iniciar os threads
        thread1.start();
        thread2.start();

        // Aguardar a conclusão dos threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Exibir o valor final de count
        System.out.println("Valor final de count: " + sincronization.getCount());
    }

}