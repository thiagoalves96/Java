//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa 
//expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

package exerciciosFaccat;

import java.util.Scanner;

public class Idade_Em_Dias {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
	         
			int mesR;
			
			System.out.println("Digite a sua idade, mes e dias para conversão: ");
			int idade = sc.nextInt();
			int mes = sc.nextInt();
			int dias = sc.nextInt();
	        
			int anos = idade * 365;

			if (mes == 12) {
				 mesR = mes * 30 + 5;
			} else {
			    mesR = mes * 30;
			}
			int soma = anos + mesR + dias;

			System.out.println("Você tem " + soma + " dias de vidas.");
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Digite numeros validos // "+e);
		}

	}

}
