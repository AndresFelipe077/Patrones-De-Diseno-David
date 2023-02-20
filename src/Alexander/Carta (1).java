package gamee;

public class Carta {
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

	public Carta() {
		super();
	}

	public Carta(int aTK, int dEF, String elemento) {
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
	
	public void mostrar(Carta carta) {
		carta.mostrar();
			
	}
	
	public Carta enfrentar(Carta carta) {
		
		int newatake=0;
		if  ((carta.Elemento=="agua" && carta.Elemento=="fuego") || (this.Elemento=="fuego" && this.Elemento=="agua")){
			
			
			if (this.Elemento=="agua") {
				System.out.println("aqui toy desde el agua this: ");
				int ATK=this.ATK;
				ATK=(int)((int) ATK*0.2);
				newatake = this.ATK-ATK;
				carta.setATK(newatake);
				
			}
			else if (carta.Elemento=="agua") {
				System.out.println("entro por agua carta: ");
				int ATK=carta.ATK;
				ATK=(int)((int) ATK*0.2);
				newatake=carta.getATK()+ATK;
				carta.setATK(newatake);
					 
			}

			return this;
			}
		
		
		
		if  ((carta.Elemento=="agua" && carta.Elemento=="fuego") || (this.Elemento=="fuego" && this.Elemento=="agua")){
			
			
			if (this.Elemento=="agua") {
				System.out.println("aqui toy desde el agua this: ");
				int ATK=this.ATK;
				ATK=(int)((int) ATK*0.2);
				newatake = this.ATK-ATK;
				carta.setATK(newatake);
				
			}
			else if (carta.Elemento=="agua") {
				System.out.println("entro por agua carta: ");
				int ATK=carta.ATK;
				ATK=(int)((int) ATK*0.2);
				newatake=carta.getATK()+ATK;
				carta.setATK(newatake);
					 
			}
			
			if  ((carta.Elemento=="agua" && carta.Elemento=="fuego") || (this.Elemento=="fuego" && this.Elemento=="agua")){
				
				
				if (this.Elemento=="agua") {
					System.out.println("aqui toy desde el agua this: ");
					int ATK=this.ATK;
					ATK=(int)((int) ATK*0.2);
					newatake = this.ATK-ATK;
					carta.setATK(newatake);
					
				}
				else if (carta.Elemento=="agua") {
					System.out.println("entro por agua carta: ");
					int ATK=carta.ATK;
					ATK=(int)((int) ATK*0.2);
					newatake=carta.getATK()+ATK;
					carta.setATK(newatake);
						 
				}
				
				return this;
				}
			
			if  ((carta.Elemento=="agua" && carta.Elemento=="fuego") || (this.Elemento=="fuego" && this.Elemento=="agua")){
				
				
				if (this.Elemento=="agua") {
					System.out.println("aqui toy desde el agua this: ");
					int ATK=this.ATK;
					ATK=(int)((int) ATK*0.2);
					newatake = this.ATK-ATK;
					carta.setATK(newatake);
					
				}
				else if (carta.Elemento=="agua") {
					System.out.println("entro por agua carta: ");
					int ATK=carta.ATK;
					ATK=(int)((int) ATK*0.2);
					newatake=carta.getATK()+ATK;
					carta.setATK(newatake);
						 
				}

				return this;
				}
				
			return this;
			}
			
			
			return carta;
			
			

		
			}
		
	
		
	
	}

	
		
	/*
		if ((this.Elemento=="Agua" && carta.Elemento=="Fuego" ) (carta.Elemento=="agua" && carta.Elemento=="fuego")){
		
			int decremento=0,nuevoAtk=0;
			
			
		System.out.println(" ");
		System.out.println("El ganador es Agua");
		
		decremento= (int)((int)this.ATK*0.20);
		
	
		nuevoAtk=(int)(this.ATK-decremento);
		this.setATK(nuevoAtk);
		

		System.out.println(" ");
		System.out.println("al elemento: " +this.Elemento);
		System.out.println("le bajó el ataque a: " + this.getATK());
		return carta;
		
		}
	
		
		else if(this.Elemento=="Fuego" && carta.Elemento=="Agua") {
			
			int decremento=0,nuevoAtk=0;
			
			
			System.out.println(" ");
			System.out.println("El ganador es Agua");
			
			decremento= (int)((int)carta.ATK*0.2);
			
		
			nuevoAtk=(int)(carta.ATK-decremento);
			carta.setATK(nuevoAtk);
			

			System.out.println(" ");
			System.out.println("al elemento: " +carta.Elemento);
			System.out.println("le bajó el ataque a: " + carta.getATK());
	}
	
	
		return this;
	
		*/



