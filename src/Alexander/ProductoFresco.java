package eejer;

public class ProductoFresco extends Producto {

	//atributos
	private double fecha_de_envasado;
	private String pais_de_origen;
	
	
	public ProductoFresco(double fecha_de_envasado, String pais_de_origen) {
		super();
		this.fecha_de_envasado = fecha_de_envasado;
		this.pais_de_origen = pais_de_origen;
	}
	
	//metodos de claseeee
	
		public void mostrarInformacion() {
			System.out.println("fecha de envasado:" + this.fecha_de_envasado);
			System.out.println("su pais de origen es :" + this.pais_de_origen);
			System.out.println("su fecha de caducidad es :" + this.fecha_de_caducidad);
			System.out.println("su numero de lote :" + this.numero_de_lote);
			
		}
		
}
