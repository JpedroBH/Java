package entities;

//Classe para representar melhor o triângulo(entidade)
//Diminuem a ocupação na memória e permitem o reaproveitamento do cod
public class Triangle {
	
	//atributos, informações passadas para a classe
	public double a;
	public double b;
	public double c;
	
	//Método para calcular a área(função)
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
