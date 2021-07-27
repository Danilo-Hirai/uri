package uri_1043

/* Questão:

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e
apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.  */


import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        double A, B, C;
        
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        if (A+B>C && A+C>B && B+C>A){
            System.out.println("Perimetro = " + (A + B + C));
        }
        else{
            System.out.println("Area = " + (((A + B) * C)/2));
        }
    }
}