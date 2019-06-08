package baralho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Baralho baralho = new Baralho();
		Scanner sc = new Scanner(System.in); 
		int cartas = 0, cartasNaipeVermelho = 0; 
		
		System.out.println("Cartas: ");
		baralho.exibir();
		System.out.println("Embaralhando...");
		baralho.embaralhar();
		System.out.println("Cartas: ");
		baralho.exibir(); 
		System.out.println("Embaralhando...");
		baralho.embaralhar();

		System.out.println("Digite a quantidade de cartas que serão viradas: ");
		cartas = sc.nextInt(); 
		while (cartas < 1 || cartas > 11) {
			System.out.println("Digite a quantidade de cartas que serão viradas: ");
			cartas = sc.nextInt(); 
		}

		System.out.println("Quantas dessas cartas serão do naipe vermelho?");
		cartasNaipeVermelho = sc.nextInt();
		while (cartasNaipeVermelho < 0 || cartasNaipeVermelho > cartas) {
			System.out.println("Quantas dessas cartas serão do naipe vermelho?");
			cartasNaipeVermelho = sc.nextInt();
		}
		
		int cont = 0; 
		for (int i = 0; i < cartas; i++) {					
			Carta carta  = baralho.virarCarta();  

			System.out.println(carta);	
			
			if (carta.getNaipe().equals("Copas")|| carta.getNaipe().equals("Ouros")) {
				cont++; 		
			}		
		}		
		
		if(cartasNaipeVermelho != cont) {
			System.out.println("Você perdeu!");
		} else {
			System.out.println("Você ganhou!");
		}
		
		
		
	}
}
