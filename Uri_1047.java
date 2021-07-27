package uri_1047

/* Questão:

Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .  */


import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        
        int horaInicial, minutoInicial, horaFinal, minutoFinal, tempo, horas, minutos;
        
        horaInicial = entrada.nextInt();
        minutoInicial = entrada.nextInt();
        horaFinal = entrada.nextInt();
        minutoFinal = entrada.nextInt();
        
        horas = horaFinal - horaInicial;
        
        if (horas < 0){
            horas += 24;
        }
        
        minutos = minutoFinal - minutoInicial;
        
        if (minutos < 0){
            minutos += 60;
            horas--;
        }
        
        if (horaInicial == horaFinal && minutoInicial == minutoFinal){
            System.out.println ("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else {
            System.out.println ("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
        }
    }
}