package baralho;

import java.util.Random;

public class Baralho {
	private PilhaObj baralho;
	
	public Baralho() {
		baralho = new PilhaObj(52); 
		String faces[] = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String naipes[] = {"Copas", "Paus", "Ouros", "Espadas"}; 
		
		for (int i = 0; i < baralho.getLength(); i++) {
			baralho.push(new Carta(faces[i % 13], i % 13+1, naipes[i / 13])); 			
		}		
				
	}
	
	public Carta removeCarta(int ind) {
		PilhaObj aux = new PilhaObj(baralho.getLength()); 
		
		for (int i = 0; i < ind; i++) {
			aux.push(baralho.pop());			
		}	
		
		Carta alvo = (Carta) baralho.pop(); 
		
		while(!aux.isEmpty()) {
			baralho.push(aux.pop());
		}
		
		return alvo; 
	}
	
	public void embaralhar() {		
		Random nroAleatorio = new Random();

		for (int i = 0; i < baralho.getLength(); i++) {			
			int indice = nroAleatorio.nextInt(baralho.getLength());		
			if(indice != 0) {
				baralho.push(removeCarta(indice)); 
			}		
		}
	}

	
	public Carta virarCarta() {
		return (Carta) baralho.pop();
	}
 
	public void exibir() { 
		baralho.exibePilhaBaseParaTopo();
	}
	
	
}
