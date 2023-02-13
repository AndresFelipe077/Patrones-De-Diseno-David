package andrespizo_fabrica_abstracta;

public class FactoryProducto {

	public static FactoryAbstracta getIFabrica(boolean rounded)
	{
		/*if(rounded)
		{
			return new RoundedIFabricaFactory();
		}
		else
		{
			return new IFactory();
		}*/
		
		if(rounded) return new RoundedIFabricaFactory();
		else return new IFactory();
		
	}
}
