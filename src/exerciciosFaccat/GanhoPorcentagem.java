//Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//ele recebe uma comissão de 3% sobre o total das vendas 
//até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
package exerciciosFaccat;

import java.util.Scanner;

public class GanhoPorcentagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioFuncionario;
		double totalDasVendas;
		do {
			System.out.println("Digite o Salario do vendedor: ");
			salarioFuncionario = sc.nextDouble();
		} while (salarioFuncionario < 0);
		do {
			System.out.println("Digito o valor total das vendas do funcionario: ");
			totalDasVendas = sc.nextDouble();
		} while (totalDasVendas < 0);

		if (totalDasVendas < 1500) {
			double receber = salarioFuncionario + (totalDasVendas * 3 / 100);
//			System.out.println(receber);
			System.out.println("Salario: " + receber + "R$");

		} else {
			double receber5 = salarioFuncionario + (totalDasVendas * 3 / 100);

			System.out.println("Salario: " + receber5 + "R$");
		}
		sc.close();

	}

}
