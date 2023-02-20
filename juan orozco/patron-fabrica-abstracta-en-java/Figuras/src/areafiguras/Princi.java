package areafiguras;

public class Princi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ifabric miFabrica = new IFabricaFiguras();
        
        miFabrica.crearFigura();
        IArea miFigura = miFabrica.getFiguraArea();
        
        System.out.println(""+miFigura.getSeleccion());
    }
	}


