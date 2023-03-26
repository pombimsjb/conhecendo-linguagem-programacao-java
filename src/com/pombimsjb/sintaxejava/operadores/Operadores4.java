package com.pombimsjb.sintaxejava.operadores;

public class Operadores4 {
    public static void main(String[] args) {
        int numero = 5;
        boolean variavel = true;
        //numero++;
        System.out.println("Incremento");
        System.out.println(++numero);
        System.out.println(numero);
        System.out.println("Decremento");
        System.out.println(numero --);
        System.out.println(numero);
        System.out.println("Operador");
        variavel = !variavel;//! utilizado para inverter o valor de uma variavel booleana
        //System.out.println(!variavel);
        System.out.println(variavel);
    }
}
