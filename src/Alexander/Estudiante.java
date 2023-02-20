package alex;

public class Estudiante  extends Princi {

	public String nombre;
	public int edad;
	public double peso;
	
	
	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	//constructores
	public Estudiante(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	public void mostrar()
	{
		System.out.println(this.nombre);
		System.out.println(this.edad);
		System.out.println(this.peso);
	}
	
	
	
	//METODOS
	public void mostrar(Estudiante estudiante)
	{
		estudiante.mostrar();
	}
	
	public boolean esMayor() {


		if (this.getEdad() >8) {

		System.out.println("es mayor de 8 años : "+ this.nombre);
		return true;

		}
		else {

		System.out.println("es menor de 8 años: "+ this.nombre);
		return false;
		}
		}
		public boolean entreRango() {

		if (this.getEdad() >11 && (this.getEdad()<16) ) {

		System.out.println("esta entre el rango de 12 y 15 años : "+ this.nombre);
		return true;

		}else {

		System.out.println("no esta entre el rango de 12 y 15 años : "+ this.nombre);
		return false;
	}


	
}
}
