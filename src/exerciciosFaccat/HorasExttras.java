//22) A jornada de trabalho semanal de um funcionário é de 40 horas. 
//O funcionário que trabalhar mais de 40 horas receberá hora extra, 
//cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
//o salário por hora e escreva o salário total do funcionário, que deverá 
//ser acrescido das horas extras, caso tenham sido trabalhadas 
//(considere que o mês possua 4 semanas exatas).

package exerciciosFaccat;

import java.util.Scanner;

public class HorasExttras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quanto ele ganha por horas: ");
		double valorHoras = sc.nextDouble();

		// Horas por semana considerado 4 semanas
		double soma = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a quantidade de horas trabalhadas semana " + (i + 1) + " : ");
			double horasTrabalhadas = sc.nextDouble();
			soma = soma + horasTrabalhadas;
		}
		// Salário por mês
		double salario = valorHoras * 20;

		if (soma > 160) {
			double horasExtras = soma - 160;
			double aumentoExtra = ((valorHoras * 50 / 100) + valorHoras) * horasExtras;
			System.out.printf(
					"O funcionário trabalhou mensal %.1fh, teve de horas extras %.2fh, com isto teve um aumento. %nO valor reajustado é: %.2fR$ com isto ele recebera %.2f",
					soma, horasExtras, aumentoExtra, (salario + aumentoExtra));

		} else {
			System.out.println("Ele receberá o valor normal, pois não realizou horas extras.");
		}

		sc.close();
	}

}
