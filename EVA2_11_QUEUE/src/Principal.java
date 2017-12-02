
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Queue qFila = new Queue();
        try {
            System.out.println(qFila.leerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        qFila.agregarNodo(new Nodo(100));
        qFila.agregarNodo(new Nodo(200));
        qFila.agregarNodo(new Nodo(300));
        qFila.agregarNodo(new Nodo(400));
        try {
            System.out.println(qFila.leerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFila.removerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFila.removerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFila.removerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFila.removerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFila.removerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

class Queue{
    Nodo nIni;
    Nodo nFin;
    
    public Queue(){
        nIni=null;
        nFin=null;
    }
    public Queue(Nodo nNodo){
        nIni = nNodo;
        nFin = nNodo;
    }
    public void agregarNodo(Nodo nNodo){//AGREGAR UN NODO A LA LISTA AL FINAL
        if (nIni == null) {//LISTA VACIA
            nIni = nNodo;
            nFin = nNodo;
        }else{
            nFin.setnSig(nNodo);//Que apunte al final
            nNodo.setnPrev(nFin);//que el que era antes fin ahora es el previo apubnte al ultimo
            nFin = nNodo; //el nfin es igual al nodo que pusimos
        }
    }
    
    
    public int leerPrimerNodo() throws Exception{
        int iVal;
        if (nIni == null) {
            throw new Exception("La lista está vacia");
            
        }else{
            iVal = nIni.getiVal();
            
        }
        return iVal;
    }
    
    public int removerPrimerNodo() throws Exception{
        
        
        int iVal;
        if (nIni == null) {
            throw new Exception("La lista está vacía");
            
        }else{
            iVal = nIni.getiVal();
            //Eliminar el primer nodo de la lista
            //Verificar cantidad de nodos
            //Si solo hay un nodo nIni=null y nFin = null
            if (nIni.getnSig()==null) {
                nIni = null;
                nFin = null;
            }else{
                //Si hay mas nodos, reconectar
                nIni = nIni.getnSig();//
                nIni.setnPrev(null);
            }
            
        }
        return iVal;
    }
}
