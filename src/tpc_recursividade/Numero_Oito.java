/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc_recursividade;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Numero_Oito {
    
    /**
     * Metodo que serve para retornar todas as combinacoes da substring do numero introduzido
     *
     * @param n
     */
    private static String letras(int n) {
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nova = a.substring(0, n);
        return nova.concat(",").concat(new StringBuilder(nova).reverse().toString());
    }

    /**
     * Metodo que serve para testar o metodo letras(int n)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza um numero limite :");

        System.out.println("O valor em binario e : " + letras(e.nextInt()));
    }
}

    

