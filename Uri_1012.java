package uri_1012;

/*
Questão:

Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. 

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser
apresentado com 3 dígitos após o ponto decimal.
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);      
        
        double A,B,C, Triangulo, Circulo, Trapezio, Quadrado, Retangulo;
        final double Pi = 3.14159;
        
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        Triangulo = (A*C)/2;
        Circulo = Math.pow(C,2)*Pi;
        Trapezio = ((A+B)*C)/2;
        Quadrado = B*B;
        Retangulo = A*B;
        
        System.out.printf("TRIANGULO: %.3f%n",(Triangulo));
        System.out.printf("CIRCULO: %.3f%n",(Circulo));
        System.out.printf("TRAPEZIO: %.3f%n",(Trapezio));
        System.out.printf("QUADRADO: %.3f%n",(Quadrado));
        System.out.printf("RETANGULO: %.3f%n",(Retangulo));
    } 
}