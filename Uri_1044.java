package uri_1044

/* Questão:

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os
valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.  */


import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        int A, B;
        
        A = entrada.nextInt();
        B = entrada.nextInt();
        
       if (B%A == 0 | A%B == 0){
           System.out.println ("Sao Multiplos");
       }
       else 
           System.out.println ("Nao sao Multiplos");
    }
 
}