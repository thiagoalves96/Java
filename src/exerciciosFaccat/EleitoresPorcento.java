
//8) Escreva um algoritmo para ler o número total de eleitores de um município, 
//o número de votos brancos, nulos e válidos. 
//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

package exerciciosFaccat;

import java.util.Scanner;

public class EleitoresPorcento {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);

			int total;
			System.out.print("Digite a quantidade de votos Brancos: ");
			int branco = sc.nextInt();
			System.out.print("Digite a quantidade de votos Nulos: ");
			int nulos = sc.nextInt();
			System.out.print("Digite a qunatidade de votos Válidos: ");
			int validos = sc.nextInt();

			total = branco + nulos + validos;

			double porcentoB = (double) branco * 100 / total;

			double porcentoN = (double) nulos * 100 / total;

			double porcentoV = (double) validos * 100 / total;

			System.out.println();
			System.out.println("Brancos: " + String.format("%.2f", porcentoB) + "% | Nulos: "
					+ String.format("%.2f", porcentoN) + "% | Válidos: " + String.format("%.2f", porcentoV) + "% ");
              sc.close();
              
		} catch (Exception e) {
			System.out.println("Digite um valor válido // " + e);
		}

	}
}