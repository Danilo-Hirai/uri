package uri_1021

/* Questão:

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor
número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2.
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal.  */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);        
        double notas100, notas50, notas20, notas10, notas5, notas2;
        double centavos, valor, moedas1, moedas50, moedas25, moedas10, moedas5, moedas01;
        valor = input.nextDouble();

        centavos = valor*100;

        notas100 = valor / 100.0;
        valor %= 100;
        notas50 = valor / 50.0;
        valor %= 50;
        notas20 = valor / 20.0;
        valor %= 20;
        notas10 = valor / 10.0;
        valor %= 10;
        notas5 = valor / 5.0;
        valor %= 5;
        notas2 = valor / 2.0;
        valor %= 2;
        moedas1 = valor / 1.0;
        valor %= 1;
        centavos %= 100;
        moedas50 = centavos / 50;
        centavos %= 50;
        moedas25 = centavos / 25;
        centavos %= 25;
        moedas10 = centavos / 10;
        centavos %= 10;
        moedas5 = centavos / 5;
        centavos %= 5;
        moedas01 = centavos;

        System.out.println("NOTAS:");
        System.out.println((int)notas100 + " nota(s) de R$ 100.00");
        System.out.println((int)notas50 + " nota(s) de R$ 50.00");
        System.out.println((int)notas20 + " nota(s) de R$ 20.00");
        System.out.println((int)notas10 + " nota(s) de R$ 10.00");
        System.out.println((int)notas5 + " nota(s) de R$ 5.00");
        System.out.println((int)notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)moedas1 + " moeda(s) de R$ 1.00");
        System.out.println((int)moedas50 + " moeda(s) de R$ 0.50");
        System.out.println((int)moedas25 + " moeda(s) de R$ 0.25");
        System.out.println((int)moedas10 + " moeda(s) de R$ 0.10");
        System.out.println((int)moedas5 + " moeda(s) de R$ 0.05");
        System.out.println((int)moedas01 + " moeda(s) de R$ 0.01");
    }
}