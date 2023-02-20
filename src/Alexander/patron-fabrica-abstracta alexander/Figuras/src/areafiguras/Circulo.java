package areafiguras;

public class Circulo implements IArea{
	
		private double pi;
		private double radio;
		
		//CONSTRCUTORES
		public Circulo() {
			this.pi = 3.1416;
			this.radio = 8;
			
		}

	    //METODOS
		@Override
		public void area() {
			double resultado=0;
			resultado=this.pi*(this.radio*this.radio);
			System.out.println("El área es: "+ resultado);
		}

		@Override
		public String getSeleccion() {
			// TODO Auto-generated method stub
			return "Has seleccionado el círculo";
		}
}
