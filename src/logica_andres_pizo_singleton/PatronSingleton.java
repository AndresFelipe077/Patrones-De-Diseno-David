package logica;

public class PatronSingleton {

	public static void main(String[] args) {
		
        Constante constante = Constante.getInstance();
        
        System.out.println(constante);

        constante.setDatos("Iva", 0.16);
        
        System.out.println(constante);
        
        Constante constante2 = Constante.getInstance();
        
        constante.setDatos("Iva", 0.18);
        
        System.out.println(constante2);
        
    }


}
