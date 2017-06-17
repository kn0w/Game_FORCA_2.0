package com.coddeveloper.JogoForca;
import img.imgControl;
public class compNome extends gameForca {
	private String letra;
	private static String nomeForca;
	private static int imgNum = 0;
	private static int vitoria = 0;
	public static void comparaPalavra(String letra) throws Exception {
		int cont = 0;
		boolean validaButton = false;
		char[] chaNomeForca = nomeForca.toCharArray();
		do {

			if (letra.charAt(0) == chaNomeForca[cont]) {
				validaButton = true;
				vitoria++;
				setLabel(cont, letra);
			}
			cont++;
		} while (cont < getNumeroLetras());
		if (vitoria == gameForca.getNumeroLetras()) {
			gameForca.setOver(false);
			gameForca.setVitoriA(true);
			gameForca.main(null);
		} else if (validaButton == false) {
			imgNum++;
			imgControl.imgControl(imgNum);
			gameForca.setBt(false);
			if (imgNum == 6) {
				cont = 0;
				validaButton = false;
				imgNum = 0;
				gameForca.gameOver(true);
				gameForca.main(null);
			}
		} else if (validaButton == true) {
			gameForca.setBt(true);
		}
	}
	public static void geraPalavra() {

		nomeRandom palavra = nomeRandom.getRandom();
		nomeForca = String.valueOf(palavra);
		int contador = 0;
		for (int i = 0; i < nomeForca.length(); i++) {
			contador++;
		}
		gameForca.setNumeroLetras(contador);
	}
	public static String getNomeForca() {
		return nomeForca;
	}
	public static void setNomeForca(String nomeForca) {
		compNome.nomeForca = nomeForca;
	}
	public String getNome() {
		return letra;
	}
	public void setNome(String nome) {
		this.letra = letra;
	}
	public static int getVitoria() {
		return vitoria;
	}
	public static void setVitoria(int vitoria) {
		compNome.vitoria = vitoria;
	}
}
