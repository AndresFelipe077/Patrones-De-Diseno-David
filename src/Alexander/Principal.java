

package recu;
import java.util.Scanner;
public class Principal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calcular formula  X^2 + (B*X)+C  donde x sea un numero > 2
		
		
		double a=8,b=2,c=10,p1,x1=0,x2=0,p2;
		
		p1=(b*b)-(4*a*c);
		
		if(a!=0 && p1>0) {
			
		p2=Math.sqrt(p1);
		
		x1=(-b+p2)/(2*a);
		x2=(-b-p2)/(2*a);
		
		System.out.println("el valor de la ecuacion para x1 es:"+x1);
		System.out.println("el valor de la ecuacion para x2 es:"+x2);
		
		}
		else {
			
			System.out.println("los numeros ingresados en las variables no cumplen con los valores de las ecuaciones: ");
		}
		
		
		
		
	}

}

