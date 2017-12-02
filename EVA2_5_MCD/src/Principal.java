/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dividendo=560;
        int divisor=98;
            System.out.println("el mcd de " +dividendo +" y "+ divisor +" es "+ maximoComun(dividendo,divisor));
        
    }
    
    public static int maximoComun(int dividendo, int divisor){
        
        if (divisor==0) {
            return dividendo;
        }else{
            int res=dividendo%divisor;
            return maximoComun(divisor, res);
            
        }
    }
}
