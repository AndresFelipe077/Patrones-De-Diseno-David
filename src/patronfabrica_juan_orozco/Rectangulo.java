package patronfabrica_juan_orozco;

public class Rectangulo implements IFigura{

		int lado1=3;
		int lado2=4;

		@Override
		public void area() {
			System.out.println("el area del rectangulo es "+lado1*lado2);
			
		}
		
	
}
