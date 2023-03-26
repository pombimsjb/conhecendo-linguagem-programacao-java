package com.pombimsjb.sintaxejava.operadores;

public class Operadores6 {
   /* == Quando desejamos verificar se uma variável é IGUAL A outra.
    != Quando desejamos verificar se uma variável é DIFERENTE da outra.
     > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    < Quando desejamos verificar se uma variável é MENOR QUE outra.
    <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra*/

    public static void main(String[] args) {
        String nomeUm = "Giancarlo";
        String nomeDois="Giancarlo";
        System.out.println(nomeUm==nomeDois);
        //Para Comparar conteudo dos objetos utiliza o equals
        String sobrenomeUm = "Molinari";
        String sobrenomeDois = new String("Molinari");
        System.out.println(sobrenomeUm.equals(sobrenomeDois));




        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a numeroDois?" + simNao);
        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente de numeroDois?" + simNao);
        simNao = numero1 > numero2;
        System.out.println("NumeroUm é maior que o numeroDois?" + simNao);
        simNao = numero1 < numero2;
        System.out.println("NumeroUm é menor que o numeroDois?" + simNao);
        if(numero1<numero2){
            System.out.println("a nossa condição é verdadeira");
        }
    }
}
