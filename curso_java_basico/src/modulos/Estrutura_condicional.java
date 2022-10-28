package modulos;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_condicional {

	public static void main(String[] args) {
		// if, else, elseif, operadores lógicos
		// estrutura cumulativa, switch 
		
		Estrutura_condicional Obj = new Estrutura_condicional();
		Obj.Estrutura_simples();

	}
	
	public void Estrutura_simples() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		if (a < b && a < c) { //Testa se a é menor(<) que b e(&&) se a é menor que c  
		System.out.println("MENOR = " + a);
		}
		else if (b < c) { //Se o primeiro if for falso faz esse teste
		System.out.println("MENOR = " + b);
		}
		else { //Se tudo for falso então executa a linha abaixo
		System.out.println("MENOR = " + c);
		}
		
		//if else 1 linha
		String teste = ((a > c) ? "a maior que c" : "a menor que c");
		System.out.println(teste);
		
		//if 1 linha
		if (teste == "") teste = "teste";
		
		sc.close();
		
		//Estrutura cumulativa, valor recebe ele mesmo mais o outro
		a += b;
		
		//Operadores bitwise
		//Pega a sequencia binária das expressões, e compara num a num
		
		int mask = 0b100000;
		int n = 20;
		if ((n & mask) != 0) {
		System.out.println("6th bit is true!");
		}
		else {
		System.out.println("6th bit is false");
		}
		
		//Escopo: Tomar cuidado ao acessar variáveis de fora do escopo 
		//if (2 > 1) {
		//	String escopo = "teste"; teste só pode ser acessado aqui dentro
		//}
		//System.out.println(escopo);
		
		
	}
	
	public void Estrutra_switch() {
		
		//Similar a if, opera sobre uma única váriavel
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
		dia = "domingo";
		break;
		case 2:
		dia = "segunda";
		break;
		default:
		dia = "valor invalido";
		break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
		
	}
}
