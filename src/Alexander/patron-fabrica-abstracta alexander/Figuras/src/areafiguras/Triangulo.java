package areafiguras;

public class Triangulo {
	
	private double base;
	private double altura;
	
	
	public Triangulo() {
		this.base = 12;
		this.altura = 8;
		
	}

    
	public void area() {
		double resultado=0;
		resultado=(this.base*this.altura)/2;
		System.out.println("El área es: "+ resultado);
	}

	public String getSeleccion() {
		
		return "Has seleccionado el triangulo";
}
}
