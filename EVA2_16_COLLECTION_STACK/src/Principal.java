
import java.util.Stack;

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
        // TODO code application logic here
        Stack <Double> stMiPila = new Stack();
        stMiPila.push(10.0);
        stMiPila.push(20.0);
        stMiPila.push(30.0);
        stMiPila.push(40.0);
        stMiPila.push(50.0);
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.pop());
        System.out.println("peek"+stMiPila.peek());
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());
    }
    
}
