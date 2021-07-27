package uri_1018

/* Questão:

Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem:
“Presentation Error”. */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner (System.in);
        int Numero, Valor, NotasCem=0, NotasCinquenta=0, NotasVinte=0, NotasDez=0, NotasCinco=0, NotasDois=0, NotasUm=0;
        
        Numero = entrada.nextInt();
        Valor = Numero;
        
        if (Numero <= 1000000){
            while (Numero >= 100){
                NotasCem = ++NotasCem;
                Numero = Numero - 100;
            }
            while (Numero >= 50){
                NotasCinquenta = ++NotasCinquenta;
                Numero = Numero-50;
            }
            while (Numero >= 20){
                NotasVinte = ++NotasVinte;
                Numero = Numero-20;
            }
            while (Numero >= 10){
                NotasDez = ++NotasDez;
                Numero = Numero-10;
            }
            while (Numero >= 5){
                NotasCinco = ++NotasCinco;
                Numero = Numero-5;
            }
            while (Numero >= 2){
                NotasDois = ++NotasDois;
                Numero = Numero-2;
            }
            while (Numero > 0){
                NotasUm = ++NotasUm;
                Numero = Numero-1;
            }  
        System.out.println(Valor);
        System.out.println(NotasCem + " nota(s) de R$ 100,00");
        System.out.println(NotasCinquenta + " nota(s) de R$ 50,00");
        System.out.println(NotasVinte + " nota(s) de R$ 20,00");
        System.out.println(NotasDez + " nota(s) de R$ 10,00");
        System.out.println(NotasCinco + " nota(s) de R$ 5,00");
        System.out.println(NotasDois + " nota(s) de R$ 2,00");
        System.out.println(NotasUm + " nota(s) de R$ 1,00");
        }
 
    }
 
}