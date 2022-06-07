package br.com.generation.decisao;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		int num1;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		if(num1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, num1+ " é par e sua raiz quadrada é " + Math.sqrt(num1)); 
			}
		else{
			JOptionPane.showMessageDialog(null,num1+ " é ímpar e ele elevado ao quadrado é " + Math.pow(num1, 2));
			
		}
			

	}

}
