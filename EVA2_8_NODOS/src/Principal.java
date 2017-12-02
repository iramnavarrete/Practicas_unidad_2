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
        Nodo nObj1 = new Nodo();
        nObj1.iVal=100;
        
        Nodo nObj2 = new Nodo();
        nObj2.iVal=200;
        
        Nodo nObj3 = new Nodo();
        nObj3.iVal=300;
        
        //-------------
        //VINCULARLOS 
        //obj1->onj2->obj3
        nObj1.nSig= nObj2;
        nObj2.nSig= nObj3;
        //nObj1.nSig= nObj2;
        
        //Imprimir
        Nodo nMover=nObj1;
        while(nMover!=null){
            System.out.println(nMover.iVal);
            nMover = nMover.nSig;
        }
    }
    
}
    class Nodo{
        public int iVal;
        public Nodo nSig;
        
    }