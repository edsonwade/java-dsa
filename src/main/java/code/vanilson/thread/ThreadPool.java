package code.vanilson.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadPool
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public class ThreadPool implements Runnable {
    private final int taskId; // ID da tarefa

    public ThreadPool(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Execute thread  " + taskId + " na thread" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Enviar 6 tarefas para o executor
        for (int i = 0; i <= 5; i++) {
            ThreadPool task = new ThreadPool(i);
            service.execute(task);
        }
        service.shutdown(); // Não aceita mais tarefas e aguarda a conclusão das existentes
    }

    //Execução: Como você usa um pool de 3 threads e enviando 6 tarefas, as primeiras 3 tarefas serão
    // executadas simultaneamente, enquanto as outras 3 esperarão até que uma das threads esteja disponível
}