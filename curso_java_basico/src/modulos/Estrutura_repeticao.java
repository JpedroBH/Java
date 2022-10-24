package modulos;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_repeticao {

	public static void main(String[] args) {
		// do while, while, for

		Estrutura_repeticao Obj = new Estrutura_repeticao();
		Obj.Estrutura_while();
		
	}
	
	public void Estrutura_while() {
		
		//Útil para quando não sabemos a quantidade de vezes que ocorrera a repetição
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		//Primeiro executa o cod e depois verifica a condição de pausa
		do {
			System.out.println("Menu ##########");
			System.out.println("1 - Sair");
		    opcao = sc.nextInt();
		} while (opcao != 1);
		
		double juros = 0;
		boolean multa = false;
		
		//Testa assim que o loop começa
		while (multa == false) {
			System.out.println("A multa foi paga?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			opcao = sc.nextInt();
			if (opcao == 1) {
				multa = true;
			}else {
				juros += 10.0;
			}
		}
		
		System.out.println("Valor do juros" + juros);
		
		sc.close();
		
	}
	
	public void Estrutura_for() {
		
		//Útil para quando sabemos a quantidade de vezes que ocorrera a repetição
		
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
	}

}
