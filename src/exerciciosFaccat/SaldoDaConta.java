//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e 
//crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
//Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', 
//senão escrever a mensagem 'Saldo Negativo'.

package exerciciosFaccat;

import java.util.Scanner;

public class SaldoDaConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero da conta: ");
		int idCliente = sc.nextInt();
		System.out.println("Digite o Saldo da conta: ");
		double saldo = sc.nextDouble();
		System.out.println("Digite o Débito da conta: ");
		double debito = sc.nextDouble();
		System.out.println("Digite o Crédito da conta: ");
		double credito = sc.nextDouble();
		
		
		double saldoAtual = saldo - debito + credito;
		System.out.println("Saldo da conta id:"+idCliente+" é de: "+saldoAtual);
		
		if(saldoAtual >= 0) {
			System.out.println("Saldo Positivo");
		}else {
			System.out.println("Saldo Negativo");
		}
		
		sc.close();

	}

}
