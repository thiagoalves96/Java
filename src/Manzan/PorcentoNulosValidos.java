package Manzan;

import java.util.Scanner;

public class PorcentoNulosValidos {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			
			System.out.print("Digite a qunatidade de votos A: ");
			int a = sc.nextInt();
			System.out.print("Digite a qunatidade de votos B: ");
			int b = sc.nextInt();
			System.out.print("Digite a qunatidade de votos C: ");
			int c = sc.nextInt();
			System.out.print("Digite a quantidade de votos Brancos: ");
			int branco = sc.nextInt();
			System.out.print("Digite a quantidade de votos Nulos: ");
			int nulos = sc.nextInt();

			int total = branco + nulos + a + b + c;

			double porcentoB = (double) branco * 100 / total;

			double porcentoN = (double) nulos * 100 / total;

			double porcentoa = (double) a * 100 / total;

			double porcentob = (double) b * 100 / total;

			double porcentoc = (double) c * 100 / total;

			System.out.println();
			System.out.println(
					"Brancos: " + String.format("%.2f", porcentoB) + "% | Nulos: " + String.format("%.2f", porcentoN)+"% ");
			System.out.println("A : " + String.format("%.2f", porcentoa) + "% | B : "
					+ String.format("%.2f", porcentob) + "% | c : "+String.format("%.2f", porcentoc)+ "% ");

			sc.close();

		} catch (Exception e) {
			System.out.println("Digite um valor válido // " + e);
		}

	}
}
