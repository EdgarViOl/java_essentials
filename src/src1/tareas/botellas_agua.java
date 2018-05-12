//Implementa un programa que reporte el uso de agua de un usuario que dura x minutos en la 
//ducha expresado en botellas de agua.
//$ ./botellas_agua
//Minutos: 1
//Botellas: 12

//$ ./botellas_agua
//Minutos: 10
//Botellas: 120

package src1.tareas;

public class botellas_agua {
	
	public static void main(String [] args)
	{
		verificador_entrada in = new verificador_entrada();
		
		double min = in.getDouble("Cuantos minutos duraste en la ducha?");
		
		double b = min*12;
					
			System.out.println("Desperdiciaste  " +b+ " bottellas de agua");  
		}
}