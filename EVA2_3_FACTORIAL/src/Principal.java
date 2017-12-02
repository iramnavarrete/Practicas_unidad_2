/*
FACTORIAL DE UN NUMERO CON RECURSIVIDAD
 */

/**
 *
 * @author 16550518
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = "+ factorial(5));
    }
    
    public static int factorial(int iVal){
        if(iVal>0){
            return iVal * factorial(iVal-1);
        }else{
            return 1;
        }
    }
}
