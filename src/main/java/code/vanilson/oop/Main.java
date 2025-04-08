package code.vanilson.oop;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public class Main {

    public static void main(String[] args) {
        Client client1 = Client.
                ClientBuilder
                .builder()
                .setIdClient(10023L)
                .setFirstName("vani")
                .setLastName("wayne")
                .setEmail("vanilson@example.com")
                .build();

        Client client2 = Client.
                ClientBuilder
                .builder()
                .setIdClient(11123L)
                .setFirstName("wayne")
                .setLastName("vani")
                .setEmail("wayne@example.com")
                .build();

        System.out.println("client1: " + client1);
        System.out.println("client2: " + client2);

        System.out.println("isso é falso : " + client1.equals(client2));

        Account account1 = new Account(client1);
        Account account2 = new Account(client2);

        account1.deposit(500);
        account2.deposit(100);

        System.out.println("Account 1: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getBalance());

        account2.withdraw(20);
        System.out.println("Account 2: " + account2.getBalance());

        Client client3 = Client.
                ClientBuilder
                .builder()
                .setIdClient(12323L)
                .setFirstName("fabio")
                .setLastName("teixeira")
                .setEmail("fabio@test.ao")
                .build();

        Account account3 = new Account(client3);
        account3.deposit(10);
        account3.withdraw(1);
        System.out.println("Account 3: " + account3.getBalance());
    }
}