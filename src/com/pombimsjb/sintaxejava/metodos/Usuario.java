package com.pombimsjb.sintaxejava.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual é o: " + smartTv.canal);
        System.out.println("O VOlume atual é: " + smartTv.volume);

        System.out.println("\nApós apertar o botão de liga/desliga do controle: ");
        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        //Método para trocar o volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Após ajustar o volume atual é: "+smartTv.volume);
        //Método para mudar o canal
        smartTv.mudarCanal(13);
        System.out.println("\nUsuário mudou para o canal "+smartTv.canal);




        System.out.println("\nApós apertar o botão de liga/desliga do controle novamente: ");
        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
    }
}
