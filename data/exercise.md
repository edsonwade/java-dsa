package com.itscreening;
import java.util.stream.IntStream;

public class FindMyDestination {

	public Boolean reachedDestination(String moves, int x, int y) {
		final int[] position = {0, 0};
        IntStream.range(0, moves.length())
                .forEach(i -> {
                    char move = moves.charAt(i);
                    switch (move) {
                        case 'N':
                            position[1]++;
                            break;
                        case 'S':
                            position[1]--;
                            break;
                        case 'E':
                            position[0]++;
                            break;
                        case 'W':
                            position[0]--;
                            break;
                    }
                });

        return position[0] == x && position[1] == y;
	}

}

Exercícios de Arrays em Java
Soma dos Elementos de um Array

Descrição: Dado um array de inteiros, retorne a soma de todos os elementos do array.

Input: [1, 2, 3, 4]

Output: 10

Explicação: A soma é 1 + 2 + 3 + 4 = 10.

Contar Elementos Positivos

Descrição: Dado um array de números inteiros, conte quantos números positivos existem no array.

Input: [1, -2, 3, -4, 5]

Output: 3

Explicação: Os números positivos são 1, 3 e 5.

Encontrar o Maior Número em um Array

Descrição: Dado um array de inteiros, encontre o maior número presente no array.

Input: [5, 3, 9, 7]

Output: 9

Explicação: O maior número é 9.

Verificar se o Array é Palíndromo

Descrição: Dado um array de inteiros, verifique se o array é um palíndromo. Um palíndromo 
é um array que pode ser lido da mesma forma da esquerda para a direita e da direita para a esquerda.

Input: [1, 2, 3, 2, 1]

Output: True

Explicação: O array é simétrico, ou seja, é um palíndromo.

Mover Zeros para o Final

Descrição: Dado um array de inteiros, mova todos os zeros para o final, mantendo a ordem dos outros elementos.

Input: [0, 1, 0, 3, 12]

Output: [1, 3, 12, 0, 0]

Explicação: Todos os zeros são movidos para o final do array.

Contar a Frequência de um Número

Descrição: Dado um array e um número alvo, conte quantas vezes esse número aparece no array.

Input: [1, 2, 2, 3, 2, 4], alvo = 2

Output: 3

Explicação: O número 2 aparece 3 vezes.

Substituir Elementos Negativos por Zero

Descrição: Dado um array de inteiros, substitua todos os números negativos por zero.

Input: [1, -2, 3, -4, 5]

Output: [1, 0, 3, 0, 5]

Explicação: Todos os números negativos foram substituídos por zero.

Encontrar o Índice do Menor Elemento

Descrição: Dado um array de inteiros, retorne o índice do menor número no array.

Input: [10, 20, 5, 3]

Output: 3

Explicação: O menor número é 3 e está no índice 3.

Remover Elementos Duplicados

Descrição: Dado um array de inteiros, remova os elementos duplicados.

Input: [1, 2, 2, 3, 4, 4]

Output: [1, 2, 3, 4]

Explicação: Todos os números duplicados foram removidos.

Verificar se o Array está Ordenado

Descrição: Dado um array de números inteiros, verifique se o array está em ordem crescente.

Input: [1, 2, 3, 4]

Output: True

Explicação: O array está em ordem crescente.

Exercícios de Strings em Java
Reverter uma String

Descrição: Dada uma string, retorne a string invertida.

Input: "hello"

Output: "olleh"

Explicação: A string invertida é "olleh".

Contar o Número de Ocorrências de um Caractere

Descrição: Dada uma string e um caractere, conte quantas vezes esse caractere aparece na string.

Input: "banana", caractere = "a"

Output: 3

Explicação: O caractere a aparece 3 vezes na string.

Verificar se uma String é um Palíndromo

Descrição: Dada uma string, verifique se ela é um palíndromo (lê-se da mesma forma da esquerda para a direita e da direita para a esquerda).

Input: "radar"

Output: True

Explicação: A string "radar" é um palíndromo.

Substituir um Caractere em uma String

Descrição: Dada uma string e um caractere, substitua todas as ocorrências desse caractere por outro.

Input: "hello world", substituir "o" por "x"

Output: "hellx wxrld"

Explicação: Todos os caracteres o foram substituídos por x.

Verificar se uma Substring Está Presente

Descrição: Dada uma string e uma substring, verifique se a substring está presente na string.

Input: "hello world", "world"

Output: True

Explicação: A substring "world" está presente na string "hello world".

Contar Palavras em uma String

Descrição: Dada uma string com várias palavras, conte o número total de palavras na string.

Input: "hello world from java"

Output: 4

Explicação: A string contém 4 palavras.

Remover Espaços em Branco

Descrição: Dada uma string, remova todos os espaços em branco.

Input: " hello world "

Output: "helloworld"

Explicação: Todos os espaços foram removidos da string.

Transformar uma String para Maiúsculas

Descrição: Dada uma string, converta todos os caracteres para maiúsculas.

Input: "java"

Output: "JAVA"

Explicação: A string foi convertida para maiúsculas.

Contar Caracteres Únicos

Descrição: Dada uma string, conte o número de caracteres únicos presentes nela.

Input: "java"

Output: 3

Explicação: Os caracteres únicos são j, a, e v.

Inverter as Palavras de uma String

Descrição: Dada uma string, inverta a ordem das palavras.

Input: "hello world"

Output: "world hello"

Explicação: A ordem das palavras foi invertida.

Exercícios de Lógica de Programação em Java
Fatorial de um Número

Descrição: Dado um número n, calcule o fatorial de n. O fatorial de n é o produto de todos os números inteiros de 1 até n.

Input: n = 5

Output: 120

Explicação: O fatorial de 5 é 5 * 4 * 3 * 2 * 1 = 120.

Verificar se um Número é Primo

Descrição: Dado um número n, verifique se ele é um número primo. 
Um número primo é um número maior que 1 que só é divisível por 1 e ele mesmo.

Input: n = 7

Output: True

Explicação: O número 7 é primo.

Fibonacci

Descrição: Dado um número n, retorne o n-ésimo número da sequência de Fibonacci. A sequência começa com 0, 1, 1, 2, 3, 5, ....

Input: n = 6

Output: 8

Explicação: O número 6 da sequência de Fibonacci é 8.

Soma de Dígitos de um Número

Descrição: Dado um número, calcule a soma de seus dígitos.

Input: n = 123

Output: 6

Explicação: A soma dos dígitos de 123 é 1 + 2 + 3 = 6.

Trocar Números Máximos e Mínimos de um Array

Descrição: Dado um array de inteiros, troque o maior número com o menor número do array.

Input: [1, 5, 3, 9, 2]

Output: [9, 5, 3, 1, 2]

Explicação: O número 9 foi trocado com o 1.

1. Encontrar o Maior e o Menor Elemento em um Array

Descrição: Dado um array de números inteiros, encontre e retorne o maior e o menor valor presente no array.

Exemplo:

Entrada: [3, 5, 7, 2, 8]

Saída: Maior: 8, Menor: 2

Dicas:

Inicialize duas variáveis para armazenar o maior e o menor valor, atribuindo-lhes o primeiro elemento do array.

Percorra o array comparando cada elemento com essas variáveis e atualize-as conforme necessário.

2. Verificar a Existência de um Valor em um Array

Descrição: Implemente um método que verifique se um determinado valor está presente em um array de inteiros.

Exemplo:

Entrada: array = [1, 2, 3, 4, 5], valor = 3

Saída: true

Dicas:

Percorra o array e compare cada elemento com o valor fornecido.

Retorne true assim que encontrar o valor; caso contrário, retorne false após verificar todos os elementos.

3. Inverter um Array

Descrição: Escreva um programa que inverta a ordem dos elementos em um array de inteiros.

Exemplo:

Entrada: [1, 2, 3, 4, 5]

Saída: [5, 4, 3, 2, 1]

Dicas:

Utilize dois índices, um iniciando no começo e outro no final do array.

Troque os elementos correspondentes e mova os índices em direção ao centro até que eles se encontrem.

4. Remover Elementos Duplicados de um Array

Descrição: Dado um array de inteiros, remova os elementos duplicados e retorne um novo array com valores únicos.

Exemplo:

Entrada: [1, 2, 2, 3, 4, 4, 5]

Saída: [1, 2, 3, 4, 5]

Dicas:

Utilize uma estrutura de dados como HashSet para armazenar elementos únicos.

Converta o HashSet de volta para um array, se necessário.

5. Rotacionar um Array para a Direita

Descrição: Implemente um método que rotacione os elementos de um array 
para a direita por uma quantidade k de posições.

Exemplo:

Entrada: array = [1, 2, 3, 4, 5], k = 2

Saída: [4, 5, 1, 2, 3]

Dicas:

Determine o ponto de rotação calculando k % tamanho_do_array.

Divida o array em duas partes e reorganize-as para obter o resultado desejado.

6. Encontrar Todos os Pares com Soma Igual a um Valor Específico

Descrição: Dado um array de inteiros e um número alvo, 
encontre todos os pares de elementos no array cuja soma seja igual ao número alvo.

i + 2 =6;


Exemplo:

Entrada: array = [2, 4, 3, 7, 1, 5], alvo = 6

Saída: [(2, 4), (1, 5)]

Dicas:

Utilize uma estrutura como HashSet para armazenar os complementos necessários para atingir a soma alvo enquanto percorre o array.

1. Mover Todos os Zeros para o Fim do Array

Descrição: Escreva um programa que mova todos os zeros de um array de inteiros para o final, mantendo a ordem dos outros elementos.

Exemplo:

Entrada: [0, 1, 0, 3, 12]

Saída: [1, 3, 12, 0, 0]

Dicas:

Utilize um índice para rastrear a posição de inserção dos elementos não zero.

Percorra o array e, para cada elemento não zero, mova-o para a posição rastreada, incrementando o índice.

8. Encontrar o Elemento Majoritário

Descrição: Dado um array de inteiros, encontre o elemento que aparece mais da metade das vezes no array (se existir).

Exemplo:

Entrada: [3, 3, 4, 2, 3, 3, 5, 3]

Saída: 3

Dicas:

Utilize o algoritmo de Boyer-Moore para encontrar o candidato a elemento majoritário de forma eficiente.

9. Encontrar a Subsequência Contígua com a Maior Soma (Problema de Kadane)

Descrição: Encontre a soma máxima de uma subsequência contígua em um array de números inteiros (podendo incluir números negativos).

Exemplo:

Entrada: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Saída: 6 (correspondente à subsequência [4, -1, 2, 1])

Dicas:

Utilize o algoritmo de Kadane, que percorre o array uma vez, mantendo o controle da soma máxima atual e da soma máxima global.

10. Mesclar Dois Arrays Ordenados

Descrição: Dado dois arrays ordenados de inteiros, mescle-os em um único array ordenado.

Exemplo:

Entrada: array1 = [1, 3, 5], array2 = [2, 4, 6]

Saída: [1, 2, 3, 4, 5, 6]

Dicas:

Utilize dois ponteiros para comparar os elementos de ambos os arrays e insira o menor elemento no array resultante, avançando o ponteiro correspondente.