package br.com.generation.lista;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		double nota1, nota2, nota3, media;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor da nota 1: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite o valor da nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite o valor da nota 3: ");
		nota3 = leia.nextDouble();
		media = (nota1*2 + nota2*3 +nota3*5) /10;
		System.out.println("A sua média final é " +media);
		
	}

}
