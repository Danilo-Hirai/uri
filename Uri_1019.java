package uri_1019

/* Questão:

Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no
formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.  */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        int tempo;
        double horas, minutos,segundos;
        
        tempo = entrada.nextInt();
        horas = tempo/3600;
        minutos = (tempo%3600)/60;
        segundos = (tempo%3600)%60;
        
        System.out.println ((int)horas + ":" + (int)minutos+ ":" + (int)segundos);
    }
}