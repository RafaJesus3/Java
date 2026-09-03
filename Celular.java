package aula0;

public class Celular {


    String marca;
    int modelo;

    void ligar(){
        System.out.println("Ligando...");
    }

    void desligar(){
        System.out.println("Desligando...");
    }


    //teste
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.ligar();
        c1.marca = "Motorola";
        c1.modelo = 21;
        System.out.println(c1.marca);
        System.out.println(c1.modelo);
        c1.desligar();

        Celular c2 = new Celular();
        c2.ligar();
        c2.marca = "Iphone";
        c2.modelo = 17;
        System.out.println(c2.marca);
        System.out.println(c2.modelo);
        c2.desligar();

    }

}
