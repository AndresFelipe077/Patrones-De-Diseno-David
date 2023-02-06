package patronfabrica_juan_orozco;

public class Circulo implements IFigura{

	
	int radio =6;
	@Override
	public void area() {

		System.out.println("el area del circulo es: "+Math.PI*Math.pow(radio,2));
		
	}


}
