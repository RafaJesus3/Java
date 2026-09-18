package aula3;

public class TestePersonagem {

    public static void main (String[] args){

        //1. Criar um objeto usando o construtor padrão (default)

        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();

//        System.out.println("Dados do objeto p1: ");
//        System.out.println("Nome: " + p1.getNome());
//        System.out.println("Nivel: " + p1.getNivel());
//        System.out.println("Vida: " + p1.getVida());

        p1.exibirInfo();

        System.out.println("\n---------------------------------------------\n");

//        System.out.println("Dados do objeto p2: ");
//        System.out.println("Nome: " + p2.getNome());
//        System.out.println("Nivel: " + p2.getNivel());
//        System.out.println("Vida: " + p2.getVida());

        p2.exibirInfo();

        System.out.println("\n---------------------------------------------\n");


        //2. Usando o construtor parametrizado

        Personagem p3 = new Personagem("Aragorn", 10);
        Personagem p4 = new Personagem("Legolas", 10);

//        System.out.println("Dados do objeto p3: ");
//        System.out.println("Nome: " + p3.getNome());
//        System.out.println("Nivel: " + p3.getNivel());
//        System.out.println("Vida: " + p3.getVida());

        p3.exibirInfo();

        System.out.println("\n---------------------------------------------\n");

//        System.out.println("Dados do objeto p4: ");
//        System.out.println("Nome: " + p4.getNome());
//        System.out.println("Nivel: " + p4.getNivel());
//        System.out.println("Vida: " + p4.getVida());

        p4.exibirInfo();
    }
}
