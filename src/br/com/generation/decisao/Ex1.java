package br.com.generation.decisao;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
	//	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		int Valor1, Valor2, Valor3, Maior = 0;
		Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		Valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		if (Valor1 > Maior) {
			Maior = Valor1;
		}
		if (Valor2 > Maior) {
			Maior = Valor2;
		}
		if (Valor3 > Maior) {
			Maior = Valor3;
		}
		JOptionPane.showMessageDialog(null, "O maior valor encontrado � "+ Maior);
	}
	

}
