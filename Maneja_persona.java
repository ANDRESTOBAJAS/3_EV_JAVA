package Paquet3;

public class ManejaPersona {

	   public static void main(String[] args) {
	       // TODO Auto-generated method stub
	       Persona alumnos[];
	       alumnos=new Persona[3];
	       alumnos[0]=new Persona("Juan","Rodríguez","Garcia");
	       alumnos[1]=new Persona("Jorge","Galindo","Matinez");
	       alumnos[2]=new Persona("Mario","Sancho","Herrero");
	       for(int cont=0;cont<3;cont++) {
	           System.out.println("\n- "+alumnos[cont].getNombreCompleto());    
	           
	       }
	   }

	}
