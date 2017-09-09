package aula3;

public class Principal {


	public static void main(String[] args) {
		Lista lista = new Lista();
		
		 lista.imprimir();
		 lista.inserir(20);
		 lista.imprimir();
		 lista.inserir(10);
		 lista.imprimir();
		 lista.inserir(15);
		 lista.imprimir();
		 lista.inserir(40);
		 lista.imprimir(); 
		 lista.last();
		 System.out.println(lista.count());
		 System.out.println(lista.countR(0, lista.inicio ));
		 System.out.println(lista.sumR(0, lista.inicio));
		 System.out.println(lista.heigth(lista.inicio));
		 System.out.println(lista.depth(lista.inicio));
	}

}
