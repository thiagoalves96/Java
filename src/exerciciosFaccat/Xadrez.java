//21) Ler a hora de início e a hora de fim de um jogo de Xadrez 
//(considere apenas horas inteiras, sem os minutos) e calcule a duração 
//do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24
//horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
package exerciciosFaccat;

import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int xadrez;
		int xadrezTermino;

		do {
			System.out.print("Digite a hora do início do xadrez: ");
			xadrez = sc.nextInt();
		} while (xadrez < 0 || xadrez > 23);
		do {

			System.out.print("Digite a hora do término do xadrez: ");
			xadrezTermino = sc.nextInt();
		} while (xadrezTermino < 0 || xadrezTermino > 23);

		if (xadrez == xadrezTermino) {
			System.out.println("O jogo durou: 24h.");

		} else if (xadrez > xadrezTermino) {

			int contador1 = (24 - xadrez) + xadrezTermino;

			System.out.println("Horas jogada: " + contador1 + "h");

		} else {
			int contador2 = xadrezTermino - xadrez;
			System.out.println("Horas jogada: " + contador2 + "h");
		}

		sc.close();
	}

}
