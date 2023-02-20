package patronFachada;
public class Cliente {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();
        // Se hace uso de las operaciones de alto nivel
        fachada.compra();
        fachada.compra();
        fachada.compra();
    }
}


