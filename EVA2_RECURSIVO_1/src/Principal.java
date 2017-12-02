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
        int num=1512;
        System.out.println("La suma de los digitos "+num+ " es: "+sumaDigitos(num));
    }
    public static int sumaDigitos(int iNum){
        if (iNum==0)
		return 0;
	else
		return ((iNum%10) + sumaDigitos(iNum/10));
        
    }
}
