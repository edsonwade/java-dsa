### lista de métodos fundamentais para `IntStream` e `Arrays.stream()`
Arquivo README para referência sobre manipulação de arrays em Java.

```markdown
# Métodos Fundamentais de `IntStream` e `Arrays.stream()`

## IntStream

`IntStream` é uma interface que fornece uma sequência de valores inteiros e permite realizar operações funcionais sobre eles. Aqui estão alguns dos métodos mais utilizados:

### Criação de IntStream

- `IntStream.of(int... values)`: Cria um `IntStream` a partir de um conjunto de valores inteiros.
- `IntStream.range(int startInclusive, int endExclusive)`: Cria um `IntStream` que contém uma sequência de inteiros de `startInclusive` até `endExclusive - 1`.
- `IntStream.rangeClosed(int startInclusive, int endInclusive)`: Cria um `IntStream` que contém uma sequência de inteiros de `startInclusive` até `endInclusive`, incluindo ambos.

### Operações de IntStream

- `map(IntUnaryOperator mapper)`: Aplica uma função a cada elemento do stream e retorna um novo `IntStream`.
- `filter(IntPredicate predicate)`: Filtra os elementos do stream com base em um predicado.
- `reduce(int identity, IntBinaryOperator op)`: Realiza uma operação de redução nos elementos do stream, retornando um único valor.
- `forEach(IntConsumer action)`: Executa uma ação para cada elemento do stream.
- `toArray()`: Coleta os elementos do stream em um array de inteiros.

### Exemplos

```java
IntStream.range(1, 10) // Cria um IntStream de 1 a 9
         .filter(n -> n % 2 == 0) // Filtra números pares
         .forEach(System.out::println); // Imprime os números pares
```

## Arrays.stream()

`Arrays.stream()` é um método que permite criar um stream a partir de um array. Aqui estão alguns métodos e operações comuns:

### Criação de Stream a partir de Arrays

- `Arrays.stream(T[] array)`: Cria um stream a partir de um array de objetos.
- `Arrays.stream(int[] array)`: Cria um `IntStream` a partir de um array de inteiros.
- `Arrays.stream(double[] array)`: Cria um `DoubleStream` a partir de um array de doubles.
- `Arrays.stream(long[] array)`: Cria um `LongStream` a partir de um array de long.

### Operações de Stream

- `map(Function<? super T,? extends R> mapper)`: Aplica uma função a cada elemento do stream e retorna um novo stream.
- `filter(Predicate<? super T> predicate)`: Filtra os elementos do stream com base num predicado.
- `sorted()`: Ordena os elementos do stream.
- `collect(Collector<? super T,A,R> collector)`: Coleta os elementos do stream numa coleção ou outro tipo de resultado.
- `toArray()`: Coleta os elementos do stream em um array.

### Exemplos

```java
String[] names = {"Alice", "Bob", "Charlie"};
Arrays.stream(names) // Cria um stream a partir do array de strings
      .filter(name -> name.startsWith("A")) // Filtra nomes que começam com "A"
      .forEach(System.out::println); // Imprime os nomes filtrados
```

## Conclusão

Esses métodos são fundamentais para trabalhar com streams em Java, permitindo manipular e processar arrays de maneira funcional e eficiente. Para mais informações, consulte a [documentação oficial do Java](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html) e [Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html).
```

### Observações:
- Você pode adicionar mais exemplos e métodos conforme necessário, dependendo do seu uso específico.
- Certifique-se de que o formato Markdown esteja correto ao copiar e colar em seu README.