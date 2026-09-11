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

    //Métodos de acesso e modificadores - getters() e setters()

    public int getCanal() {
        return canal;
    }

    public void setCanal(int volume) {
        //Regra de negócio / Validação -> Aqui...
        this.canal = canal;


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

}
