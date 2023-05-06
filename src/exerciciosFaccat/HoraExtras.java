package exerciciosFaccat;

import java.util.Scanner;

public class HoraExtras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0;

		System.out.println("Digite o valor que ele ganha por horas: ");
		double valorHoras = sc.nextDouble();
		double horasTrabalhadas;

		for (int i = 0; i < 4; i++) {
			do {
				System.out.print("Digite as horas trabalhadas no " + (i + 1) + "˚ semana: ");
				horasTrabalhadas = sc.nextDouble();
				contador += horasTrabalhadas;
			} while (horasTrabalhadas < 0);
		}
		if (contador < 161) {
			double horasMensal = contador * valorHoras;

			System.out.println("O salario a receber é de: " + horasMensal + "R$.");

		} else {
			double horasExtra = (double) (contador - 160) * (valorHoras + 50 / 100 * valorHoras);
			double salarioFinal = contador * valorHoras;
			double salarioMensal = valorHoras * 160;
			System.out.println("O salario a receber é de " + salarioMensal + "R$, hora extras trabalhadas e de "
					+ horasExtra + "R$.");
			System.out.println("O salario final é de: " + salarioFinal + "R$.");
		}

		sc.close();
	}

}
