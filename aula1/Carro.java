package aula1;

public class Carro {

    //atributos - características / informações do objeto
    String marca;
    String modelo;
    String cor;
    int velocidadeAtual;


    //métodos - comportamento/ações
    void acelerar(){
        System.out.println("Acelerando...");
        velocidadeAtual = velocidadeAtual + 10;
        System.out.println("O carro acelerou! Velocidade atual: " + velocidadeAtual + " km/h");

    }

    void frear(){
        System.out.println("Freando...");
        velocidadeAtual = velocidadeAtual - 10;
        System.out.println("O carro freou! Velocidade atual: " + velocidadeAtual + " km/h");
    }


}
