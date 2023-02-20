package areafiguras;

import java.util.Scanner;

public class IFabricaFiguras implements Ifabric  {
	private IArea figura;
	 private static Scanner in = new Scanner(System.in);

	    @Override
	    public void crearFigura() {
	        int opcion;
	        System.out.println("Áreas");
	        do{
	            System.out.println("Seleccione el área de una de las figuras: ");
	            System.out.println("1. Circulo");
	            System.out.println("2. Cuadrado");
	            System.out.println("3. Triángulo");
	            opcion = in.nextInt();
	        }while(opcion < 1 || opcion>3);
	        if(opcion==1)
	            figura = (IArea) new Circulo();
	        else if(opcion==2)
	            figura = (IArea) new Cuadrado();
	        else
	        	figura = (IArea) new Triangulo();
	        
	       figura.area();
	    }
	        

	    @Override
	    public IArea getFiguraArea() {
	        return figura;
	    }
}
