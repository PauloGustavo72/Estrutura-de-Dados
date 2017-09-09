package aula1;

public class Ponto {
	int x, y;
	
	void imprimir(){
		System.out.println("(" + x + ", " + y +" )");
	}
	
	double distancia(){
		double dx = Math.pow(x, 2);
		double dy = Math.pow(y, 2);
		
		return Math.sqrt(dx + dy);
	}
	
	double distancia(Ponto p){
		double dx = Math.pow(x - p.x, 2);
		double dy = Math.pow(y - p.y, 2);
		return Math.sqrt(dx + dy);
	}
}
