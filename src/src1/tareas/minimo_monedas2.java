package src1.tareas;

public class minimo_monedas2 {
	public static void main(String[] args) {
		double cant=.40;
		double x[] = new double [4];
		int a[] = new int [4];
		double z[] = new double [4];
		int i =0;
				
			x[0]=cant/0.25;//19.16
			a[0]= (int)x[0];//19
			z[0]= a[0]*0.25;
			cant=cant-z[0];
		
			if (cant>0) {
				x[1]=cant/0.10;//19.16
				a[1]= (int)x[1];//19
				z[1]= a[1]*0.10;
				cant=cant-z[1];	
			}				
			else if (cant>0) {
					x[2]=cant/0.05;//19.16
					a[2]= (int)x[2];//19
					z[2]= a[2]*0.05;
					cant=cant-z[2];				
					}
			else if (cant>0){
				x[3]=cant/0.01;//19.16
				a[3]= (int)x[3];//19
				z[3]= a[3]*0.01;
				cant=cant-z[3];
			}
		System.out.println("Cantidad en monedas de $0.25:    "+a[0]);
		System.out.println("Cantidad en monedas de $0.10:    "+a[1]);
		System.out.println("Cantidad en monedas de $0.05:    "+a[2]);
		System.out.println("Cantidad en monedas de $0.01:    "+a[3]);
	}
}
