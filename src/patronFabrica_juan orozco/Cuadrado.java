package patronFabrica;

public class Cuadrado implements IFigura{

	int lado1=2;
	int lado2=2;

	
	@Override
	public void area() {
		System.out.println("el area del cuadrado es: "+lado1*lado2);
		
	}
	
	
}
