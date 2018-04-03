package br.com.semantix.datalab.exerc10.matriz;

import java.util.Scanner;

public class Exercicio_10 {

	static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[][] m1 = new int[2][2];
		System.out.println("Preencha a primeira matriz.");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Digite o " + (j+1) + "º numero: ");
				m1[i][j] = tec.nextInt();
			}
		}
		
		
		int[][] m2 = new int[2][2];
		System.out.println("Preencha a segunda matriz.");
		for (int k = 0; k < 2; k++) {
			for (int l = 0; l < 2; l++) {
				System.out.print("Digite o " + (l+1) + "º numero: ");
				m2[k][l] = tec.nextInt();
			}
		}
		
		
		int[][] m3 = new int[2][2];
		
		if(matriz(m1, m2, m3)){
			resultadoMatriz(m3);
		}
				

	}
	
	static boolean matriz(int[][] m1, int[][] m2, int[][] m3){
		
		boolean bate = true;
		
		if (m1[0].length != m2.length) 
			bate = false;
		else
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				for (int k = 0; k < m2.length; k++) {
					
					
					m3[i][j] += m1[i][k] * m2[k][j];
				}
			}	
		}
		return bate;
	}
	
	static void resultadoMatriz(int[][] m){
		
		
		System.out.println("Resultado matriz: ");
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " |");
			}
			System.out.println();
		}
	}

}
