package ejee;

public class Television extends Electrodomestico {

	private int resolucion;
	private boolean sintonizadorTdt;
	
	
	private final static int resolucionpordefecto = 20;


	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}


	public Television(double precioBase, String color, char consumoEergetico, double peso) {
		super(precioBase, color, consumoEergetico, peso);
		// TODO Auto-generated constructor stub
	}
	
	
public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}


	public void setSintonizadorTdt(boolean sintonizadorTdt) {
		this.sintonizadorTdt = sintonizadorTdt;
	}


	public static int getResolucionpordefecto() {
		return resolucionpordefecto;
	}


public double precioFinal () {
	double plus=super.precioFinal();
	if (this.getResolucion()>40) {
		plus+=precioBase*0.3;
		
	}
	if (this.isSintonizadorTdt()) {
		plus+=50;
	}
	return plus;
}
	
	
}
