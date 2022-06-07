package br.com.generation.decisao;

import java.util.Locale;

import javax.swing.JOptionPane;

//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra.

public class Ex2 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade? "));
		if(idade >= 10 && idade < 14) {
			JOptionPane.showMessageDialog(null, "O jogador deve se apresentar na categoria infantil");
			}
		if(idade >= 14 && idade < 17) {
			JOptionPane.showMessageDialog(null, "O jogador deve se apresentar na categoria juvenil");
			}
		if(idade >= 18 && idade < 25) {
			JOptionPane.showMessageDialog(null, "O jogador deve se apresentar na categoria adulto");
			}
		
		}
	}
