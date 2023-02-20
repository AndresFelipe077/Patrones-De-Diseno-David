package ejee;

public class Lavadora extends Electrodomestico {

	private int carga;
	
	
	//constante
	private final static int cargapordefecto=5;
	
	
	public Lavadora() {
	
	}


	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}


	public Lavadora(double precioBase, String color, char consumoEergetico, double peso) {
		super(precioBase, color, consumoEergetico, peso);
		// TODO Auto-generated constructor stub
	}


	public Lavadora(int carga) {
		super();
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	public static int getCargapordefecto() {
		return cargapordefecto;
	}

	public double precioFinal() {
		
		double precio=super.precioFinal();
		
		
		if (carga>30) {
			precio+=50;
			
		}
		return precio;
	}
	
	
	
	
	
}
