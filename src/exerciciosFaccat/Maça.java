package exerciciosFaccat;

import java.util.Scanner;

public class Maça {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Quantas maçãs irá comprar: ");
			int quantidadeMaca = sc.nextInt();

			if (quantidadeMaca < 1) {
				System.out.println("Digite um valor válido para sua compra.");
			} else if (quantidadeMaca > 12) {
				double quantidadeValor = quantidadeMaca * 1.00;
				System.out.println("Pela quantidade de " + quantidadeMaca + " maçãs comprada ficou: "
						+ String.format("%.2f", quantidadeValor) + "R$");
			} else {
				double quantidadeDesconto = quantidadeMaca * 1.30;
				System.out.println("Pela quantidade de " + quantidadeMaca + " maçãs comprada ficou: "
						+ String.format("%.2f", quantidadeDesconto) + "R$");
				sc.close();
			}

		} catch (Exception e) {
			System.out.println("Digite um valor:" + e);
		}

	}

}
