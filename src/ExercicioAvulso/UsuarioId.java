package ExercicioAvulso;

import java.util.Scanner;

public class UsuarioId {
	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		int[] codigo;
		String[] usuario;
		int continuar;
		
		do {
			System.out.println("Digite a quantidade de usuarios a serem registrados: ");
			int quantidade = sc.nextInt();
			usuario = new String[quantidade];
			codigo = new int[quantidade];
			if (quantidade == 1) {
				System.out.println("Digite o nome do usuario " + 1 + ": ");
				usuario[0] = sc.next();
				System.out.println("Digite o codigo do usuario " + usuario[0] + ": ");
				codigo[0] = sc.nextInt();
				System.out.println(usuario[0]);
				System.out.println(codigo[0]);
			} else {
				for (int i = 0; i < quantidade; i++) {
					System.out.println("Digite o nome do usuario " + (i + 1) + ": ");
					usuario[i] = sc.next();
					System.out.println("Digite o codigo do usuario " + usuario[i] + ": ");
					codigo[i] = sc.nextInt();
				}
				int x = quantidade - 1;
				for (int i = 0; i < quantidade; i++) {
					if (codigo[i] == codigo[x]) {
						System.out.println("O codigo do " + usuario[i] + " e igual ao do outro usuario.");
					} else {
						System.out.println(usuario[i]);
						System.out.println(codigo[i]);
						x--;
					}
				}
			}
			System.out.println("Deseja continuar? (sim-1/nao-2): ");
			continuar = sc.nextInt();
		} while (continuar != 2);
		sc.close();

	}catch(

	Exception e)
	{
	   System.out.println(e);
   }
}}
