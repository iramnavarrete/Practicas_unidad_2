/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        System.out.println(potencia(4, 4));
    }
    
    public static int potencia(int iNum,int pot){
        if (pot==1) {
            return iNum;
        }
        else{
            return iNum*potencia(iNum, pot-1);
        }
    }
}
