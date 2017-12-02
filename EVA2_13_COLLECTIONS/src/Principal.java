
import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList <Integer> alMiArrayList = new ArrayList();
        alMiArrayList.add(100);//0
        alMiArrayList.add(200);//1
        alMiArrayList.add(300);//2
        alMiArrayList.add(400);//3
        alMiArrayList.add(500);//4
        
        for (Integer integer : alMiArrayList) {
            System.out.print(integer + " - ");
        }
        alMiArrayList.add(2, 999);
        System.out.println("");
        for (Integer integer : alMiArrayList) {
            System.out.print(integer + " - ");
        }
        //Recorrer un collection de iteradores
        ////como lo de las listas
        System.out.println("\nIterator");
        Iterator itRecorreArreglo = alMiArrayList.iterator();
        while(itRecorreArreglo.hasNext()){//Si hay un nodo siguiente se sigue moviendo ( true or false )
            System.out.print(itRecorreArreglo.next() +" - " );
        }
    }
    
}
