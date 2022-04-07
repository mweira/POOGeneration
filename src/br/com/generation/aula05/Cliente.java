package br.com.generation.aula05;

public class Cliente {

	String nome; 
	int id; 
	int produtos;
	int saldo; 
	int presença; 
	
	void visitar(int visitas) { 
		presença += visitas;
	}
	
	void pagar(int pagamento) {
		saldo += pagamento;
	}
	
}
