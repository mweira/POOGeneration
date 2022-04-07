package br.com.generation.aula05;

public class TestaAviao {

	public static void main(String[] args) {

		Aviao av1 = new Aviao(); 
		Aviao av2 = new Aviao(); 
		
		av1.setModelo("Boeing 717");
		av1.setId(01);
		av1.setAssentos(45);
		av1.setPassageiros(30);
		
		
		av2.setModelo("Boeing 757");
		av2.setId(02);
		av2.setAssentos(60);
		av2.setPassageiros(50);
		
		System.out.println(av1.getModelo());
		System.out.println(av1.getId());
		System.out.println(av1.getAssentos());
		System.out.println(av1.getPassageiros());
		
		System.out.println(av2.getModelo());
		System.out.println(av2.getId());
		System.out.println(av2.getAssentos()); 
		System.out.println(av2.getPassageiros());


		
	}

}
