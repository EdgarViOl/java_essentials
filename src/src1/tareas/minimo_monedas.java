package src1.tareas;

public class minimo_monedas {
	
	public static void main(String[] args) {
		double cant=.40;
		double x[] = new double [4];
		int i;
		
		while (cant>0.00) {
			while (cant-0.25>=0.00) {
				cant=cant-0.25;
				x[0]++;
			}
			while (cant-0.10>=0.00) {
				cant=cant-0.10;
				x[1]++;
			}
			while (cant-0.05>=0.00) {
				cant=cant-0.05;
				x[2]++;
			}
			while (cant-0.01>=0.00) {
				cant=cant-0.01;
				x[3]++;
			}
		for (i=0;i<=4;i++) {
		if (i==0)
		System.out.println("Cantidad de monedas de: $0.25 centavos es: "+x[i]);
		if (i==1)
			System.out.println("Cantidad de monedas de: $0.10 centavos es: "+x[i]);
		if (i==2)
			System.out.println("Cantidad de monedas de: $0.05 centavos es: "+x[i]);
		if (i==3)
			System.out.println("Cantidad de monedas de: $0.01 centavos es: "+x[i]);
			}
		
		}
	}
}

