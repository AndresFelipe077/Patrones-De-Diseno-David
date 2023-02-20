package patronFachada;

public class Fachada {
	//Instancias de los subsistemas que gestiona
    private GestorCompra compra = new GestorCompra();
    private GestorInventario inventario = new GestorInventario();
    private GestorEnvio envio = new GestorEnvio();
    
    //Metodo de alto nivel que se ofrece al cliente
    public void compra(){
        if(compra.comprar() && inventario.retirarStock()){
             envio.enviarPedido();       
        }
    }

}
