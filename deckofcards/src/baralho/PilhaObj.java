package baralho;

public class PilhaObj {
	
	// Atributos
	private Object[] pilha;
	private int topo;
	
	// Construtor
	public PilhaObj(int capacidade) {
		pilha = new Object[capacidade];
		topo = -1;    // inicializa topo com -1 (pilha vazia)
	}

	// Métodos
	public boolean isEmpty() {
		return topo == -1;  // se topo for -1 a pilha está vazia
		                    // e retornará true
		                    // caso contrário, retornará false
	}
	
	public boolean isFull() {
		return topo == pilha.length-1; //se topo for igual a 
		                       // pilha.length-1, a pilha está cheia
		                       // e retornará true
		                       // caso contrário, retornará false
	}
	
    public void push(Object info) {
    	if (isFull()) {
    		System.out.println("Pilha cheia");
    	}
    	else { // incrementa topo e coloca a info na pilha
    		   // índice topo
    		// topo++;
    		// pilha[topo]= info;

    		// a instrução abaixo equivale às 2 instruções de cima
    		pilha[++topo]= info; 
    	}
    }
    
    public Object pop() {
    	if (isEmpty()) {
    		System.out.println("Pilha vazia");
    		return -1;
    	}
    	else {
    		return pilha[topo--];
    		
    		// as 3 instruções abaixo equivale à instrução acima
    		// int retorno= pilha[topo];
    		// topo--;
    		// return retorno;
    	}
    }

	public void exibePilhaBaseParaTopo() {
		for (int i = 0; i < pilha.length; i++) {
			System.out.println(pilha[i]);
		}
	}	
	
	public int getLength() {
		return pilha.length;
	}
}