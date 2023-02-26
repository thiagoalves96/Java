//f)  Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca 
//dos valores de forma que a variável A passe a possuir o valor da 
//variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados
package Manzan;

import java.util.Scanner;

public class TrocaDeValor {
	public static void main(String [] args) {
	try {
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite o valor do A: ");
		double a = sc.nextDouble();
		System.out.print("Digite o valor do B: ");
		double b= sc.nextDouble();
		
		
		double troca = a;
		a = b;
	    b = troca;
		
		
		System.out.println(+a+" "+b);
		
		sc.close();
		
} catch (Exception e) {
	System.out.println("Digite um numero válido // "+e);
}
}
}