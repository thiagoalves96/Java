package Manzan;

import java.util.Scanner;

public class CparaF {

	public static void main(String[] args) {
		try {
				Scanner sc= new Scanner(System.in);
				System.out.print("Digite a temperatura em Celsius: ");
				double celsius = sc.nextDouble();
				
				double f =(9 * celsius + 160) / 5;
				
				System.out.println("A temperatura "+celsius+"˚c, será de "+String.format("%.1f", f)+"˚f.");
				
				sc.close();
				
		} catch (Exception e) {
			System.out.println("Digite um numero válido // "+e);
		}
	}

}
