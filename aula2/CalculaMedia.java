package aula2;

import java.util.Scanner;

public class CalculaMedia {

    static void main() {


        // Declaração de variáveis
        Scanner input = new Scanner(System.in);
        String nome;
        float n1, n2, n3, media;

        //Atribuição
        System.out.print("Digite seu nome aqui: ");
        nome = input.nextLine();
        System.out.print("Digite sua 1 nota: ");
        n1 = input.nextFloat();
        System.out.print("Digite sua 2 nota: ");
        n2 = input.nextFloat();
        System.out.print("Digite sua 3 nota: ");
        n3 = input.nextFloat();

        //Processamento
        media = (n1+n2+n3)/3;

        //Saída de dados
        System.out.println(nome + ", sua média foi: " + media);




    }
}
