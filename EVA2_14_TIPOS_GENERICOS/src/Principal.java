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
        Nodo <Double> nMiNodo = new Nodo(100.2);
        nMiNodo.setValor(55.1);
        System.out.println(nMiNodo.getValor());
    }
    
}
class Nodo <T>{
    private T valor;
    private Nodo nSig;
    private Nodo nPrev;
    Nodo(T nuevoValor){
        nSig = null;
        nPrev = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
    
}