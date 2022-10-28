package modulos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;
import entities.Rent;

public class Terceiro {

	public static void main(String[] args) {

		Terceiro Obj = new Terceiro();
		Obj.Listas();

	}
	
	public void Memoria() {
		
		//Tipos valor(valor) são aqueles em que a info é guardada em uma caixinha
		//Exemplo: String, int, double.. etc
		
		//int p = 1;
		//System.out.printf("caixinha p, com %s armazenado dentro", p);
		//if (p == 1){
			//int q = 2; //Quando o escopo } for fechado a variável é eliminada
		//}
		//int r = p; //Cria uma cópia de p para r
		
		//Tipo ref(Orientado) são aqueles que a info é armazenada na memória e apontada por essas variáveis
		//Exemplo: classes
		
		//Product p1, p2, p3;
		//p1 = new Product("Armário",20.0,2);
		//p3 = new Product("Piso",30.0,50);
		//p2 = p1; //p2 passa a apontar para p1
		//p3 = p1; //p3 aponta para p1 e perde sua referência do objeto, q é eliminado pelo garbage collector 
		
	}
	
	public void Vetores() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n]; 
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("Average price = %.2f%n", avg);
		
		sc.close();
	}
	
	public void Alugueis() {
		
			Scanner sc = new Scanner(System.in);
			Rent[] vect = new Rent[10];
			
			System.out.print("How many rooms will be rented? ");
			int n = sc.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println();
				System.out.println("Rent #" + i + ":");
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt();
				vect[room] = new Rent(name, email);
			}
			
			System.out.println();
			System.out.println("Busy rooms:");
			for (int i=0; i<10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				}
			}
			
			sc.close();
	}
	
	public void Conversao() {
		
		//Boxing: Converter valor em referência
		int a = 20;
		Object obj = a;
		System.out.println(obj);
		
		//Unboxing: Converter referência em valor
		int b = 20;
		Object obj2 = b;
		int c = (int) obj2;
		System.out.println(c);
		
		//Wrapper classes: São classes equivalente a tipos primitivos
		Integer d = 10; //Classe para número inteiro (vantagem, aceita null)
		int e = d * 2;
		System.out.println(e);
		//Outras classes Double(double), Character(char)... 
		//Uteis ao definir atributos, exp: public Integer quantity;
	}
	
	public void Listas() {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("Berta");
		list.add("Alisson");
		list.add("Rodrigo");
		list.add(1, "Marco");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		list.remove("Maria");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'R');
		System.out.println(list.indexOf("Berta"));
		System.out.println(list.indexOf("Nenhum"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
			}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
	}
	
	
}
