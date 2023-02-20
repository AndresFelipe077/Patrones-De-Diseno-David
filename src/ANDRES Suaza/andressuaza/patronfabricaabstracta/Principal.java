
package patronfabricaabstracta;

import patronfabricaabstracta.fabrica.FabricaPizza;
import patronfabricaabstracta.fabrica.IElementoMasa;
import patronfabricaabstracta.fabrica.IElementoSabor;
import patronfabricaabstracta.fabrica.IFabrica;

public class Principal {

    public static void main(String[] args) {
        
        IFabrica miFabrica = new FabricaPizza();
        
        miFabrica.crearElementos();
        IElementoMasa miMasa = miFabrica.getElementoMasa();
        IElementoSabor miSabor = miFabrica.getElementoSabor();
        System.out.println("Mi Pizza tiene: "+miMasa.getDatos()+miSabor.getInformacion());
    }
    
}
