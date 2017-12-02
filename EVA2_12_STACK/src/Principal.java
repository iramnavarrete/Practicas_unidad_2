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
        Stack stack = new Stack();
        stack.push(new Nodo((int)(Math.random()*100+1)));
        stack.push(new Nodo((int)(Math.random()*100+1)));
        stack.push(new Nodo((int)(Math.random()*100+1)));
        stack.push(new Nodo((int)(Math.random()*100+1)));
        stack.push(new Nodo((int)(Math.random()*100+1)));
        
        
        stack.imprimirElementos();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("");
        stack.imprimirElementos();
        
        System.out.println("");
        stack.peek();
        stack.imprimirElementos();
        
//        stack.push(new Nodo(90));
    }
    
}

class Nodo{
    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;

    
    public Nodo(){
        iVal = 0;
        nPrev = null;
        nSig = null;
    }
    public Nodo(int iNum){
        iVal=iNum;
        nPrev = null;
        nSig = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
}
class Stack{
    Nodo nIni;
    Nodo nFin;
    
    public Stack(){
        nIni=null;
        nFin=null;
    }
    public Stack(Nodo nNodo){
        nIni = nNodo;
        nFin = nNodo;
    }
    
    public void imprimirElementos(){
        if (nIni == null) {
            System.out.println("La lista está vacía");
        }else{
            Nodo nTemp = nIni;
        while(nTemp != null){
            System.out.print(nTemp.getiVal()+" - ");
            nTemp = nTemp.getnSig();
        }
        }
    }
    
    public int contarElementos(){
        Nodo nTemp= nIni;
    if(nIni== null){
            return 0;
        }else{
        int iCont=0;
            while(nTemp != null){
                iCont++;
                nTemp= nTemp.getnSig();
                
            }return iCont;
            
        }
    }
    
    public void push(Nodo nNodo){
        if (nIni == null) {//LISTA VACIA
            nIni = nNodo;
            nFin = nNodo;
        }else{
            nFin.setnSig(nNodo);//Que apunte al final
            nNodo.setnPrev(nFin);//que el que era antes fin ahora es el previo apunte al ultimo
            nFin = nNodo; //el nfin es igual al nodo que pusimos
        }
    }
    
    public void pop(){
        if (nIni!=null) {
            nFin.getnPrev().setnSig(null);
            nFin=nFin.getnPrev();
        }
    }
    
    public void peek(){
        if (nIni!=null) {
            nIni=nFin.getnPrev();
        }
    }
}