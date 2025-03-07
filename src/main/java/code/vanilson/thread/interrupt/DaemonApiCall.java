/**
 * Author: vanilson muhongo
 * Date:05/03/2025
 * Time:21:12
 * Version:1
 */

package code.vanilson.thread.interrupt;
@SuppressWarnings("all")
public class DaemonApiCall {
    public static void main(String[] args) {
        // Thread daemon para realizar a chamada a API externa
        Thread apiThread = new Thread(new ApiCallTask());
        apiThread.setDaemon(true);  // Definindo como daemon thread
        apiThread.start();

        // A aplicação pode continuar com outras tarefas sem esperar a resposta da API
        System.out.println("A aplicação principal pode continuar executando...");

        // Main thread pode terminar, enquanto a daemon thread continua em segundo plano
        System.out.println("Aplicação principal terminada.");
    }

    private static class ApiCallTask implements Runnable {
        @Override
        public void run() {
            try {
                // Simulando uma chamada a API externa que leva tempo
                System.out.println("Iniciando chamada a API externa...");
                Thread.sleep(5000);  // Simulando o tempo de espera pela resposta
                System.out.println("Resposta da API recebida!");
            } catch (InterruptedException e) {
                System.out.println("A chamada a API foi interrompida.");
            }
        }
    }
}
