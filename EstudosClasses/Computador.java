package EstudosClasses;

public class Computador {

    private String marcaProcessador;
    private String processador;
    private int memoriaRam;
    private boolean status;
    private int hertz;
    public String placaDeVideo;


    public String getMarcaProcessador() {
        return marcaProcessador;
    }

    public void setMarcaProcessador(String marcaProcessador) {
        this.marcaProcessador = marcaProcessador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;

    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getHertz() {
        return hertz;
    }

    public void setHertz(int hertz) {
        this.hertz = hertz;

    }

    public String getPlacaDeVideo(){
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo){
        this.placaDeVideo = placaDeVideo;
    }

    public void ligar() {
        if (status) {
            System.out.println("⏻O computador já está ligado⏻");
        } else {
            status = true;
            System.out.println("⏻Computador ligado⏻");
        }

    }

    public void desligar() {
        if (status) {
            System.out.println("⏾Computador desligado⏾");
            status = false;
        } else {
            System.out.println("⏾O computador já está desligado⏾");
        }
    }

    public void specs(){
        if(status){
            System.out.println("Processador: " + processador);
            System.out.println("Memória ram: " + memoriaRam);
            System.out.println("Placa de Video: " + placaDeVideo);
            System.out.println("Frequência: " + hertz + " Hz");
        }else{
            System.out.println("Ligue o computador para ver suas especificações");
        }

    }

    public void abrirJogo(){
        if(status){
            if(memoriaRam < 16){
                System.out.println("Memória Insuficiente");
            }else{
                System.out.println("Jogo iniciado");
            }
        }else{
            System.out.println("Ligue o computador primeiro");
        }
    }

    public void instalarMemoriaRam(int quantidade) {
        if(status){
            System.out.println("Desligue o computador para instalar memória");
        }else
        if (quantidade > 0) {
            memoriaRam = memoriaRam + quantidade;
        }else{
            System.out.println("Quantidade de memoria invalida");

        }

    }



}