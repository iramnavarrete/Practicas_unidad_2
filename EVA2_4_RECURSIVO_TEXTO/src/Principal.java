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
        System.out.println(limpiarCadena("yyycccbbb"));
        
    }
    
    static int i=0;
    
    public static String limpiarCadena(String palabra){
        
        if (i<palabra.length()) {
            if (palabra.charAt(i)==palabra.charAt(i+1)) {
                return palabra.charAt(i+1)+limpiarCadena(palabra.substring(i+2));
        }else{
                return palabra.charAt(i)+limpiarCadena(palabra.substring(i+1));
            }
            
        }else{
            return "";
        }
    }
}
