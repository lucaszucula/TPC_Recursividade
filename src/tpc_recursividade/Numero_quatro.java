
package tpc_recursividade;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Numero_quatro {
    

    /**
     * Metodo que serve para multiplicar os valores introduzidos
     *
     * @param n
     */
    private static int multiplicacao(int a, int b) {
        return (a == 1) ? b : b + multiplicacao(a-1, b);
    }

    /**
     * Metodo que serve para testar o metodo multiplicacao(int n)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza o primeiro numero :");
        int a = e.nextInt();
        System.out.print("Introduza o segundo numero :");
        int b = e.nextInt();

        System.out.println("O valor da multiplicacao e : " + multiplicacao(a,b));
    }
}

    
//    
//    static int multiplica( int a, int b){
//   if (b>1){
//   
//        return multiplica(a+a, b-1);}
//   
// return a;
//   
//        
//    }
//     
//    
//    public static void main(String[] args) {
//        System.out.println(Numero_quatro.multiplica(8000, 2));
//    }

