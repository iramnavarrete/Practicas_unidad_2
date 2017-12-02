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
        if (parentesisAnidados("(((((((((((((((((((((())))))))))))))))))))))")==true) {
            System.out.println("Los paréntesis son anidados.");
        }else{
            System.out.println("Los paréntesis no son anidados.");
        }
    }
    
    static int i=0;
    public static boolean parentesisAnidados(String palabra){
        if (palabra.length()>=i) {
            if (i<palabra.length()) {
                if (palabra.charAt(i)=='(' && palabra.charAt(palabra.length()-1)==')') {
                    return parentesisAnidados(palabra.substring(i+1, palabra.length()-1));
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}