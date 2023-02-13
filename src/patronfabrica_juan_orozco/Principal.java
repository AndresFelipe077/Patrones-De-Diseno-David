package patronfabrica_juan_orozco;

public class Principal {

	public static void main(String[] args) {
		FactoryFigura figura = new FactoryFigura();
		
		IFigura fg1 = figura.getFigura("Circulo");
		fg1.area();
		
		IFigura fg2 = figura.getFigura("Rectangulo");
		fg2.area();
		
		IFigura fg3 = figura.getFigura("Rectangul");
		fg3.area();

	}

}
