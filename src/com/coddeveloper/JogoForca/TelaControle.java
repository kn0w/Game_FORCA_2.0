package com.coddeveloper.JogoForca;

public class TelaControle {

	public static void main(String[] args) {
		gameForca.setOver(false);
		gameForca.setVitoriA(false);
		TelaGameOver inicio = new TelaGameOver();
		inicio.main(null);
	}
}