package uri_1151;
/*
Questão:

A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci.
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores.
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1151 {
    public static void main(String[] args) throws IOException {
 
    Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        int a = 1;
        int b = 1;
        int temp;
       
        if (valor==1){
           System.out.print("0");
       }
       else{
           System.out.print("0");
       for (int cont=1; cont < valor; cont++){
           System.out.print(" "+a);
           temp = a+b;
           a = b;
           b = temp;
        }
     }
       System.out.println(); 
    } 
}