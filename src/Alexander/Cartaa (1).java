package juegoo;

public class Cartaa {

	int ATK=0;
	int DEF=0;
	String Elemento;
	
	public int getATK() {
		return ATK;
	}
	public void setATK(int aTK) {
		ATK = aTK;
	}
	public int getDEF() {
		return DEF;
	}
	public void setDEF(int dEF) {
		DEF = dEF;
	}
	public String getElemento() {
		return Elemento;
	}
	public void setElemento(String elemento) {
		Elemento = elemento;
	}


	public Cartaa() {
		super();
	}

	public Cartaa(int aTK, int dEF, String elemento) {
		super();
		ATK = aTK;
		DEF = dEF;
		Elemento = elemento;
	}
	
	public void mostrar () {
		System.out.println("Ataque : "+ this.ATK);
		System.out.println( "Defensa: "+ this.DEF);
		System.out.println("Elemento: "+ this.Elemento);
	}
	
	public void mostrar(Cartaa carta) {
		carta.mostrar();
			
	}
	
	public Cartaa enfrentar(Cartaa carta) {
		
	
	if ((this.Elemento=="agua" && this.Elemento=="fuego") || (carta.Elemento=="agua" && carta.Elemento=="fuego")) {
	
		int decremento,newataque;
		
		/*decremento=(this.getElemento()*20);*/
		System.out.println("ATK "+this.ATK);
		
		
	}
		System.out.println("ATK "+this.ATK);
		System.out.println("ATK "+ carta.getATK()*0.20);
		
		return this;
		
	
	}
	
	
}
	

