package andressuaza;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

public static <E> E getLastElement(ArrayList<E> list)
{
if((list != null) && (list.isEmpty() == false))
{
int lastIdx = list.size() - 1;
E lastElement = list.get(lastIdx);
return lastElement;
}
else
return null;
}

public static void Iterador()
{
ArrayList<String> col = new ArrayList<String>();
col.add("blanco");
col.add("Negro");
col.add("Azul");
col.add("Rosa");
col.add("Gris");

System.out.println("Ultimo elemento de col es: " + getLastElement(col));

for(int i = 0; i < col.size(); i++)
{
System.out.println(col.get(i) + " ");
}

Iterator<String> elem = col.iterator();
while(elem.hasNext())
{
if(elem.next().equals("blanco"))
{
elem.remove();
}
}

System.out.println(col);
}

public static void objetosNavidad()
{

//7 articulos de navidad
ArrayList<String> objetosNavidad = new ArrayList<String>();
objetosNavidad.add("Estrella");
objetosNavidad.add("Villancicos");
objetosNavidad.add("Arbol");
objetosNavidad.add("Luces");
objetosNavidad.add("Campana");
objetosNavidad.add("Arbol");
objetosNavidad.add("Galleta");

//Mostrar lista completa
for(int i = 0; i < objetosNavidad.size(); i++)
{
System.out.println(objetosNavidad.get(i));
}


//si esta arbol colocar mensaje "encontramos arbol"
Iterator<String> iterator = objetosNavidad.iterator();
while(iterator.hasNext())
{
if(iterator.next().equals("Arbol"))
{
System.out.println("\n");
System.err.println("Encontramos arbol");
System.out.println("\n");
}
}


//Agregar un elemento en medio de los dos ultimos

for(int i = 0; i < objetosNavidad.size(); i++)
{
if(iterator.hasNext() == false)
{
objetosNavidad.add(objetosNavidad.size()-1, "REYES MAGOS");
}
}


//Mostrar array
for(int i = 0; i < objetosNavidad.size(); i++)
{
System.err.println(objetosNavidad.get(i));
System.out.println(i);
}



}

public static void main(String[] args) {

//Iterador();
objetosNavidad();

}
}


	
	

