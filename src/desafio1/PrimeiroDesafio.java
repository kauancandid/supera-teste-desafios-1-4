package desafio1;

/*PRIMEIRO DESAFIO

        Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
        o seguinte critério:
        • Primeiro os Pares
        • Depois os Ímpares
        Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
        em ordem decrescente.
        Entrada
        A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o
        número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada
        uma delas, um valor inteiro não negativo.
        Saída
        Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
        número deve ser impresso em uma linha, conforme exemplo abaixo.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class PrimeiroDesafio {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int linhas = Integer.parseInt(st.nextToken());

        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < linhas; i++) {
            st = new StringTokenizer(br.readLine());
            listaNumeros.add(Integer.parseInt(st.nextToken()));
        }

        var pares = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());

        var impares = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> total = new ArrayList<>();
        total.addAll(pares);
        total.addAll(impares);
        total.forEach(System.out::println);
    }


}
