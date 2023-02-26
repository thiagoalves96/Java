// <- Inline 

/* <- Multi-linha */

/** 
 * @author alerocha
 */

package exerciciosFaccat;
import java.util.Scanner;


public class Exercicio05Faccat {
 public static void main (String [] args) {
	 
	 try {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um Valor: ");
		 int valor = sc.nextInt();
		 
		 int resultado = valor -1 ;
		 
		 System.out.println("O numero antecessor do digitado é: "+resultado);
		 
		 sc.close();
		 } 
	 
	    catch (Exception e) {
		System.out.println("Favor inserir um numero correto "+e);
	}
	 
}
}
