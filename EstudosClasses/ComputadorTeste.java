package EstudosClasses;

import java.util.Scanner;

public class ComputadorTeste {


    public static void main(String[] args){

        System.out.println("------Meu Computador------");

        //Criando um objeto da classe Computador
        Computador pc = new Computador();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua placa de vídeo: ");
        String placaDeVideo = scanner.nextLine();


        //Alterando os dados do objeto tv (forma direta)


        pc.setProcessador("i7 Ultra core");
        pc.setMemoriaRam(16);
        pc.setHertz(144);
        pc.setMarcaProcessador("Intel");
        pc.setPlacaDeVideo(placaDeVideo);
        pc.instalarMemoriaRam(8);

        pc.ligar();
        pc.specs();








    }
}
