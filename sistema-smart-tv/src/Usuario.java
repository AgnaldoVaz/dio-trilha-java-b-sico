public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status : Tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status : Tv ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume Atual " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println("Canal Atual " + smartTv.canal);

        smartTv.mudarCanal(11);
        System.out.println("Canal Atual " + smartTv.canal);

    }
}
