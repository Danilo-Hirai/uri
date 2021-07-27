package uri_1046

/* Questão:

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e
terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.  */


import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        int horaInicial, horaFinal, tempo;
        
        horaInicial = entrada.nextInt();
        horaFinal = entrada.nextInt();
        
        
        if (horaInicial >= horaFinal){
        tempo = 24 - horaInicial + horaFinal;
         
        }
        else {
        tempo = horaFinal - horaInicial;    
        }           
        System.out.println ("O JOGO DUROU " + tempo + " HORA(S)");
    }
}