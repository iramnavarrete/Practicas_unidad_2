/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IramN
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra="qqquuuiiiieeerrrrrooooo     ppppaaaaassssaaaaarrrrr!!!!!!!!!!";
        /*El método no me regresaba el ultimo caracter repetido,´por lo que se le agregan estos espacios para que
        *si regrese la cadena completa
        */
        String espacio="   ";
        String palabra2=palabra+espacio;
        System.out.println(limpiarCadena(palabra2));
    }
    
    static int i=0;
    public static String limpiarCadena(String palabra){
        if (i<palabra.length() && palabra.length()>1) {
            if (palabra.charAt(i)==palabra.charAt(i+1)) {
                return limpiarCadena(palabra.substring(i+1));
            }
            else if(palabra.length()>2){
                return palabra.charAt(i)+limpiarCadena(palabra.substring(i+1));
            }
            else{
                return limpiarCadena(palabra.substring(palabra.length()));
            }
        }else{
            return "";
        }
        
        
    }
}
