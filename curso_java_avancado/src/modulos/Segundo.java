package modulos;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Product;

public class Segundo {

	public static void main(String[] args) {

		Segundo Obj = new Segundo();
		Obj.Conta();

	}
	
public void Produto() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
	
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		sc.close();
		
	}

public void Conta() {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	Account account; //Instanciando fora do escopo, ira ser definido posteriormente de qualquer forma por causa do if/else
	
	System.out.println("Enter account data: ");
	System.out.print("Enter account number: ");
	int number = sc.nextInt();
	System.out.print("Enter account holder: ");
	sc.nextLine();
	String holder = sc.nextLine();
	//Account account = new Account(number, holder);
	
	System.out.print("Is there an initial deposit (y/n)? ");
	char option = sc.next().charAt(0);
	
	if (option == 'y') {
		System.out.print("Enter initial deposit value: ");
		double balance = sc.nextDouble();
		account = new Account(number, holder, balance);
		//account.setBalance(balance);
	}else {
		account = new Account(number, holder);
	}
	
	System.out.println();
	System.out.println("Account data: ");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter a deposit value: ");
	double deposit = sc.nextDouble();
	account.deposit(deposit);
	System.out.println("Updated account data: ");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter a withdraw value: ");
	double withdraw = sc.nextDouble();
	account.withdraw(withdraw);
	System.out.println("Updated account data: ");
	System.out.println(account);
	
	sc.close();
	
	}

}
