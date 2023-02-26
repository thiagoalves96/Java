package Manzan;

import java.util.Scanner;

public class FparaC {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.print("Digite a temperatura em Fahrenheit: ");
			double f = sc.nextDouble();
			
			double c =(f - 32) * ((double)5/9);
			
			System.out.println("A temperatura "+f+"˚F, será de "+String.format("%.1f", c)+"˚C.");
			
			sc.close();
			
	} catch (Exception e) {
		System.out.println("Digite um numero válido // "+e);
	}

	}

}
