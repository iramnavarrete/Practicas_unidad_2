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
        
        ListaDE miLista = new ListaDE();
        miLista.imprimirElementos();
        for (int i = 0; i < 10; i++) {
            miLista.agregarNodo(new Nodo((int)(Math.random()*100)+1));
        }
        System.out.println("Lista incial: ");
        miLista.imprimirElementos();
        System.out.println("");
        
        System.out.println("Lista inversa: ");
        miLista.imprimirElementosInv();
        System.out.println("");
        
        System.out.println("Insertar 99 en la pocisión 8:");
        miLista.insertareN(8, new Nodo(99));
        miLista.imprimirElementos();
        System.out.println("");
        
        System.out.println("Eliminar valor en la pocisión 8:");
        miLista.eliminarEn(8);
        miLista.imprimirElementos();
        System.out.println("");
        
        System.out.println("¿La lista tiene elementos?");
        miLista.esVacio();
        miLista.impEsVacio();
        System.out.println("");
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

class ListaDE{
    Nodo nIni;
    Nodo nFin;
    
    public ListaDE(){
        nIni=null;
        nFin=null;
    }
    public ListaDE(Nodo nNodo){
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
    
    public void imprimirElementosInv(){
        if (nIni == null) {
            System.out.println("La lista está vacía");
        }else{
            Nodo nTemp = nFin;
        while(nTemp != null){
            System.out.print(nTemp.getiVal()+" - ");
            nTemp = nTemp.getnPrev();
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
    
    public void vaciarLista(){
        nIni=null;
        nFin=null;
    }
    
    public int valorEn(int iPos) throws Exception{
        //VERIFICAR QUE EL VALOR INGRESADO SEA MENOR AL TAMAÑO DE LA LISTA
        int iVal=0;
        if (iPos<contarElementos() && iPos>0) {
            Nodo nTemp= nIni;
    if(nIni == null){
            return 0;
        }else{
            for (int i = 0; i < iPos; i++) {
            nTemp = nTemp.getnSig();
        }
                
            }
            iVal=nTemp.getiVal();
        
        
        }else{
            throw new Exception("La posición no es válida");
        }return iVal;
        
    }
    
    public void insertareN(int iPos,Nodo nNodo){
            if (iPos<contarElementos() && iPos>=0) {
            //INSERTAR AL INICIO DE LA LISTA
                if (iPos==0) {
                nNodo.setnSig(nIni);
                nIni=nNodo;
                
            }else{//INSERTAR EN CUALQUIER POSICION EXCEPTO AL FINAL
                Nodo nTemp = nIni;
                for (int i = 0; i < (iPos); i++) {
                    nTemp = nTemp.getnSig();
                }
                nNodo.setnPrev(nTemp.getnPrev());
                nNodo.setnSig(nTemp);
                nTemp.getnPrev().setnSig(nNodo);
                nTemp.setnPrev(nNodo);
            }
        }else{
                System.out.println("La posición no es válida");
            }
    }
    
    public void eliminarEn(int iPos){
        
        if (iPos==0) {
            nIni=nIni.getnSig();
        }else{
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos-1; i++) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nTemp.getnSig().getnSig());
            nTemp.setnPrev(nTemp.getnPrev().getnPrev());
            
            
        }
    }
    
    public boolean esVacio(){
        if (nIni==null && nFin==null) {
            return false;
        }else{
            return true;
        }
    }
    
    public void impEsVacio(){
        if (esVacio()==true) {
            System.out.println("Si, la lista tiene elementos");
        }else{
            System.out.println("No, la lista no tiene elementos");
        }
    }
}