package code.vanilson.oop;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Pessoa
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public void speak() {
        System.out.println(this.nome + " is speaking very loud !!");
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Pessoa)) {return false;}

        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + idade;
        return result;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1989, 11, 30);
        LocalDate currentDate = LocalDate.now();
        //uma alternativa que simplifica o cálculo da idade e lida automaticamente com a verificação do aniversário.
        Period age = Period.between(birthDate, currentDate);

        Pessoa pessoa = new Pessoa("vani", age.getYears());

        System.out.println(pessoa);
        pessoa.speak();


        birthDay();
    }

    public static void birthDay(){
        LocalDate currentYear = LocalDate.now(); // Data atual
        LocalDate birthDate = LocalDate.of(1989, 11, 30); // Data de nascimento

        // Cálculo da idade
        int age = currentYear.getYear() - birthDate.getYear();

        // Verifica se o aniversário já ocorreu este ano
        if (currentYear.getDayOfYear() < birthDate.getDayOfYear()) {
            age--; // Se ainda não fez aniversário, subtrai 1
        }

        System.out.println("Idade: " + age);
    }
}