package packages.factory;

public class NYPizzaStore extends PizzaStoreFactory{
	
	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		} else {
			return new NYStyleCheesePizza();
		}
	}

}
