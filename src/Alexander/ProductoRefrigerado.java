package eejer;

public class ProductoRefrigerado extends Producto{

	//atributos
	private String codigo_de_organismo;

	public ProductoRefrigerado(String codigo_de_organismo) {
		super();
		this.codigo_de_organismo = codigo_de_organismo;
	
	}
	
	//metodos de claseeee
	
			public void mostrarProductoRefrigerado() {
				System.out.println("su codigo dse organismo es:" + this.codigo_de_organismo);
				System.out.println("su fecha de caducidad es :" + this.fecha_de_caducidad);
				System.out.println("su numero de lote :" + this.numero_de_lote);
				
				
			}
			
	
	
}
