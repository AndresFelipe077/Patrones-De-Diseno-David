

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio;
		Primooo nuevoPrimo = new Primooo();
		
		int [] valeatorio = new int [20];
		
		
		
		for (int i=0; i<20; i++) {
		aleatorio= (int)(Math.random()*20+1);
		valeatorio[i]=aleatorio;
		
		if (nuevoPrimo.calcularPrimo(valeatorio[i])==-1){
			
		System.out.println("numero :"+valeatorio[i]+"es primo");
	
		}
		else {
			System.out.println("numero :"+valeatorio[i]+"no es primo");
		}
		
			
		
		}
	}

}
