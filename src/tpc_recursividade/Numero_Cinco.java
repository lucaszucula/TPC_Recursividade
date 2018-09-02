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
public class Numero_Cinco {
    
    
    

    /**
     * Metodo que serve para converter para binario o numero introduzido
     *
     * @param n
     */
    private static String conversor(int n) {
        String a = "";
        return (n == 0) ? a.trim() : a.concat(conversor(n/2) + (n % 2));
    }

    /**
     * Metodo que serve para testar o metodo conversor(int n)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza um numero inteiro :");

        System.out.println("O valor em binario e :" + conversor(e.nextInt()));
    }
}

//    
//    static int convertebinario(int n){
//    if (n!=0)
//       n=n% 2;
//       int m=n/2;
//        return convertebinario(m);
//        
//        }
//    public static void main(String[] args) {
//        System.out.println(Numero_Cinco.convertebinario(2));
//       }
//    }
//    

