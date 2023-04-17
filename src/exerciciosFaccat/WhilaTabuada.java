package exerciciosFaccat;

import java.util.Scanner;

public class WhilaTabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero da tabuada: ");
		int numero = sc.nextInt();
		int contador=1;
		
		while (contador < 11 ) {
			System.out.println(numero+" x "+contador+" = "+(numero*contador));
			contador++;
		}
		sc.close();
	}

}
