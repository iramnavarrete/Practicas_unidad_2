/*
PROGRMA QUE EXPLICA LA RECURSIVIDAD
 */

/**
 *
 * @author 16550506
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     stackOverFlowRecursivo();//RECURSIVO
       
    }
    
       public static void stackOverFlowRecursivo(){
            System.out.println("Hola");
            stackOverFlowRecursivo();
        }
}
