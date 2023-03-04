package exerciciosFaccat;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
	public static void main(String[] args) {

		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			int resposta = 1;
			while (resposta == 1) {
				System.out.println("Digite a Base do retângulo: ");
				double b = sc.nextDouble();
				System.out.println("Digite a Altura do retângulo: ");
				double a = sc.nextDouble();

				if (b == a) {
					while (a == b) {
						System.out.println("Digite valores distintos: ");
						System.out.println("Digite a Base do retângulo: ");
						b = sc.nextDouble();
						System.out.println("Digite a Altura do retângulo: ");
						a = sc.nextDouble();
					}
				}
				if (b < 0 || a < 0) {

					double area = b * a * -1;

					System.out.println("A área do retângulo é: " + String.format("%.2f", area));
				} else {

					double area = b * a;

					System.out.println("A área do retângulo é: " + String.format("%.2f", area));

					System.out.println("Para conntinuar digite 1-Sim ou 2-Não: ");
					resposta = sc.nextInt();
				}
			}
			System.out.println("FIM.");

			sc.close();

		} catch (Exception e) {
			System.out.println("Digite apenas numeros - " + e);
		}

	}

}
