package aula2;

/**
 * Encapsulamento
 * - private (Não acesso interno aos meus atributos) Faço acesso atrás de métodos.
 * - protected*
 * - public (
 */


public class Televisao {

    private int canal;
    private int volume;
    private boolean ligado;
    private String marca;
    private String cor;

    //Métodos de acesso e modificadores - getters() e setters()

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(ligado){
            if (canal >= 0 && canal <= 500){
                this.canal = canal;
                System.out.println("Canal alterado para " + this.canal);

            }else{
                System.out.println("[Erro]: Canal inválido!");
            }
        }else{
            System.out.println("[AVISO]: A TV está desligada!");
        }

        }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        //Regra de negócio / Validação -> Aqui...
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }




    public void setLigado(boolean ligado) {
        //Regra de negócio / Validação -> Aqui...
        this.ligado = ligado;
    }

    public String getMarca(){
        return marca;

    }

    public void setMarca(String marca) {
        //Regra de negócio / Validação -> Aqui..
        this.marca = marca;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor) {
        //Regra de negócio / Validação -> Aqui...
        this.cor = cor;
    }


    public void ligar(){
        this.ligado = !this.ligado;
        if (ligado){
            System.out.println(">>> TV Ligada!");
        }else{
            System.out.println(">>> TV Desligada!");
        }

    }

}
