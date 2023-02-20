package ejee;

public class Electrodomestico {
	
	//atributos
 protected double precioBase;
 protected String color;
 protected char consumoEergetico;
 protected double peso;
 
//constantes
 
 protected final static String colorpordefecto="blanco";
 protected final static char consumoenergiapordefecto='F';
 protected final static double presiopordefecto=100;
 protected final static double pesopordefecto= 5;

//constructores
 public Electrodomestico () {
	 this.precioBase = presiopordefecto;
	 this.color = colorpordefecto;
	 this.consumoEergetico = consumoenergiapordefecto;
	 this.peso = pesopordefecto;
 }
 
	 //constructor 2 parametros
	
	
public Electrodomestico(double precioBase, double peso) {
	super();
	this.precioBase = precioBase;
	this.peso = peso;
}


//constructor todos parametros

	public Electrodomestico(double precioBase, String color, char consumoEergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEergetico = consumoEergetico;
		this.peso = peso;
	}

	
	
	
	//getters y setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEergetico() {
		return consumoEergetico;
	}

	public void setConsumoEergetico(char consumoEergetico) {
		this.consumoEergetico = consumoEergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


//metodos
	
	public void comprobarConsumoEnergetico(char letra) {
		if (letra>=65 && letra <=75) {
			this.consumoEergetico = letra;
		}
		else {
			this.consumoEergetico = consumoenergiapordefecto;
		}
	}
		
	
	

	
	private void comprobarColor (String color) {
		
		String colores[]= {"blanco", "negro" ,"rojo" ,"azul" ,"gris"};
		boolean correcto =false;
	

	for(int i=0;i<colores.length && !correcto;i++) {
		if (colores [i].equals(color)) {
			correcto=true;
		}
	}

		if (correcto) {
			this.color=color;
		}
		else {
			this.color=colorpordefecto;
		}
 }
	
	
	public double precioFinal() {
		double precio=0;
		switch (consumoEergetico) {
		case 'A':
			precio+=100;
			break;
		case 'B':
			precio+=80;
			break;
		case 'C':
			precio+=60;
			break;
		case 'D':
			precio+=50;
			break;
		case 'E':
			precio+=30;
			break;
		case 'F':
			precio+=10;
			break;
		}
		if (peso>=0 && peso<19){
			precio+=10;
		}
		else if(peso>=20 && peso <=49) {
			precio+=50;
			
		}
		else if(peso>=50 && peso <=79) {
			precio+=80;
			
		}
		else if(peso>=80) {
			precio+=100;
			
		}
		return precioBase+precio;
		}
	}

	











 


