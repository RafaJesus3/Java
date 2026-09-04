package aula1;

public class CarroTeste {

    public static void main(String[] args) {

        //Criando o objeto carro1 do tipo Carro
        Carro carro1 = new Carro();


        //Atribuindo valores para o objeto
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Azul";
        carro1.velocidadeAtual = 0;

        //Imprimindo os dados do objeto
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Velocidade Atual: " + carro1.velocidadeAtual);

        System.out.println("\n-----------------------------------------------------------------------\n");


        //Criando o objeto carro2 do tipo Carro

        Carro carro2 = new Carro();

        //Atribuindo valores para o objeto carro2
        carro2.marca = "Jeep";
        carro2.modelo = "Compass";
        carro2.cor = "Preto";
        carro2.velocidadeAtual = 0;

        //Imprimindo os dados do objeto carro2
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Velocidade Atual: " + carro2.velocidadeAtual);

        System.out.println("\n-----------------------------------------------------------------------\n");


        System.out.println("Ações do carro " + carro1.modelo);
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        System.out.println("Velocidade Atual: " + carro1.velocidadeAtual);
        carro1.frear();
        System.out.println("Velocidade Atual: " + carro1.velocidadeAtual);

        System.out.println("\n-----------------------------------------------------------------------\n");

        carro2.acelerar();
        carro2.acelerar();
        carro2.frear();
        System.out.println("Velocidade Atual: " + carro2.velocidadeAtual);
    }

}
