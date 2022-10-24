package modulos;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		// Estrutura Matriz
		
		//Começam em '0,0', dados do mesmo tipo, tamanho fixo, duas dimensões

		Matrizes Obj = new Matrizes();
		Obj.Estrutura_Matrizes();

	}
	
	public void Estrutura_Matrizes() {
		
		//Declaração 
		double[][] A;
		
		//Instanciação linha, coluna
		A = new double[3][4];
		
		A[1][2] = 10;
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] mat = new int[M][N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
