package com.coddeveloper.JogoForca;

import img.imgControl;

public class compNome extends gameForca{
	private String letra;
	private static String nomeForca;
	static int imgNum = 0;
	public static void comparaPalavra(String letra) throws Exception{
		System.out.println("A Letra precionada "+letra);
		int cont=0;
		boolean valida = false;
		
		char[] cha=nomeForca.toCharArray();
		do{
			System.out.println(cha[cont]);
			if(letra.charAt(0)==cha[cont]){
				System.out.println("Encontrado esta Letra...> ");
				valida=true;
				setLabel(cont, letra);
			}
			cont++;
		}while(cont<getNumeroLetras());
		System.out.println(valida);
		if(valida==false){
			imgNum++;
			System.out.println("Confirmando que o Botão esta false");
			System.out.println("Contando Imagem ICO: "+imgNum);
			imgControl.imgControl(imgNum);
			System.out.println("Voltou metodo Injeta IMG ");
			gameForca.setBt(false);
		}else if(valida==true){
			gameForca.setBt(true);
		}
		//System.out.println("  O resultado da Comparação é: "+getNomeForca());
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
		//System.out.println("Palavra Gerada "+palavra);
	}
	public static String getNomeForca() {
		return nomeForca;
	}
	public static void setNomeForca(String nomeForca) {
		compNome.nomeForca = nomeForca;
	}
	
}
