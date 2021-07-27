package uri_1038

/* Questão:

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar. 

Código      Especificação       Preço
1           Cachorro quente     R$4.00
2           X-salada            R$4.50
3           X-bacon             R$5.00
4           Torrada simples     R$2.00
5           Refrigerante        R$1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.  */



import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int codigo, quantidade;
        double valor;
        
        codigo = entrada.nextInt();
        quantidade = entrada.nextInt();
        
        switch (codigo){
            case 1: valor = 4.00 * quantidade;
            System.out.println ("Total: R$ " + df.format(valor));
            break;
            case 2: valor = 4.50 * quantidade;
            System.out.println ("Total: R$ " + df.format(valor));
            break;
            case 3: valor = 5.00 * quantidade;
            System.out.println ("Total: R$ " + df.format(valor));
            break;
            case 4: valor = 2.00 * quantidade;
            System.out.println ("Total: R$ " + df.format(valor));
            break;
            case 5: valor = 1.50 * quantidade;
            System.out.println ("Total: R$ " + df.format(valor));
            break;
        } 
    }
}