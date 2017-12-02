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
        // TODO code application logic here
        System.out.println(quitaX("xPxrxxxxoxfxe xpoxngaxme 1x00 Ok nxo jaxjaxjax"));
        
    }
    static int i = 0;
    public static String quitaX(String palabra){
        if (i<palabra.length()) {
            if (palabra.charAt(i)=='x') {
                return quitaX(palabra.substring(i+1));
            }
            else{
                return palabra.charAt(i)+quitaX(palabra.substring(i+1));
            }
        }else{
            return "";
        }
        
        
    }
}
