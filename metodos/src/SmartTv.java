public class SmartTv {
    // Ela tenha as características: ligada (boolean), canal (int) e volume (int);
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }

    // Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    // Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
