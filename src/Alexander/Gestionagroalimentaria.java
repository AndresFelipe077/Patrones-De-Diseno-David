package eejer;

public class Gestionagroalimentaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1= new Producto("2022", 22);
		ProductoFresco pro_fresco = new ProductoFresco(21.32,"colombia");
		ProductoRefrigerado prorefri = new ProductoRefrigerado ("esta en mal estado");
		ProductoCongelado proconge = new ProductoCongelado (22);

		pro_fresco.mostrarInformacion();
		prorefri.mostrarProductoRefrigerado();
		proconge.mostrarInformacion();
	}

}
