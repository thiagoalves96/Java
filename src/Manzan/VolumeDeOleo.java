package Manzan;

import java.util.Scanner;

public class VolumeDeOleo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite altura da lata: ");
		double altura = sc.nextDouble();
		System.out.println("Digite o Raio da lata: ");
		double raio = sc.nextDouble();
		
		double volume = 3.14159*raio*raio*altura;
		
		System.out.println("O Volume = "+String.format("%.4f", volume));
      sc.close();
	}

}
