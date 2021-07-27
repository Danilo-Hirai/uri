package uri_1049

/* Questão:

Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.
Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.  

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.  */


import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        String Palavra1, Palavra2, Palavra3;
        
        Palavra1 = entrada.nextLine();
        Palavra2 = entrada.nextLine();
        Palavra3 = entrada.nextLine();
        
        if ("vertebrado".equals(Palavra1) && "ave".equals(Palavra2) && "carnivoro".equals(Palavra3)){                
            System.out.println ("aguia");
        }
        else if ("vertebrado".equals(Palavra1) && "ave".equals(Palavra2) && "onivoro".equals(Palavra3)){                
            System.out.println ("pomba");
        }               
        else if ("vertebrado".equals(Palavra1) & "mamifero".equals(Palavra2) & "onivoro".equals(Palavra3)){
            System.out.println ("homem");
        }
        else if ("vertebrado".equals(Palavra1) & "mamifero".equals(Palavra2) & "herbivoro".equals(Palavra3)){
            System.out.println ("vaca");
        }
        else if ("invertebrado".equals(Palavra1) & "inseto".equals(Palavra2) & "hematofago".equals(Palavra3)){
            System.out.println ("pulga");
        }
        else if ("invertebrado".equals(Palavra1) & "inseto".equals(Palavra2) & "herbivoro".equals(Palavra3)){
            System.out.println ("lagarta");
        }
        else if ("invertebrado".equals(Palavra1) & "anelideo".equals(Palavra2) & "hematofago".equals(Palavra3)){
            System.out.println ("sanguessuga");
        }
        else if ("invertebrado".equals(Palavra1) & "anelideo".equals(Palavra2) & "onivoro".equals(Palavra3)){
            System.out.println ("minhoca");
        }
    }
}