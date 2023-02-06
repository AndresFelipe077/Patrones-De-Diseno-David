package patronfabrica_juan_orozco;

public class Principal {

	public static void main(String[] args) {
		FactoryFigura figura = new FactoryFigura();
		
		IFigura fg1 = figura.getFigura("Cuadrado");
		fg1.area();
		
		IFigura fg2 = figura.getFigura("Rectangulo");
		fg2.area();
		
		IFigura fg3 = figura.getFigura("Circulo");
		fg3.area();

	}

}
