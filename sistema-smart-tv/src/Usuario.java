public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        //TV LIGADA OU DESLIGA
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        //CANAL
        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);
        
        //VOLUME
        //Apertando o botão de diminuir volume 03 vezes
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        //Apertando o botão de aumentar volume 01 vez
        smartTv.aumentarVolume();

        System.out.println("Volume Atual : " + smartTv.volume);

    }
}
