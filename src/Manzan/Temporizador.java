package Manzan;

import java.util.Scanner;

public class Temporizador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o inicio da horas: ");
		int horasDigitados = sc.nextInt();
		System.out.println("Digite o inicio do minutos: ");
		int minutosDigitados = sc.nextInt();
		System.out.println("Digite o inicio do segundos: ");
		int segundosDigitados = sc.nextInt();

		for (int horas = horasDigitados; horas > -1; horas--) {
		for (int minutos = minutosDigitados; minutos > -1; minutos--) {
			for (int segundos = segundosDigitados; segundos > -1; segundos--) {
				System.out.println(horas+" : " + minutos + " : " + segundos);
				segundosDigitados = 59;
				horasDigitados=59;
			}
		}
		}
		sc.close();
	}

}
