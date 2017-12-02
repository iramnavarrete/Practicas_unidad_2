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
        // TODO code application logic here
        int[] aiDatos = new int[3];
        aiDatos[0]=100;
        aiDatos[1]=129;
        aiDatos[2]=413;
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
        }
        int [] aiDatosCopia = new int[3];
        int i=0;
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
            aiDatosCopia[i]=aiDato;
            i++;
        }
        aiDatos = new int[4];
        for (int j = 0; j < aiDatosCopia.length; j++) {
            aiDatos[j]= aiDatosCopia[j];
        }
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
        }
    }
    
}
