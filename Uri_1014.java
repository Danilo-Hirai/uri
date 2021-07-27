package uri_1014

/* Questão:

Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y
representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".  */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        
        int distancia;
        double combustivel, consumo;
        
        distancia = entrada.nextInt();
        combustivel = entrada.nextDouble();
        consumo = distancia / combustivel;
        
        System.out.printf ("%.3f", consumo);
        System.out.println(" km/l");
    }
}