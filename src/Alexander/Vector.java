package multiplo;
import java.util.Stack;
public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numero = new int [10];
		
		for (int k=0; k<10; k++) {
			
			int aleatorio= (int)(Math.random()*10);
			numero[k]=aleatorio;
			
			
		}
		
		for (int k=0; k< numero.length; k++){
		if (numero [k]%2==0) {
			System.out.println(" numeros : " +numero[k]+"= multiplo");
		}
		
		else System.out.println("num :"+numero [k]+  "no es multiplo");
		}
		
		
		
		
		
	}

}
