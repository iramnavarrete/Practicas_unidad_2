
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IramN
 */
public class Principal {

    
    public static void main(String[] args) {
        Arbol arMiArbol = new Arbol();
        try {
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            arMiArbol.agregarNuevoNodo(new Nodo((int)(Math.random()*1000+1)));
            //arMiArbol.agregarNuevoNodo(new Nodo(80));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("PreOrder:");
        arMiArbol.imprimirPreOrder();
        System.out.println("");
        System.out.println("InOrder:");
        arMiArbol.imprimirInOrder();
        System.out.println("");
        System.out.println("PostOrder:");
        arMiArbol.imprimirPostOrder();
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el valor a buscar: ");
        int iVal = sc.nextInt();
        String s="";
        if (arMiArbol.buscar(iVal)==true) {
            s=" se encuentra";
        }else{
            s=" no se encuentra";
        }
        System.out.println("El valor "+iVal+s);
    }

}

class Nodo {

    private int iVal;
    private Nodo nIzq;
    private Nodo nDer;

    public Nodo(int iVal) {
        this.iVal = iVal;
        nIzq = null;
        nDer = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }

    public Nodo getnDer() {
        return nDer;
    }

    public void setnDer(Nodo nDer) {
        this.nDer = nDer;
    }

}

class Arbol {

    private Nodo nRoot;

    public Arbol() {
        nRoot = null;
    }

    public void agregarNuevoNodo(Nodo nNodo) throws Exception {
        agregarNodo(nNodo, nRoot);
    }

    public void agregarNodo(Nodo nNodo, Nodo nActual) throws Exception {
        if (nRoot == null) {
            nRoot = nNodo;
        } else {
            if (nNodo.getiVal() < nActual.getiVal()) {//Menor
                if (nActual.getnIzq() == null) {//Posición vacía (null) aquí va
                    nActual.setnIzq(nNodo);
                } else {
                    agregarNodo(nNodo, nActual.getnIzq());
                }
            } else if (nNodo.getiVal() > nActual.getiVal()) {//Mayor
                if (nActual.getnDer() == null) {//Posición vacía (null) aquí va
                    nActual.setnDer(nNodo);
                } else {
                    agregarNodo(nNodo, nActual.getnDer());
                }
            } else {//Valores iguales (No aceptamos valores repetidos)
                throw new Exception("No se aceptan valores repetidos");
            }
        }
    }

    public void imprimirPreOrder() {
        impPO(nRoot);
    }

    public void impPO(Nodo nActual) {
        if (nActual != null) {
            System.out.print(nActual.getiVal() + "-"); //Visitar el nodo
            impPO(nActual.getnIzq());//Recorrer lado izquierdo
            impPO(nActual.getnDer());//Recorrer lado derecho
        }
    }

    public void imprimirInOrder() {
        impIO(nRoot);
    }

    public void impIO(Nodo nActual) {
        if (nActual != null) {
            impIO(nActual.getnIzq()); //Recorrer lado izquierdo
            System.out.print(nActual.getiVal() + "-"); //Visitar nodo
            impIO(nActual.getnDer()); //Recorrer lado derecho
        }
    }

    public void imprimirPostOrder() {
        impPOS(nRoot);
    }

    public void impPOS(Nodo nActual) {
        if (nActual != null) {
            impPOS(nActual.getnIzq()); //Recorrer lado izquierdo
            impPOS(nActual.getnDer()); //Recorrer lado derecho
            System.out.print(nActual.getiVal() + "-"); //Visitar nodo
        }
    }
    
    public boolean buscar(int iVal){
        Nodo nActual = nRoot;
        while(nActual!=null){
            if(nActual.getiVal() == iVal){
                return true;
            }else if(iVal < nActual.getiVal()){
                nActual = nActual.getnIzq();
            }else{
                nActual = nActual.getnDer();
            }
        }
        return false;
    }
}