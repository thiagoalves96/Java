package Manzan;

import java.util.Scanner;

public class QuatroValoresInteiros {
	public static void main(String [] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.print("Digite o valor do A: ");
			int a = sc.nextInt();
			System.out.print("Digite o valor do B: ");
			int b= sc.nextInt();
			System.out.print("Digite o valor do c: ");
			int c= sc.nextInt();
			System.out.print("Digite o valor do D: ");
			int d= sc.nextInt();
			
			int p = a*c;
			int s = b+d;
			
			System.out.println(p);
			System.out.println(s);
			
			sc.close();
			
	} catch (Exception e) {
		System.out.println("Digite um numero válido // "+e);
	}
	}

}
