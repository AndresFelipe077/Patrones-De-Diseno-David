package juego;


public class PrincipalCarta {
public static boolean validar(int num,int[] repartidas) {
		
		for(int i=0;i<12;i++) {
			 if(num == repartidas[i]) {
				 return false;
			 }
			
		}
		
		
		return true;
	}
	
	//METODO PARA REALIZAR EL ENFRENTAMIENTO
	public static Carta enfrentar2(Carta cartaj1,Carta cartaj2){
		if(cartaj1.getAtk()>cartaj2.getDef()) {
			return cartaj1;
		}
		if(cartaj1.getAtk()<cartaj2.getDef()) {
			return cartaj2;
		}
		if(cartaj1.ATK==cartaj2.getDef()) {
			return cartaj1.enfrentar(cartaj2);
		}
		return null;
	}

	public static void main(String[] args) {

		
		Carta[] masoCartas = new Carta[12];

		Carta[] maso1 = new Carta[6];
		Carta[] maso2 = new Carta[12];
		
		
		int[] cartasRepartidas = new int[12];
	
		masoCartas[0]= new Carta(30,45,"agua");
		masoCartas[1] = new Carta(20,60,"agua");
		masoCartas[2] = new Carta(15,90,"agua");
		masoCartas[3] = new Carta(10,45,"fuego");
		masoCartas[4] = new Carta(50,80,"fuego");
		masoCartas[5] = new Carta(40,50,"fuego");
		masoCartas[6] = new Carta(10,60,"tierra");
		masoCartas[7] = new Carta(25,45,"tierra");
		masoCartas[8] = new Carta(30,85,"tierra");
		masoCartas[9] = new Carta(25,30,"aire");
		masoCartas[10] = new Carta(70,45,"aira");
		masoCartas[11] = new Carta(20,55,"aire");
		
		
		/*---------for(int i=0;i<12;i++) {
			cartasRepartidas[i]=-1;
		}*/
		
		/*for(int i=0;i<12;i++) {
			System.out.println("valor =: "+cartasRepartidas[i]);
		}----------*/
		int index=0;
		int aleatorio=(int)(Math.random()*11+1);
		boolean band=true;
		
		while(band) {
			aleatorio=(int)(Math.random()*11+1);
			
			
			if(validar(aleatorio,cartasRepartidas)) {
				cartasRepartidas[index]=aleatorio;
				index++;
			}
			if(index==11) {
				band=false;
			}
							

		}
		
		for(int i=0;i<12;i++) {
			if(i<6) {
				maso1[i]=masoCartas[cartasRepartidas[i]];
			}
			if(i>5){
				maso2[i]=masoCartas[cartasRepartidas[i]];
			}
		}
		
		
		System.out.println("cartas maso1");
		for(int i=0;i<6;i++) {
			masoCartas[0].mostrar(maso1[i]);
		}
		System.out.println("cartas maso2");
		for(int i=6;i<12;i++) {
			masoCartas[0].mostrar(maso2[i]);
		}
		
		
		
		
		//cartas Repartidas
		for(int i=0;i<12;i++) {
			System.out.println("cartasRepartidas "+i+" ="+cartasRepartidas[i]);
		}	
		
		//masoCartas[0].mostrar(enfrentar2(maso1[4],maso2[7]));
		System.out.println("___________");
		
		masoCartas[0].mostrar(enfrentar2(masoCartas[0],masoCartas[3]));
		
		
		
	}

}


