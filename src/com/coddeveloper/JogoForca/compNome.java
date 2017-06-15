package com.coddeveloper.JogoForca;

import java.awt.Component;
import java.awt.Label;

import javax.swing.JLabel;

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class compNome extends gameForca{
	private String letra;
	private static String nomeForca;
	public void comparaPalavra(String letra){
		System.out.println("A Letra precionada "+letra);
		int cont=0;
		boolean valida = false;
		char[] cha=nomeForca.toCharArray();
		gameForca gm;
		do{
			System.out.println(cha[cont]);
			if(letra.charAt(0)==cha[cont]){
				System.out.println("Encontrado esta Letra...> ");
				valida=true;
				label[cont] = new JLabel("");
				label[cont].setText(letra);
				label[cont].repaint();
			}
			cont++;
		}while(cont<nomeForca.length());
		System.out.println(valida);
		if(valida==false){
			System.out.println("Confirmando que o Botão esta false");
			gameForca.setBt(false);
		}else if(valida==true){
			gameForca.setBt(true);
		}
		System.out.println("  O resultado da Comparação é: "+getNomeForca());
	}
	public String getNome() {
		return letra;
	}
	public void setNome(String nome) {
		this.letra = letra;
	}
	public static void geraPalavra() {
		nomeRandom palavra = nomeRandom.getRandom();
		nomeForca = String.valueOf(palavra);
		int contador = 0;
		for(int i = 0;i<nomeForca.length();i++){
			contador++;
		}gameForca.setNumeroLetras(contador);
		System.out.println("Palavra Gerada "+palavra);
	}
	public String getNomeForca() {
		return nomeForca;
	}
	public static void setNomeForca(String nomeForca) {
		compNome.nomeForca = nomeForca;
	}
}
