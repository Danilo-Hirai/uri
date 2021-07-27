package uri_1013

/* Questão:

Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
MaiorAB=(a+b+abs(a-b))/2
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no
resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".  */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        int A, B, C, Maior;
        
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        Maior = (A + B + Math.abs(A-B))/2;
        Maior = (Maior + C + Math.abs(Maior - C))/2;
        
        System.out.println (Maior + " eh o maior");
    } 
}