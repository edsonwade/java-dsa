
### **1. Streams em Java**

- **Definição**: Streams são sequências de elementos que permitem processamentos de dados de forma declarativa e funcional. Introduzidos no Java 8, facilitam operações como filtragem, mapeamento e redução de coleções de dados.

- **Exemplo**:
  
```java
  List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Pedro");
  List<String> nomesComA = nomes.stream()
                                .filter(nome -> nome.startsWith("A"))
                                .collect(Collectors.toList());
  System.out.println(nomesComA); // Saída: [Ana]
  ```


---

### **2. Interfaces Funcionais**

- **Definição**: Interfaces que possuem **apenas um método abstrato**, podendo ter múltiplos métodos default ou estáticos. São fundamentais para o uso de expressões lambda em Java.

- **Exemplo**:
  
```java
  @FunctionalInterface
  public interface Operacao {
      int aplicar(int a, int b);
  }
  ```


---

### **3. Tipos de Interfaces Funcionais**

- **Padrão**: Interfaces com um único método abstrato definido pelo desenvolvedor.

- **Especiais**: Interfaces presentes no pacote `java.util.function`, como `Predicate<T>`, `Function<T, R>`, `Supplier<T>`, `Consumer<T>`, entre outras.

---

### **4. Expressões Lambda**

- **Definição**: Atalhos para implementar interfaces funcionais de forma concisa, permitindo passar comportamentos como parâmetros para métodos ou armazená-los em variáveis.

- **Exemplo**:
  
```java
  Operacao soma = (a, b) -> a + b;
  System.out.println(soma.aplicar(2, 3)); // Saída: 5
  ```


- **Vantagens**:
  - **Sintaxe Concisa**: Reduz a verbosidade do código.
  - **Facilidade de Leitura**: Torna o código mais legível e expressivo.
  - **Programação Funcional**: Permite tratar funções como objetos de primeira classe.

- **Desvantagens**:
  - **Curva de Aprendizado**: Requer familiaridade com conceitos de programação funcional.
  - **Depuração**: Pode ser mais difícil de depurar devido à ausência de nomes de métodos explícitos.

---

### **5. Operadores Intermediários e de Termino em Streams**

- **Operadores Intermediários**:
  - **Definição**: Operações que transformam um stream em outro, retornando um novo stream. São **lazy**, ou seja, só são executados quando uma operação terminal é invocada.
  - **Exemplos**:
    - `filter()`: Filtra elementos com base em uma condição.
    - `map()`: Aplica uma função a cada elemento, transformando-o.
    - `sorted()`: Ordena os elementos.

- **Operadores de Termino**:
  - **Definição**: Operações que produzem um resultado ou efeito colateral, finalizando o processamento do stream.
  - **Exemplos**:
    - `collect()`: Agrupa os elementos em uma coleção.
    - `forEach()`: Executa uma ação para cada elemento.
    - `reduce()`: Combina os elementos em um único resultado.

- **Exemplo Completo**:
  
```java
  List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Pedro");
  nomes.stream()
       .filter(nome -> nome.length() > 3)
       .map(String::toUpperCase)
       .sorted()
       .forEach(System.out::println);
  ```


---

### **6. Passagem por Referência**

- **Definição**: Em Java, objetos são passados por referência, ou seja, métodos podem modificar o estado dos objetos passados como parâmetros.

- **Exemplo**:
  
```java
  class Pessoa {
      String nome;
      Pessoa(String nome) { this.nome = nome; }
  }

  public class Teste {
      public static void main(String[] args) {
          Pessoa pessoa = new Pessoa("João");
          alterarNome(pessoa);
          System.out.println(pessoa.nome); // Saída: Maria
      }

      static void alterarNome(Pessoa p) {
          p.nome = "Maria";
      }
  }
  ```


- **Nota**: Embora a referência ao objeto seja passada por valor (ou seja, a referência é copiada), ambos os métodos compartilham o mesmo objeto na memória.

---

**Resumo Prático**:

- **Streams**: Utilize para processar coleções de dados de forma declarativa e funcional, aproveitando operações como `filter()`, `map()` e `reduce()`.
- **Interfaces Funcionais**: Aproveite para passar comportamentos como parâmetros ou armazená-los em variáveis, facilitando a criação de código mais flexível e reutilizável.
- **Expressões Lambda**: Utilize para implementar interfaces funcionais de forma concisa, melhorando a legibilidade do código.
- **Operadores de Streams**: Distinga entre operadores intermediários (que retornam novos streams) e operadores de término (que produzem resultados ou efeitos colaterais).
- **Passagem por Referência**: Lembre-se de que objetos são passados por referência em Java, permitindo que métodos modifiquem o estado dos objetos originais.

### **1. `Predicate<T>`**

- **Definição**: Representa uma função que recebe um argumento do tipo `T` e retorna um valor booleano. É comumente usada para testar condições ou realizar validações.

- **Vantagens**:
  - **Testes Condicionais**: Ideal para implementar lógicas de filtragem e validação.
  - **Composição**: Permite combinar múltiplas condições utilizando métodos como `and()`, `or()`, e `negate()`.

- **Quando Usar**:
  - Ao necessitar de funções que avaliem condições booleanas, como filtros em streams ou validações de entrada.

- **Quando Não Usar**:
  - Não é adequada para operações que produzem resultados ou efeitos colaterais além de uma avaliação booleana.

- **Exemplo**:
  
```java
  Predicate<String> isNotEmpty = str -> !str.isEmpty();
  Predicate<String> startsWithA = str -> str.startsWith("A");

  List<String> names = Arrays.asList("Ana", "João", "Maria", "Pedro");
  names.stream()
       .filter(isNotEmpty.and(startsWithA))
       .forEach(System.out::println);
  ```

  *Saída: Ana*

---

### **2. `Function<T, R>`**

- **Definição**: Representa uma função que recebe um argumento do tipo `T` e retorna um resultado do tipo `R`. É útil para transformações e mapeamentos de dados.

- **Vantagens**:
  - **Transformações**: Facilita a conversão de dados de um tipo para outro.
  - **Composição**: Permite encadear múltiplas operações utilizando métodos como `andThen()` e `compose()`.

- **Quando Usar**:
  - Ao precisar aplicar uma função de transformação a elementos, como ao mapear valores em streams.

- **Quando Não Usar**:
  - Não é adequada para operações que não produzem um resultado ou que envolvem efeitos colaterais.

- **Exemplo**:
  
```java
  Function<String, Integer> stringLength = String::length;

  List<String> words = Arrays.asList("Java", "Stream", "Function", "Example");
  words.stream()
       .map(stringLength)
       .forEach(System.out::println);
  ```

  *Saída: 4 6 8 7*

---

### **3. `Supplier<T>`**

- **Definição**: Representa uma função que não recebe argumentos e retorna um resultado do tipo `T`. É frequentemente utilizada para fornecer ou gerar valores sob demanda.

- **Vantagens**:
  - **Geração de Valores**: Útil para fornecer instâncias ou valores em pontos específicos do código.
  - **Lazy Evaluation**: Permite a geração de valores apenas quando necessário.

- **Quando Usar**:
  - Ao precisar fornecer valores sem parâmetros, como ao criar objetos ou fornecer dados de configuração.

- **Quando Não Usar**:
  - Não é adequada para funções que requerem entrada do usuário ou que realizam operações baseadas em argumentos.

- **Exemplo**:
  
```java
  Supplier<Double> randomValue = () -> Math.random();

  System.out.println(randomValue.get());
  ```

  *Saída: Um número aleatório entre 0.0 e 1.0*

---

### **4. `Consumer<T>`**

- **Definição**: Representa uma função que recebe um argumento do tipo `T` e não retorna resultado. É utilizada para realizar operações que consomem dados, como imprimir ou modificar estados.

- **Vantagens**:
  - **Operações de Consumo**: Ideal para ações que processam dados sem produzir um resultado direto.
  - **Composição**: Permite encadear múltiplas operações utilizando o método `andThen()`.

- **Quando Usar**:
  - Ao realizar ações que consomem dados, como exibir informações ou modificar objetos.

- **Quando Não Usar**:
  - Não é adequada para funções que devem retornar um valor ou que necessitam de entrada adicional.

- **Exemplo**:
  
```java
  Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

  List<String> names = Arrays.asList("ana", "joão", "maria", "pedro");
  names.forEach(printUpperCase);
  ```

  *Saída: ANA JOÃO MARIA PEDRO*

---

### **5. `Optional<T>`**

- **Definição**: Uma classe contêiner que pode ou não conter um valor não nulo. É utilizada para evitar `NullPointerException` e representar a ausência de valor de maneira explícita.

- **Vantagens**:
  - **Segurança Contra Nulos**: Ajuda a evitar exceções relacionadas a valores nulos.
  - **API Fluente**: Fornece métodos para manipulação funcional de valores presentes ou ausentes.
  - **ACódigo Mais Limpo e Legível:**: Expressa claramente a intenção de que um valor pode estar ausente, melhorando a compreensão do código.

- **Quando Usar**:
  - Ao retornar valores que podem ser ausentes, como resultados de buscas ou operações que podem falhar.

- **Quando Não Usar**:
  - Não é necessário quando a ausência de valor é impossível ou já é tratada de outra forma.
  - **Uso Excessivo**: Utilizar Optional indiscriminadamente pode tornar o código mais complexo e menos eficiente.
  É recomendado usá-lo principalmente em retornos de métodos que podem não ter um valor presente.

- **Exemplo**:
  
```java
  Optional<String> optionalName = Optional.of("João");
  optionalName 