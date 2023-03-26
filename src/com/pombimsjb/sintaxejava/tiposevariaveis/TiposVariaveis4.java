package com.pombimsjb.sintaxejava.tiposevariaveis;

public class TiposVariaveis4 {
    public static void main(String[] args) throws Exception {
        /*
         * esta linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */
        int numero = 5;
    String meuNome = "Giancarlo Molinari";
        /*
         * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;

        System.out.print(numero);

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor;
         * logo a linha 25 vai apresentar um erro de compilação
         * isso é considerado uma CONSTANTE na linguagem Java
         */
        final double VALOR_DE_PI = 3.14;

        //VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
    }
}
