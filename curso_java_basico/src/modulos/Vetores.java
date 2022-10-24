package modulos;

public class Vetores {

	public static void main(String[] args) {
		// Estrutura de vetor, for each
		
		//Começam em 0, dados do mesmo tipo, tamanho fixo, única dimensão

		Vetores Obj = new Vetores();
		Obj.Estrutra_Vetores();
			
	}
	
	public void Estrutra_Vetores() {
		
		//Declarar
		int[] A;
		double[] B;
		String[] C;
		
		//Instanciar (tamanho)
		A = new int[10];
		B = new double[5];
		C = new String[8];
		
		//Atribuir
		A[3] = 10;
		
		//Atribuindo em sequência 
		for (int i=0; i<5; i++) {
			B[i] = i + 10;
		}
		
		//Lendo dados vetor
		for (int i=0; i<5; i++) {
			System.out.println(B[i]);
		}
		
		//Lendo dados com for each
		for (double n : B) {
			System.out.println(n);
		}

		C[1] = "Maria";
		
	}

}