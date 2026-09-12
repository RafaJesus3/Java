package aula2;

public class TelevisaoTeste {

    public static void main(String[] args){

        System.out.println(" --- Minha Televisão ---");

        //Criação do objeto de Televisão
        Televisao tv = new Televisao();


        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Cor: " + tv.getCor());
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligado: " + tv.getLigado());


        //Alterando os dados do objeto tv (forma direta)

        //tv.getCanal() = 30;
        tv.setCanal(6);
        //tv.getVolume() = 1000;
        tv.setVolume(-3);
        //tv.getLigado() = true;
        tv.setLigado(true);
        //tv.getMarca() = Sony;
        tv.setMarca("Sony");
        //tv.getCor() = Azul;
        tv.setCor("Azul");

        System.out.println("\n---------------------------------------------\n");

        System.out.println("ligando a TV");

        tv.setCanal(100);

        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Cor: " + tv.getCor());
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligado: " + tv.getLigado());

    }


}
