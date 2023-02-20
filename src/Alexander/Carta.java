package juego;

public class Carta {
	public int ATK;
    public int DEF;
    public String elemento;
	
	//constructores
	
	//constructor parametrizado
    public Carta(int ATK, int DEF, String elemento) {
	super();
	this.ATK = ATK;
	this.DEF = DEF;
	this.elemento = elemento;
    }

	//getters y setters
    public int getAtk() {
            return ATK;
    }

    public void setAtk(int ATK) {
            this.ATK = ATK;
    }

    public int getDef() {
            return DEF;
    }

    public void setDef(int DEF) {
            this.DEF = DEF;
    }

    public String getElemento() {
            return elemento;
    }

    public void setElemento(String elemento) {
            this.elemento = elemento;
    }

    //metodos
    public void mostrar (){
            System.out.println(this.ATK);
            System.out.println(this.ATK);
            System.out.println(this.elemento);
    }

    public void mostrar(Carta carta) {
             carta.mostrar();
            System.out.println("_________");
    }
    //metodo enfrentar
    public Carta enfrentar(Carta carta) {
        
        // agua VS fuego
        if((this.elemento=="agua" && carta.elemento=="fuego") || (carta.elemento=="agua" && this.elemento=="fuego")) {
            System.out.println("PRIMER ENFRENTAMIENTO");
            if(this.elemento=="agua") {
                    int decremento=(int)(carta.getAtk()*0.2);
                    int nuevoataque = carta.getAtk()-decremento;
                    System.out.println("1 primer enfrentamiento");
                    carta.setAtk(nuevoataque);
                    return this;
            }
            else if(carta.elemento=="agua" ) {
                    System.out.println("2 primer enfrentamiento");
                    int decremento=(int)(this.ATK*0.2);
                    int nuevoataque = this.ATK-decremento;
                    this.ATK=nuevoataque;
                    return carta;
            }
        }
        
        //  tierra VS agua
        else if((this.elemento=="tierra" && carta.elemento=="agua") || (carta.elemento=="tierra" && this.elemento=="agua")) {
            System.out.println("SEGUNDO ENFRENTAMIENTO");
            if(this.elemento=="tierra") {
                    int decremento=(int)(carta.getAtk()*0.2);
                    int nuevoataque = carta.getAtk()-decremento;
                    System.out.println("1 segundo enfrentamiento");
                    carta.setAtk(nuevoataque);
                    return this;
            }
            else if(carta.elemento=="tierra" ) {
                    System.out.println("2 segundo enfrentamiento");
                    int decremento=(int)(this.ATK*0.2);
                    int nuevoataque = this.ATK-decremento;
                    this.ATK=nuevoataque;
                    return carta;
            }
        }
        
        //fuego VS aire
        else if((this.elemento=="fuego" && carta.elemento=="aire") || (carta.elemento=="fuego" && this.elemento=="aire")) {
            System.out.println("TERCER ENFRENTAMIENTO");
            if(this.elemento=="fuego") {
                    int decremento=(int)(carta.getAtk()*0.2);
                    int nuevoataque = carta.getAtk()-decremento;
                    System.out.println("1 tercer enfrentamiento");
                    carta.setAtk(nuevoataque);
                    return this;
            }
            else if(carta.elemento=="fuego" ) {
                    System.out.println("2 tercer enfrentamiento");
                    int decremento=(int)(this.ATK*0.2);
                    int nuevoataque = this.ATK-decremento;
                    this.ATK=nuevoataque;
                    return carta;
            }
        }
        
        //aire VS tierra
        else if((this.elemento=="aire" && carta.elemento=="tierra") || (carta.elemento=="aire" && this.elemento=="tierra")) {
            System.out.println("CUARTO ENFRENTAMIENTO");
            if(this.elemento=="aire") {
                    int decremento=(int)(carta.getAtk()*0.2);
                    int nuevoataque = carta.getAtk()-decremento;
                    System.out.println("1 cuarto enfrentamiento");
                    carta.setAtk(nuevoataque);
                    return this;
            }
            else if(carta.elemento=="aire" ) {
                    System.out.println("2 cuarto enfrentamiento  ");
                    int decremento=(int)(this.ATK*0.2);
                    int nuevoataque = this.ATK-decremento;
                    this.ATK=nuevoataque;
                    return carta;
            }
        }
    return null;
    }

}
