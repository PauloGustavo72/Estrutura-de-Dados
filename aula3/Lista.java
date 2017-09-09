package aula3;

public class Lista {
	No inicio;
	
	public Lista() {
		inicio = null;
	}
	
	public void inserir1(int n){
		No no = new No();
		no.conteudo = n;
		no.proximo = null;
		
		if(inicio == null)
			inicio = no;
		else{
			No ultimo = inicio;
			while(ultimo.proximo != null){
				ultimo = ultimo.proximo;
			}
			ultimo.proximo = no;
		}
	}
	
	public void imprimir(){
		if(inicio == null){
			System.out.println("Lista vazia");
		}else{
			System.out.println();
			No ultimo = inicio;
			while(ultimo != null){
				System.out.println(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			}
		}
	}
	
	public void inserir(int n){
		No no = new No();
		no.conteudo = n;
		
		No anterior = null;
		No atual = inicio;
		
		while(atual != null && atual.conteudo < n){
			anterior = atual;
			atual = atual.proximo;
		}
		
		if(anterior == null){
			no.proximo = inicio;
			inicio = no;
		}else{
			no.proximo = anterior.proximo;
			anterior.proximo = no;
		}
	}
	
	public void last(){
		No no = new No();
		no = inicio;
		if(inicio == null)
			System.out.println("Lista vazia");
		else{
			while(no.proximo != null)
				no = no.proximo;
			System.out.println("o ultimo da lista é: " + no.conteudo);
		}	
	}
	
	public int count(){
		int aux = 0;
		No no = new No();
		no = inicio;
		if(inicio == null)
			return 0;
		else{
			while(no != null){
				no = no.proximo;
				aux++;
			}
			return aux;
		}
	}
	
	public int countR(int quantidade, No no){
		
		if(no == null){
			return quantidade;
		}
		else{
			return countR(quantidade++, no.proximo) + quantidade;
		}
	}
	
	public int sumR(int soma, No no){
		if(no == null)
			return 0;
		else
			return sumR(soma++, no.proximo) + no.conteudo;
	}
	
	public int heigth(No no){
		int numNo = 1;
		No novo = inicio;
		if(inicio == null)
			return 0;
		else{
			while(novo != no){
				numNo++;
				novo = novo.proximo;
			}
			return count() - numNo;
				
		}
	}
	
	public int depth(No no){
		int numNo = 0;
		No novo = inicio;
		if(inicio == no)
			return 0;
		else{
			while(novo != no){
				numNo++;
				novo = novo.proximo;
			}
			return numNo - 1;
		}
	}


	
	

}
