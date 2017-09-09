package lista2;

import javax.swing.JOptionPane;

public class Sequencia {
	private int lista[];
	private int posicao = 0;
	private int tamanhoLista;
 	
	
	public void criarLista(int n){
		lista = new int[n];
		tamanhoLista = n;
	}
	
	public boolean add(int n){
		if(posicao == tamanhoLista){
			JOptionPane.showMessageDialog(null, "Sequência cheia");
			return false;
		}else{
			lista[posicao] = n;
			posicao++;
			return true;
		}

	}

	public void imprimir() {
		for (int i : lista) {
			System.out.println(lista[i]);
		}
	}

}
