package andrespizo_fabrica_abstracta;

public class Main {
	public static void main(String[] args) {
      	
		FactoryAbstracta a1 = FactoryProducto.getIFabrica(false);
		IFabrica fabrica = a1.getIFabrica("RECTANGULO");
		fabrica.calcularArea();
		
		IFabrica fabrica2 = a1.getIFabrica("CUADRADO");
		fabrica2.calcularArea();
		
		
		FactoryAbstracta a2 = FactoryProducto.getIFabrica(true);
		IFabrica fabrica3 = a2.getIFabrica("RECTANGULO");
		fabrica3.calcularArea();
		
		IFabrica fabrica4 = a2.getIFabrica("CUADRADO");
		fabrica4.calcularArea();
		
		FactoryAbstracta a3 = FactoryProducto.getIFabrica(false); 
		IFabrica fabrica5 = a3.getIFabrica("cuadrado");
		fabrica5.calcularArea();
		
	   }
}
