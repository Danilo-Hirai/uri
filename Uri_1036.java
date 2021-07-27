package uri_1036

/* Questão:

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes,
mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado
das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha
após cada mensagem.  */

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        
        double a,b,c,r1,r2;
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        if ((a == 0) | (b*b - 4*a*c < 0)){
            System.out.println ("Impossivel calcular");
                        
        }
        else{
            r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
            r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

            System.out.println ("R1 = " + df.format (r1));
            System.out.println ("R2 = " + df.format (r2));
        }
    }
}