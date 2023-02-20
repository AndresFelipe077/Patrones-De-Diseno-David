package ejee;

public class Ejerciicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Electrodomestico(double precioBase, String color, char consumoEergetico, double peso)
		//
		
		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];
		listaElectrodomesticos[1] = new Electrodomestico (111, "50", 'A', 50);
		listaElectrodomesticos[2] = new Lavadora (44,55);
		listaElectrodomesticos[3] = new Electrodomestico (111, "50", 'A', 50);
		listaElectrodomesticos[4] = new Electrodomestico (111, "50", 'A', 50);
		listaElectrodomesticos[5] = new Electrodomestico (111, "50", 'A', 50);
		listaElectrodomesticos[6] = new Television (111, "50", 'A', 50);
		listaElectrodomesticos[7] = new Electrodomestico (111, "50", 'A', 50);
		listaElectrodomesticos[8] = new Electrodomestico (111, "50", 'A', 50);
		listaElectrodomesticos[9] = new Electrodomestico (111, "50", 'A', 50);
		listaElectrodomesticos[10] = new Electrodomestico (111, "50", 'A', 50);
	}
	{
	
	double sumaElectrodomesticos=0;
	double sumaTelevisores=0;
	double sumaLavadoras=0;
	
	for (int i=0;i<listaElectrodomesticos.length;i++) {
		
		if (listaElectrodomesticos[i] instanceof Electrodomestico) {
			sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
		}
		
		if (listaElectrodomesticos[i] instanceof Lavadora) {
			sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
		}
		if (listaElectrodomesticos[i] instanceof Television) {
			sumaTelevisores+=listaElectrodomesticos[i].precioFinal();
		}
		
		
	}
	System.out.println("la suma del precio de los electrodomesticos es de :"+sumaElectrodomesticos);
	System.out.println("la suma del precio de los televisores es de :"+sumaTelevisores);
	System.out.println("la suma del precio de las lavadoras es de :"+sumaLavadoras);
	
	
}}




