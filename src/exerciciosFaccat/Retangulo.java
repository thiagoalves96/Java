package exerciciosFaccat;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
	public static void main(String[] args) {

		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite a Base do retângulo: ");
			double b = sc.nextDouble();
			System.out.println("Digite a Altura do retângulo: ");
			double a = sc.nextDouble();

			if (b == a) {
				System.out.println("Digite valores de um retângulo e não de um quadrado.");
			} else if (b < 0 || a < 0) {

				double area = b * a * -1;

				System.out.println("A área do retângulo é: " + String.format("%.2f", area));
			} else if (b > 0 && a > 0) {

				double area = b * a;

				System.out.println("A área do retângulo é: " + String.format("%.2f", area));

			} else {
				System.out.println("Digite numeros válidos.");
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite apenas numeros - " + e);
		}

	}

}
