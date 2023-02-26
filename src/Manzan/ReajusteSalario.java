package Manzan;

import java.util.Scanner;

public class ReajusteSalario {
	      public static void main (String [] args) {
	try {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite o Salario do funcionaro: ");
		double sm = sc.nextDouble();
		System.out.print("Digite o porcentual do reajuste: ");
		double pr = sc.nextDouble();
		
	
		double ns = (sm * (pr/100))+ sm;
		
		
		System.out.println(ns);
		
		sc.close();
		
} catch (Exception e) {
	System.out.println("Digite um numero válido // "+e);
}	
}

}
