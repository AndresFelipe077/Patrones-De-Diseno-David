package patronFachada;

public class GestorInventario {
	private int stock;

    public GestorInventario() {
        this.stock = 2;
    }
    
    public boolean retirarStock(){
        if(stock > 0){
            System.out.println("Producto listo para envio");
            stock--;
            return true;
        }else{
            System.out.println("Producto no disponible, no hay existencias, entrega reprogramada!");
            return false;
        }
    }    

}
