package code.vanilson.oop;

import java.util.Objects;

/**
 * Client
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public class Client {
    private long idClient;
    private String firstName;
    private String lastName;
    private String email;

    public Client() {
        // defualt constructor
    }

    public Client(ClientBuilder builder) {
        this.idClient = builder.idClient;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Client)) {return false;}

        Client client = (Client) o;
        return idClient == client.idClient && Objects.equals(firstName, client.firstName) &&
                Objects.equals(lastName, client.lastName) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(idClient);
        result = 31 * result + Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(email);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // class aninhada (class nested static) ⇉ não tem acesso aos atributos e metodos da class externa(Client)
    static class ClientBuilder {
        private long idClient;
        private String firstName;
        private String lastName;
        private String email;

        public ClientBuilder setIdClient(long idClient) {
            this.idClient = idClient;
            return this;
        }

        public ClientBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ClientBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ClientBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public static ClientBuilder builder() {
            return new ClientBuilder();
        }

        public Client build() {
            return new Client(this);
        }
    }
}