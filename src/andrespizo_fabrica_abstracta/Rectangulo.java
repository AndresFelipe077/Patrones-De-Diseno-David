package andrespizo_fabrica_abstracta;

public class Rectangulo implements IFabrica {

	   @Override
	   public void calcularArea() {
		   //Rectangulo
		   int a = 5, b = 3;
		   int resultado = (a * b)/2;
	      System.out.println("El area del rectangulo es: " + resultado);
	   }
}
