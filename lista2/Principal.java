package lista2;

import javax.swing.JOptionPane;

public class Principal {
	static Sequencia sequencia;
	public static void main(String[] args) {
		String menu;
		
		do{
			menu = JOptionPane.showInputDialog(
					"1 - Criar sequência\n"+
					"2 - Adicionar valor\n" +
					"3 - Imprimir"		);
			
			if(menu != null){
				switch (menu) {
				case "1": criar(); break;
				case "2": add(); break;
				case "3": imprimir(); break;
				}
			}
		}while(menu != null);
	}
	private static void imprimir() {
		if(sequencia == null)
			JOptionPane.showMessageDialog(null, "Primeiro é necessário criar a sequência usando a opção 1");
		else{
			sequencia.imprimir();
		}
	}
	private static void add() {
		if(sequencia == null)
			JOptionPane.showMessageDialog(null, "Primeiro é necessário criar a sequência usando a opção 1");
		else{
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero"));
			sequencia.add(quantidade);
		}
	}
	private static void criar() {
		sequencia = new Sequencia();
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade"));
		sequencia.criarLista( quantidade);
		
	}
}
