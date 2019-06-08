package baralho;

public class Carta {
	private String face; 
	private int valor; 
	private String naipe;
		
	public Carta(String face, int valor, String naipe) {
		this.face = face;
		this.valor = valor;
		this.naipe = naipe;
	}

	@Override
	public String toString() {
		return face + " de "+ naipe;
	}
	
	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	} 
	
	
	
	
	
	

}
