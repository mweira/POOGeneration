package br.com.generation.aula05;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente(); 
		
		c1.nome = "José"; 
		c1.id = 01;
		c1.produtos = 3; 
		c1.saldo = 0; 
		c1.presença = 0;
		
		c1.pagar(50);
		c1.visitar(5);
		System.out.println(c1.saldo);
		System.out.println(c1.presença);

		c2.nome = "Maria"; 
		c2.id = 02;
		c2.produtos = 2; 
		c2.saldo = 5; 
		c2.presença = 7;
		
		c2.pagar(75);
		c2.visitar(8);
		System.out.println(c2.saldo);
		System.out.println(c2.presença);

	}

}
