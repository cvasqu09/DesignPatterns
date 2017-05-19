package packages.factory;

public class ChicagoPizzaStore extends PizzaStoreFactory{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		} else if(type.equals("meat")){
			return new ChicagoStyleMeatPizza();
		} else {
			return new ChicagoStyleCheesePizza();
		}
	}

}
