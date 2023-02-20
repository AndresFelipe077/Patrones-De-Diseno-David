package eejer;

public class ProductoCongelado extends Producto{
	//atributos
	private double temperatura_de_congelacion;

	public ProductoCongelado(double temperatura_de_congelacion) {
		super();
		this.temperatura_de_congelacion = temperatura_de_congelacion;
	}
	
	//metodos de claseeee
	
			public void mostrarInformacion() {
				
				System.out.println("su temperatura de congelado es :" + this.temperatura_de_congelacion);
				System.out.println("su fecha de caducidad es :" + this.fecha_de_caducidad);
				System.out.println("su numero de lote :" + this.numero_de_lote);
				
			}
			
	
	
	
}
