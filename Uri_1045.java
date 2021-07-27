package uri_1045

/* Questão:

Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

    se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
    se A² = B² + C², apresente a mensagem: TRIANGULO RETANGULO
    se A² > B² + C², apresente a mensagem: TRIANGULO OBTUSANGULO
    se A² < B² + C², apresente a mensagem: TRIANGULO ACUTANGULO
    se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
    se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.  */


import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        double valor1, valor2, valor3, A,B,C;
        
        valor1 = entrada.nextDouble();
        valor2 = entrada.nextDouble();
        valor3 = entrada.nextDouble();
        
        if (valor1 >= valor2 && valor2 >= valor3){
            A = valor1;
            B = valor2;
            C = valor3;
        }
        else if (valor1 >= valor3 && valor3 >= valor2){
            A = valor1;
            B = valor3;
            C = valor2;
        }
        else if (valor2 >= valor1 && valor1 >= valor3){
            A = valor2;
            B = valor1;
            C = valor3;
        }
        else if (valor2 >= valor3 && valor3 >= valor1){
            A = valor2;
            B = valor3;
            C = valor1;
        }
        else if (valor3 >= valor1 && valor1 >= valor2){
            A = valor3;
            B = valor1;
            C = valor2;
        }
        else{
            A = valor3;
            B = valor2;
            C = valor1;
        }
                
        if (A >= B + C){
            System.out.println ("NAO FORMA TRIANGULO");
        }
        else if (Math.pow(A,2) == (Math.pow(B,2) + Math.pow(C,2))){
            System.out.println ("TRIANGULO RETANGULO");
        }
        else if (Math.pow(A,2) > (Math.pow(B,2) + Math.pow(C,2))){
            System.out.println ("TRIANGULO OBTUSANGULO");
        }
        else if (Math.pow(A,2) < (Math.pow(B,2) + Math.pow(C,2))){
            System.out.println ("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C){
            System.out.println ("TRIANGULO EQUILATERO");
        }
        else if (A == B || B == C || A == C) {
            System.out.println ("TRIANGULO ISOSCELES");
        }
    }
}