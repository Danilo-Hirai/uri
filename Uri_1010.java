package uri_1010

/* Questão:

Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2,
o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor
com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um
espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.  */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        
        int codigo1, numero1, codigo2, numero2;
        double valor1, valor2, valorTotal;
        
        codigo1 = entrada.nextInt();
        numero1 = entrada.nextInt();
        valor1 = entrada.nextDouble();
        codigo2 = entrada.nextInt();
        numero2 = entrada.nextInt();
        valor2 = entrada.nextDouble();
        
        valorTotal = (numero1*valor1)+(numero2*valor2);
        
        System.out.printf ("VALOR A PAGAR: R$ %.2f%n",valorTotal);
    }
}