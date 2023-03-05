
//8) Escreva um algoritmo para ler o número total de eleitores de um município, 
//o número de votos brancos, nulos e válidos. 
//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

package exerciciosFaccat;

import java.util.Scanner;

public class EleitoresPorcento {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);

			System.out.print("Digite a quantidade Eleitores: ");
			int eleitores = sc.nextInt();
			System.out.print("Digite a quantidade de votos Brancos: ");
			int branco = sc.nextInt();
			System.out.print("Digite a quantidade de votos Nulos: ");
			int nulos = sc.nextInt();

			
			if (branco > eleitores || nulos > eleitores) {
				System.out.println("\nValores maiores do que eleitores.");
			}
			else {

			double porcentoBranco = (double) branco * 100 / eleitores;

			double porcentoNulos = (double) nulos * 100 / eleitores;

			double porcentoValidos = (double) (eleitores-branco-nulos) * 100 / eleitores;

			System.out.println();
			System.out.println("Brancos: " + String.format("%.2f", porcentoBranco) + "% | Nulos: "
					+ String.format("%.2f", porcentoNulos) + "% | Válidos: " + String.format("%.2f", porcentoValidos) + "% ");
			}
              sc.close();
              
		} catch (Exception e) {
			System.out.println("Digite um valor válido // " + e);
		}

	}
}