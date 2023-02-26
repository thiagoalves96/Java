package Manzan;

import java.util.Scanner;

public class QuadradoDf {
	public static void main(String [] args) {
		try {
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Digite o valor do A: ");
			double a = sc.nextDouble();
			System.out.print("Digite o valor do B: ");
			double b= sc.nextDouble();
			
		
			double c = (a*a)-(b*b);
			
			
			System.out.println(c);
			
			sc.close();
			
	} catch (Exception e) {
		System.out.println("Digite um numero válido // "+e);
	}
	}
}
