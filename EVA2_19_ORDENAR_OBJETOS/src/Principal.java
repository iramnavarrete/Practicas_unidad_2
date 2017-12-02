 
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {
    
    //*Por edad, salario,sexo
    //*Apellido - edad 
    //Hernandez - 15
    //Hernandez - 30
    //Hernandez - 60
    //Perez - 15
    //Zambia - 12
    //*Ordenar por apellido con todos lo caracteres
    //hernan
    //hernandez

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList <Persona> llpersonas = new LinkedList();
        llpersonas.add(new Persona("Iram", "Navarrete", 19, true, 1500));
        llpersonas.add(new Persona("José", "Pedroza", 19, false, 132400));
        llpersonas.add(new Persona("Erik", "Zuany", 20, true, 1134));
        llpersonas.add(new Persona("Dany", "Martinez", 18, false, 1546360));
        llpersonas.add(new Persona("Jesús", "Peña", 19, true, 1354667));
        //Agregue más personas iguales para el criterio de Apellido-Edad
        llpersonas.add(new Persona("Jesús", "Peña", 18, true, 1354667));
        llpersonas.add(new Persona("Jesús", "Peña", 20, true, 1354667));
        llpersonas.add(new Persona("Jesús", "Peña", 10, true, 1354667));
        llpersonas.add(new Persona("Jesús", "Peña", 5, true, 1354667));
        
        for (Persona llpersona : llpersonas) {
            System.out.println("Nombre: " + llpersona.getsNom() + "\n"+ 
                    "Apellido: "+llpersona.getsApe()+ "\n"+ 
                    "Edad: " + llpersona.getiEdad()+"\n"+ 
                    "Sexo: "+ llpersona.isbSexo() + "\n"+
                    "Salario: "+ llpersona.getdSal()+"\n");
            
        }
        Comparator cmCriterioOrden = new Comparator(){//Clase anónima //Ordenar por apellido primer caracter
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                String sApe1, sApe2;
                sApe1 = p1.getsApe();
                sApe2 = p2.getsApe();
                char c1,c2;
                c1 = sApe1.charAt(0);//Arreglo
                c2 = sApe2.charAt(0);//Arreglo
                return c1 - c2;
                
            }
            
        
        
        };
        Collections.sort(llpersonas, cmCriterioOrden);
        System.out.println("Por Apellido ---------------------");
        for (Persona llpersona : llpersonas) {
            System.out.println("Nombre: " + llpersona.getsNom() + "\n"+ 
                    "Apellido: "+llpersona.getsApe()+ "\n"+ 
                    "Edad: " + llpersona.getiEdad()+"\n"+ 
                    "Sexo: "+ llpersona.isbSexo() + "\n"+
                    "Salario: "+ llpersona.getdSal() + "\n");
        }
        
        Comparator cmCriterioEdad = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                int iEdad1;
                int iEdad2;
                iEdad1 = p1.getiEdad();
                iEdad2 = p2.getiEdad();
                return iEdad1 - iEdad2;
            }
        };
        Collections.sort(llpersonas, cmCriterioEdad);
        System.out.println("Por edad-------------------------");
        for (Persona llpersona : llpersonas) {
            System.out.println("Nombre: " + llpersona.getsNom() + "\n"+ 
                    "Apellido: "+llpersona.getsApe()+ "\n"+ 
                    "Edad: " + llpersona.getiEdad()+"\n"+ 
                    "Sexo: "+ llpersona.isbSexo() + "\n"+
                    "Salario: "+ llpersona.getdSal() + "\n");
        }
        
        Comparator cmCriterioSalario = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                double iSal1;
                double iSal2;
                iSal1 = p1.getdSal();
                iSal2 = p2.getdSal();
                return (int)(iSal1 - iSal2);
            }
        };
        Collections.sort(llpersonas, cmCriterioSalario);
        System.out.println("Por Salario ---------------------");
        for (Persona llpersona : llpersonas) {
            System.out.println("Nombre: " + llpersona.getsNom() + "\n"+ 
                    "Apellido: "+llpersona.getsApe()+ "\n"+ 
                    "Edad: " + llpersona.getiEdad()+"\n"+ 
                    "Sexo: "+ llpersona.isbSexo() + "\n"+
                    "Salario: "+ llpersona.getdSal() + "\n");
        }
        
        Comparator cmCriterioSexo = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                
                
                boolean bSexo;
                boolean bSexo2;
                
                bSexo = p1.isbSexo();
                bSexo2 = p2.isbSexo();
                int miEntero = bSexo ? 1 : 0;
                int miEntero2 = bSexo2 ? 1 : 0;
                return miEntero - miEntero2;
            }
        };
        Collections.sort(llpersonas, cmCriterioSexo);
        System.out.println("Por Sexo ---------------------");
        for (Persona llpersona : llpersonas) {
            System.out.println("Nombre: " + llpersona.getsNom() + "\n"+ 
                    "Apellido: "+llpersona.getsApe()+ "\n"+ 
                    "Edad: " + llpersona.getiEdad()+"\n"+ 
                    "Sexo: "+ llpersona.isbSexo() + "\n"+
                    "Salario: "+ llpersona.getdSal() + "\n");
        }

            Comparator cmCriterioApeEdad = new Comparator(){//Clase anónima //Ordenar por apellido primer caracter y edad
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                String sApe1, sApe2;
                sApe1 = p1.getsApe();
                sApe2 = p2.getsApe();
                char c1,c2;
                int iEdad,iEdad2;
                iEdad=p1.getiEdad();
                iEdad2=p2.getiEdad();
                c1 = sApe1.charAt(0);//Arreglo
                c2 = sApe2.charAt(0);//Arreglo
                return (c1 - c2)-(iEdad - iEdad2);
                
            }
            
        };
            
        Collections.sort(llpersonas, cmCriterioOrden);
        System.out.println("Por Apellido - Edad ---------------------");
        for (Persona llpersona : llpersonas) {
            System.out.println("Nombre: " + llpersona.getsNom() + "\n"+ 
                    "Apellido: "+llpersona.getsApe()+ "\n"+ 
                    "Edad: " + llpersona.getiEdad()+"\n"+ 
                    "Sexo: "+ llpersona.isbSexo() + "\n"+
                    "Salario: "+ llpersona.getdSal() + "\n");
        }
        
        
        Comparator cmCriterioApellidoFull = new Comparator(){
            @Override
            public int compare(Object t, Object t1) {
                Persona p1 = (Persona)t;
                Persona p2 = (Persona)t1;
                String sApe1;
                String sApe2;
                sApe1 = p1.getsApe();
                sApe2 = p2.getsApe();
                int iRes=0;
                int aux=0;
                while(aux < sApe2.length() && aux < sApe1.length()){
                    iRes = sApe1.charAt(aux) - sApe2.charAt(aux);
                    aux++;
                }
                return iRes;
            }
        };
        //No me quedó la neta
//        Collections.sort(llpersonas, cmCriterioOrden);
//        System.out.println("Por Apellido Full ---------------------");
//        for (Persona llpersona : llpersonas) {
//            System.out.println("Nombre: " + llpersona.getsNom() + "\n"+ 
//                    "Apellido: "+llpersona.getsApe()+ "\n"+ 
//                    "Edad: " + llpersona.getiEdad()+"\n"+ 
//                    "Sexo: "+ llpersona.isbSexo() + "\n"+
//                    "Salario: "+ llpersona.getdSal() + "\n");
//        }
    }
    
}

class Persona{
    private String sNom, sApe;
    private int iEdad;
    private boolean bSexo;
    private double dSal;

    public Persona(String sNom, String sApe, int iEdad, boolean bSexo, double dSal) {
        this.sNom = sNom;
        this.sApe = sApe;
        this.iEdad = iEdad;
        this.bSexo = bSexo;
        this.dSal = dSal;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public boolean isbSexo() {
        return bSexo;
    }

    public void setbSexo(boolean bSexo) {
        this.bSexo = bSexo;
    }

    public double getdSal() {
        return dSal;
    }

    public void setdSal(double dSal) {
        this.dSal = dSal;
    }
    
    
    
}