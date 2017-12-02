
import java.util.Collections;
import java.util.LinkedList;

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
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("JOSE");
        llMiLista.add(" ");
        llMiLista.add("CARLOS");
        llMiLista.add(" ");
        llMiLista.add(" ");
        llMiLista.add("HERMOSO");
        for (String string : llMiLista) {
            System.out.print(string);
        }
        Collections.sort(llMiLista);
        
        for (String string : llMiLista) {
            System.out.print(string);
        }
    }
    
}
