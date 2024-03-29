package exerciciosFaccat;

import java.util.Scanner;

public class ReajusteSalario {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("Digite o valor do salario do funcionario: ");
			double salarioAtual = sc.nextDouble();
			System.out.print("Digite a porcentagem de aumento do salario: ");
			double porcento = sc.nextDouble();

			double reajuste = salarioAtual * (porcento / 100) + salarioAtual;

			System.out.println("O novo salario teve um aumento de " + String.format("%.2f", porcento)
					+ "% e com este reajuste o " + "novo salario ficou: " + String.format("%.2f", reajuste));
			sc.close();

		} catch (Exception e) {
			System.out.println("Digite numeros validos // " + e);
		}

	}

}
