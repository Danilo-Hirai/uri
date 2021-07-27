package uri_1042

/* Questão:

Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em
seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.  */


import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        int Num1, Num2, Num3, Primeiro=0, Segundo=0, Terceiro=0;
        
        Num1 = entrada.nextInt();
        Num2 = entrada.nextInt();
        Num3 = entrada.nextInt();
        
        if (Num1 < Num2 & Num2 < Num3){
            Primeiro = Num1;
            Segundo = Num2;
            Terceiro = Num3;
        }
        if (Num1 < Num3 & Num3 < Num2){
            Primeiro = Num1;
            Segundo = Num3;
            Terceiro = Num2;
        }
        if (Num2 < Num1 & Num1 < Num3){
            Primeiro = Num2;
            Segundo = Num1;
            Terceiro = Num3;
        }
        if (Num2 < Num3 & Num3 < Num1){
            Primeiro = Num2;
            Segundo = Num3;
            Terceiro = Num1;
        }
        if (Num3 < Num1 & Num1 < Num2){
            Primeiro = Num3;
            Segundo = Num1;
            Terceiro = Num2;
        }
        if (Num3 < Num2 & Num2 < Num1){
            Primeiro = Num3;
            Segundo = Num2;
            Terceiro = Num1;
        }
        System.out.println (Primeiro);
        System.out.println (Segundo);
        System.out.println (Terceiro);
        System.out.println ();
        System.out.println (Num1);
        System.out.println (Num2);
        System.out.println (Num3);
    } 
}