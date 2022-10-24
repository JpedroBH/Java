package modulos;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_sequencial {

	public static void main(String[] args) {
		// Saída de dados, casting, entrada de dados
		
		Estrutura_sequencial Obj = new Estrutura_sequencial();
		Obj.Entrada_dados();

	}
	
	public void Saida_dados() {
		
		//Muda o padrão númerico para US onde ',' -> '.'
		Locale.setDefault(Locale.US);
		
		//Instancia e atribui as variáveis
		String nome = "Jp";
		int idade = 19;
		double renda = 4000.0;
		System.out.println("Bom dia! " + nome + " sua idade é " + idade);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}
	
	public void Casting() {
		
		//Casting é a conversão de um valor para o outro
		
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		//resultado = a / b;
		resultado = (double) a / b;
		System.out.println(resultado);
		
		double c;
		int d;
		c = 5.0; //.0 boa norma
		//d = c;
		d = (int) c;
		System.out.println(d);
		
	}
	
	public void Entrada_dados() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um texto, número, real, caractere e um texto qualquer:");
		String w = sc.next();
		int x = sc.nextInt();
		double y = sc.nextDouble();
		char z = sc.next().charAt(0);
		
		//Ao usar um nextline depois de outro leitor ele consome o espaço vazio do final do anterior 
		//Corrigimos isso dando dois nextline 
		sc.nextLine();
		String Teste = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(w + " " + x + " " + y + " " + z + " " + Teste);
		
		sc.close();
		
	}
	
	public void funcoes() {
		
		//Funções matemáticas nativas do ide
		
		double x = 3.0;
		double z = -5.0;
		Double A, B;
		
		A = Math.sqrt(x);
		B = Math.abs(z);
		System.out.println("Raiz de " + x + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
	}
}
