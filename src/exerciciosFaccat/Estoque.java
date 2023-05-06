// Faça um algoritmo para ler: quantidade atual em estoque,
// quantidade máxima em estoque e quantidade mínima em estoque de um 
// produto. Calcular e escrever a quantidade média 
// ((quantidade média = quantidade máxima + quantidade mínima)/2). 
// Se a quantidade em estoque for maior ou igual a quantidade média escrever a 
// mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.

package exerciciosFaccat;

import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int estoqueAtual;
			int estoqueMaximo;
			int estoqueMinimo;

			do {
				System.out.println("Digite a quantidade do estoque atual: ");
				estoqueAtual = sc.nextInt();
			} while (estoqueAtual < 0);
			do {
				System.out.println("Digite a quantidade maxima permitida: ");
				estoqueMaximo = sc.nextInt();
			} while (estoqueMaximo < 0);
			do {
				System.out.println("Digite a quantidade minima permitida: ");
				estoqueMinimo = sc.nextInt();
			} while (estoqueMinimo < 0);

			double quantidadeMedia = (estoqueMaximo + estoqueMinimo) / 2;

			if (quantidadeMedia > estoqueAtual) {
				System.out.println("Não efetuar compra!");
			} else {
				System.out.println("Efetuar compra!");
			}

			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
