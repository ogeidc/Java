package br.com.generation.decisao;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		int num1;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		if(num1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, num1+ " � par e sua raiz quadrada � " + Math.sqrt(num1)); 
			}
		else{
			JOptionPane.showMessageDialog(null,num1+ " � �mpar e ele elevado ao quadrado � " + Math.pow(num1, 2));
			
		}
			

	}

}
