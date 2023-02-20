package alex;

public class Princi { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public Estudiante(String nombre, int edad, double peso) {

		
	


		Estudiante [] estudiante= new Estudiante[5]; 
		
		Estudiante estudiante1 = new Estudiante ("Alexander", 1, 34);
		Estudiante estudiante2 = new Estudiante ("Vanesa", 17, 17);
		Estudiante estudiante3 = new Estudiante ("Sebastian", 13, 34);
		Estudiante estudiante4 = new Estudiante ("Faber", 6, 34);
		Estudiante estudiante5 = new Estudiante ("Orozco", 8, 34);
		
		estudiante[0] = estudiante1;
		estudiante[1] = estudiante2;
		estudiante[2] = estudiante3;
		estudiante[3] = estudiante4;
		estudiante[4] = estudiante5;
		
		System.out.println();
		estudiante1.esMayor();
		estudiante2.esMayor();
		estudiante3.esMayor();
		estudiante4.esMayor();
		estudiante5.esMayor();
		
		estudiante1.entreRango();
		estudiante2.entreRango();
		estudiante3.entreRango();
		estudiante4.entreRango();
		estudiante5.entreRango();
		
	}

}
