package areafiguras;

public class Cuadrado implements IArea{
	private double base;
	private double altura;
	
	//CONSTRCUTORES
	public Cuadrado() {
		this.base = 12;
		this.altura = 8;
	}

    //METODOS

	@Override
	public void area() {
		double resultado=0;
		resultado=this.base*this.altura;
		System.out.println("El área es: "+ resultado);
	}

	@Override
	public String getSeleccion() {
		// TODO Auto-generated method stub
		return "Has seleccionado el cuadrado";
	}

	
}
