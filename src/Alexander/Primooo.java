
public class Primooo {

	public int calcularPrimo(int num) {
		
		int cont=0;
		
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				cont++;
			}
		}
		if(cont==2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
