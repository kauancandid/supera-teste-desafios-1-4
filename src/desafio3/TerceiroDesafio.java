package desafio3;

/*TERCEIRO DESAFIO

        Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
        do array em que a sua diferença seja igual ao valor alvo.

        Exemplo
        K = 1
        arr = [1,2,3,4]
        Existem 3 valores cuja diferença é igual ao valor alvo K: 2-1 = 1, 3-2 = 1, 4-3 = 1.

        Descrição do problema:
        Os pares têm os seguintes parâmetros:
        int k: Um Inteiro, valor alvo.
        int arr[n]: Um array de Inteiros.

        Retorno
        int: O número de pares que satisfazem o critério.

        Formatos de Entrada
        Seu código deve conter duas entradas n e k, que representam o tamanho do array e o valor
        alvo.
        Seu código deve conter um array de inteiros, de tamanho n.

        Exemplos de entrada

        STDIN Function
        ----- --------
        5 2 arr[] tamanho n = 5, k =2
        1 5 3 4 2 arr = [1, 5, 3, 4, 2]

        Exemplo de saida
        3*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TerceiroDesafio {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int n;

        System.out.printf("Informe o tamanho da lista:");
        n = ler.nextInt();

        ArrayList<Integer> entrada = new ArrayList<Integer>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();

        System.out.println("Informe os numeros da lista:");
        for (int i = 0; i < n; i++) {
            ler = new Scanner(System.in);
            entrada.add(ler.nextInt());

            if (entrada.get(i) % 2 == 0) {
                numerosPares.add(entrada.get(i));
            } else {
                numerosImpares.add(entrada.get(i));
            }
        }

        Collections.sort(numerosPares);
        Collections.sort(numerosImpares);
        Collections.reverse(numerosImpares);

        System.out.println("Numeros pares:");
        for (int par : numerosPares) {
            System.out.println(par);
        }

        System.out.println("Numeros impares:");
        for (int impar : numerosImpares) {
            System.out.println(impar);
        }
    }
}
