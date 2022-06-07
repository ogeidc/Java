package br.com.generation.decisao;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
	//	Faça um programa que receba três inteiros e diga qual deles é o maior.
		int Valor1, Valor2, Valor3, Maior = 0;
		Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		Valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		if (Valor1 > Maior) {
			Maior = Valor1;
		}
		if (Valor2 > Maior) {
			Maior = Valor2;
		}
		if (Valor3 > Maior) {
			Maior = Valor3;
		}
		JOptionPane.showMessageDialog(null, "O maior valor encontrado é "+ Maior);
	}
	

}
