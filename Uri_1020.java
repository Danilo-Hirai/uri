package uri_1020

/* Questão:

Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.  */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int Idade, Anos=0, Meses=0, Dias=0;
        
        Idade = entrada.nextInt();
        
        while (Idade >= 365){
            Anos = ++Anos;
            Idade = Idade-365;
        }
        while (Idade >= 30){
            Meses = ++Meses;
            Idade = Idade-30;
        }
        while (Idade > 0){
            Dias = ++Dias;
            Idade = Idade-1;
        }
        System.out.println (Anos + " ano(s)");
        System.out.println (Meses + " mes(es)");
        System.out.println (Dias + " dia(s)");
    } 
}