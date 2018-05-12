package src1.tareas;

import java.util.Scanner;

public class verificador_entrada{
	
	private Scanner sc;
	
	public verificador_entrada(){
		sc = new Scanner (System.in);				
		}
	public Double getDouble(String Frase) {
		String dec = "";
		
		while (dec.equals("")) {			
			System.out.println(Frase);
			dec= sc.nextLine();
			if(!dec.matches("[0-9]*$")) {
				dec = "";
			}
		}
		return  Double.parseDouble(dec);
	
	}
	public String getString(String Frase) {
        String s1 = "";
        while (s1.equals("")) {
            System.out.println(Frase);
            s1 = sc.nextLine(); 
            if (!s1.matches("^[A-Za-z ñÑáéíóúü]*$")) {
                s1 = "";
            }
        }
        return s1;
	}
}
