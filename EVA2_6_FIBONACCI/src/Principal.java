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
        
        for (int i = 0; i < 9; i++) {
            System.out.print(fibonacci(i)+" - ");
        }
    }
    
        public static int fibonacci(int iNum){
            if (iNum==0) {
                return 0;
            }
            if (iNum==1) {
                return 1;
            }
            else{
                return fibonacci(iNum-1)+fibonacci(iNum-2);
            }
        }
}
