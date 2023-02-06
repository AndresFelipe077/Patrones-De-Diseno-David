package patronfabrica_juan_orozco;

public class FactoryFigura {

	public IFigura getFigura(String figura) {
		
		if(figura == null) {
			return new FiguraVacia();
		}
		if(figura.equalsIgnoreCase("Cuadrado")) {
			return new Cuadrado();
		}
		if(figura.equalsIgnoreCase("Rectangulo")) {
			return new Rectangulo();
		}
		if(figura.equalsIgnoreCase("Circulo")) {
			return new Circulo();
		}
		
		return new FiguraVacia();
	}
}
