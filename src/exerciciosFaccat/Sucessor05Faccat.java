package exerciciosFaccat;
import java.util.Scanner;


public class Sucessor05Faccat {
 public static void main (String [] args) {
	 
	 try {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Digite um Valor: ");
		 int valor = sc.nextInt();
		 
		 int resultado = valor +1;
		 
		 System.out.println(+valor+" o sucessor é: "+resultado);
		 
		 sc.close();
		 } 
	 
	    catch (Exception e) {
		System.out.println("Favor inserir apenas numero "+e);
	}
	 
}
}
