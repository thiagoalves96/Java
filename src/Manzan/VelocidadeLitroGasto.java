package Manzan;

import java.util.Scanner;

public class VelocidadeLitroGasto {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o tempo gasto em sua viagem: ");
			double tempo = sc.nextDouble();
			System.out.println("Digite a velocidade média feita: ");
			double velocidade = sc.nextDouble();

			double distancia = tempo * velocidade;
			double litros_usados = distancia / 12;

			System.out.println("Velocidade média " + velocidade + "KM/H, tempo gasto na viagem " + tempo
					+ "H, a distancia percorrida " + String.format("%.2f", distancia) + "KM e a "
					+ "quantidade de litros " + String.format("%.2f", litros_usados) + "L utilizada na viagem.");

			sc.close();

		} catch (Exception e) {
			System.out.println("Digite um numero válido // " + e);
		}

	}

}
