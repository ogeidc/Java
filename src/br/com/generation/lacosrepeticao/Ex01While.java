package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class Ex01While {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99.
		int idade =0, menosVinteUm=0, maisCinquenta=0; 
		Scanner in = new Scanner(System.in);
		//solicitação de input
		while (idade != -99) {
			System.out.println("Informe sua idade: ");
			idade = in.nextInt(); 
			//recebe a idade do usuário
			if(idade < 21 && idade > 0) {
				menosVinteUm++;
			}
			//contar pessoas com menos de 21 anos
			if(idade > 50) {
				maisCinquenta++;
			//contar pessoas com mais de 50 anos
			}
		
			
		}
System.out.println("O total de pessoas com mais de de 21 anos é "+menosVinteUm+" e o de maiores de 50"
		+ " anos é "+maisCinquenta);

	}

}
