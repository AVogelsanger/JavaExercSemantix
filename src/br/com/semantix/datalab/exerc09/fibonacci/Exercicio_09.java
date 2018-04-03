package br.com.semantix.datalab.exerc09.fibonacci;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int n = scan.nextInt();

		if(n < 0){
			System.out.println("Numero inválido");
		}


		System.out.println("O 'F" +n+ "' é: " + fibonacci(n));

		System.out.println("O 'F" +n+ "' é: " + fibonacciNaoRec(n));

		scan.close();

	}


	//A) Metodo recursivo que receba n>1 e calcule Fn
	public static int fibonacci(int n){

		if(n < 2)
			return 1; 

		return fibonacci(n-1) + fibonacci(n-2);
	}

	static int fibonacciNaoRec(int n){

		int a = 1;
		int b = 0;
		int x;

		for (int i = 0; i < n; i++) {
			System.out.print(a + ", ");
			x = a;
			a += b;
			b = x;
		}
		return a;

	}
}
