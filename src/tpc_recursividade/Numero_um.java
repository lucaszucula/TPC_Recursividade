
package tpc_recursividade;

/**
 *
 * @author Lucas
 */
public class Numero_um {

    /**
     * @param args the command line arguments
     */
    static int factorial(int n){
        if ((n==1||n==0)){
        return 1;
        
        }else if(n<0){
        
       // return String mensagem=Integer.parseInt(n);
        }
                return n*factorial(n-1);
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println(Numero_um.factorial(6));
    }
    
}
