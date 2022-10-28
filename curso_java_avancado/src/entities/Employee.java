package entities; //Pacote da classe 

public class Employee { //Nome da classe

	//Public: Método / Atributo pode ser usado em qualquer local
	
	//Atributos
	public String name;
	public double grossSalary;
	public double tax;
	
	//Métodos 
	//Double: Tipo do retorno do método
	public double nextSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	//Toda classe java é subclasse da classe object 
	//Object possui o método getclass(retorna tipo), toString(converte para texto)
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", nextSalary());
	}
}
