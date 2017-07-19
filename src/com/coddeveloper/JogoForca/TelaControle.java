package com.coddeveloper.JogoForca;

public class TelaControle {

	public static void main(String[] args) {
		/*tela in = null;
		in.main(null);
	System.out.println("Voltou normal ");
		*/
		gameForca.setOver(false);
		gameForca.setVitoriA(false);
		TelaGameOver inicio = new TelaGameOver();
		inicio.main(null);
		 
	}
}