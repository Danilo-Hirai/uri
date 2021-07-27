package uri_1048

/* Questão:

A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário                 Percentual de Reajuste
0 - 400.00                     15%
400.01 - 800.00                12%
800.01 - 1200.00               10%
1200.01 - 20000.00              7%
Acima de 20000.00               4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.  */


import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        final double reajuste1= 0.15, reajuste2= 0.12, reajuste3= 0.1, reajuste4= 0.07, reajuste5= 0.04;
        double valor, valorReajustado=0, reajuste=0, reajusteGanho=0;
        
        valor = entrada.nextDouble();
        if (valor > 0 && valor <= 400.00){
            valorReajustado = valor + (valor*reajuste1);
            reajuste = reajuste1*100;
            reajusteGanho = valorReajustado - valor;
        }
        else if (valor >= 400.01 && valor <= 800.00){
            valorReajustado = valor + (valor*reajuste2);
            reajuste = reajuste2*100;
            reajusteGanho = valorReajustado - valor;            
        }
        else if (valor >= 800.01 && valor <= 1200.00){
            valorReajustado = valor + (valor*reajuste3);    
            reajuste = reajuste3*100;
            reajusteGanho = valorReajustado - valor;
        }
        else if (valor >= 1200.01 && valor <= 2000.00){
            valorReajustado = valor + (valor*reajuste4);
            reajuste = reajuste4*100;
            reajusteGanho = valorReajustado - valor;            
        }
        else if (valor > 2000.00){
            valorReajustado = valor + (valor*reajuste5);
            reajuste = reajuste5*100;
            reajusteGanho = valorReajustado - valor;            
        }
        System.out.println ("Novo salario: " + df.format(valorReajustado));
        System.out.println ("Reajuste ganho: " + df.format(reajusteGanho));
        System.out.println ("Em percentual: " + (int)reajuste + " %"); 
    } 
}