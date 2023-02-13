package andrespizo_fabrica_abstracta;

public class Circulo implements IFabrica {

	
	
	
	
	
	   @Override
	   public void calcularArea() {
		   int radio = 5;
		   double resultado = Math.PI * (radio*radio);
	      System.out.println("El area del circulo es: " + resultado);
	      System.out.println("AQUI ESTUVO ANDRES FELIPE SUAZA CERON : ");
	   }
}
