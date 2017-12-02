/*
PROGRAMA QUE EXPLICA COMO FUNCIONAN LAS LISTAS
 */
package Principal;

/**
 *
 * @author 16550506
 */
public class EVA2_9_Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Lista miLista = new Lista();
        //miLista.agregarNodo(new Nodo(15));
        //miLista.imprimirNodo();
        //System.out.println("");
        /*miLista.agregarNodo(new Nodo(30));
        miLista.imprimirNodo();
        System.out.println("");
        miLista.agregarNodo(new Nodo(45));
        miLista.imprimirNodo();
        System.out.println("");
        miLista.agregarNodo(new Nodo(75));
        miLista.imprimirNodo();
        System.out.println("");
        miLista.vaciarLista();
        miLista.imprimirNodo();
        System.out.println("");*/
        for (int i = 0; i < 10; i++) {
            miLista.agregarNodoMejorado(new Nodo((int)(Math.random()*1000+1)));
            
        }
        miLista.imprimirNodo();
        System.out.println("");
        miLista.contarElementos();
        System.out.println("Cantidad de elementos: "+miLista.contarElementos());
        System.out.println("El elemento en la posición 5 es: "+miLista.valorEn(5));
        
        System.out.println("Insertar Nodo 9999 en la pocisión 0");
        miLista.insertareN(0, new Nodo(9999));
        miLista.imprimirNodo();
        System.out.println("");
        System.out.println("Insertar Nodo 9999 en la pocisión 5");
        miLista.insertareN(5, new Nodo(9999));
        miLista.imprimirNodo();
        System.out.println("");
        
        System.out.println("Eliminar Nodo 9999 en la pocisión 5");
        miLista.eliminarEn(5);
        miLista.imprimirNodo();
        System.out.println("");
        
        System.out.println("¿La lista tiene elementos?");
        miLista.esVacio();
        miLista.impEsVacio();
    }
    
}
class Nodo{
    private int iVal;
    private Nodo nSig;
    
    public Nodo(){//CONSTRUCTOR POR DEFAULT
        iVal=0;
        nSig= null;
    }
    public Nodo(int iValor){
        iVal=iValor;
        nSig= null;
    }
    public Nodo(int iVal, Nodo nod){
        iVal=iVal;
        nSig= nod;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
}

class Lista{
    private Nodo nIni;
    private Nodo nFin;
    public Lista(){
        nIni=null;
        nFin=null;
    }
    public Lista(Nodo nNodo){
        nIni=nNodo;
        nFin=nNodo;
    }
    //AGREGAR NODO SIEMPRE LO PONE AL FINAL DE LA LISTA
    public void agregarNodo(Nodo nNodo){//NO VOLVER A USAR JAMÀS!!!!
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp= nIni;
        if(nIni== null){
            nIni= nNodo;//SOLO CUANDO LAS LISTA ESTA VACIA
        }else{
            while(nTemp.getnSig() != null){
                nTemp= nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }
    }
    //IMPRIMIR NODO
    public void imprimirNodo(){
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp= nIni;
        if(nIni== null){
            System.out.println("La lista esta vacia");
        }else{
            while(nTemp != null){
                System.out.print(nTemp.getiVal() + " - ");
                nTemp= nTemp.getnSig();
            }
            
        }
    }
    //VACIAR LA LISTA--> AL MENOS EN JAVA nIni SE ASIGNA NULL Y SE ELIMINA
    public void vaciarLista(){
        nIni=null;
        nFin=null;
    }
    public void agregarNodoMejorado(Nodo nNodo){
        if(nIni== null){
            nIni= nNodo;//SOLO CUANDO LAS LISTA ESTA VACIA
            nFin=nNodo;
        }else{
        nFin.setnSig(nNodo);
        nFin=nNodo;
        }
    }
    
    //CONTAR LOS ELEMENTOS DE UNA LISTA
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
    
    public int valorEn(int iPos) throws Exception{
        //VERIFICAR QUE EL VALOR INGRESADO SEA MENOR AL TAMAÑO DE LA LISTA
        int iVal=0;
        if (iPos<contarElementos() && iPos>0) {
            Nodo nTemp= nIni;
    if(nIni== null){
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
        
    }public void insertareN(int iPos,Nodo nNodo) throws Exception{
            if (iPos>=0 && iPos<contarElementos()) {
        //INSERTAR AL INICIO DE LA LISTA
            if (iPos==0) {
                nNodo.setnSig(nIni);
                nIni=nNodo;
                
            }else{//INSERTAR EN CUALQUIER POSICION EXCEPTO AL FINAL
                Nodo nTemp = nIni;
                for (int i = 0; i < (iPos-1); i++) {
                    nTemp = nTemp.getnSig();
                }
                nNodo.setnSig(nTemp.getnSig());
                nTemp.setnSig(nNodo);
            }
    }else{
                throw new Exception("La posición no es válida");
            }
    }
    
    //Eliminar un valor en la lista
    public void eliminarEn(int iPos){
        
        if (iPos==0) {
            nIni=nIni.getnSig();
        }else{
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos-1; i++) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nTemp.getnSig().getnSig());
            
        }
    }
    
    
    // buscar el primer valor, vacio, si la lista tiene valores regresar true y si no regresar false
    public boolean esVacio(){
        if (nIni==null) {
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