//Implementa un programa que imprima un saludo simple para el usuario, como se muestra abajo.
//$ ./hello
//hello, world

package src1.tareas;

public class hola_mundo {
	
	public static void main(String[] args)
	{
		verificador_entrada in = new verificador_entrada();
		
		String nom = in.getString("Cual es tu nombre?");		
						
			System.out.println("Hola, " + nom);  
		}
}
