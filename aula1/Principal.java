package aula1;

public class Principal {
	public static void main(String[] args) {
		Ponto a = new Ponto();
		Ponto b = new Ponto();
		
		
		a.x = 5;
		a.y = 3;
		b.x = 9;
		b.y = 6;
		
		System.out.println(a.distancia());
		System.out.println(b.distancia());
	
	
		System.out.println(a.distancia(b));
		System.out.println(b.distancia(a));
	}

}
