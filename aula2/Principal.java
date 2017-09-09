package aula2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		int []a = {20,2,23,4,5};
		
		System.out.println(fatorial(5));;
		System.out.println(fibonacci(19));
		System.out.println(calculaArray(a, 4));
		System.out.println(maiorValor(a, 4));
	}
	
	public static long fatorial(int n){
		if(n <= 1)
			return 1;
		else
			return n * fatorial(n-1);
	}

	public static long fibonacci(int n){
		if(n <=3)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static long calculaArray(int []a, int n){
		if(n < 0)
			return 0;
		else
			return a[n] + calculaArray(a, n - 1);
	}
	
	public static int maiorValor(int []a, int n){
		if(n == 1) return a[0];
		else{
			int x = maiorValor(a, n - 1);
			if(x > a[n - 1])
				return x;
			else
				return a[n-1];
		}
		
	}
}
