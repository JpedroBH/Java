package entities;

public class Product {

	//Atributos
	private String name;
	private double price;
	private int quantity;
	
	//Construtor: Permite atribuição de valor na hora de instanciar o objeto 
	//Sobrecarga: Vários contrutores com diferentes necessidades de atribuições
	public Product() {
	}
	public Product(String name, double price, int quantity) {
		this.name = name; //this: diferencia atributo da variável local
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Encapsulamento: Esconde detalhes, expondo operações seguras
	//Não se deve poder alterar atributos diretamente, apenas pela classe set. 
	//Exemplo: product.name = "Computer"; / product.setName("Computer");
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
		
	//Métodos
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//ToString
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
	
}
