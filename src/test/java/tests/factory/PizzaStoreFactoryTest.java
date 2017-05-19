package tests.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import packages.factory.*;

public class PizzaStoreFactoryTest {

	@Test
	public void ChicagoPizzaStore_CreatePizza_Cheese() {
		PizzaStoreFactory chicagoStore = new ChicagoPizzaStore();
		Pizza cheesePizza = chicagoStore.createPizza("cheese");	
		assertEquals(cheesePizza.getName(), "Chicago Cheese Pizza");
	}
	
	@Test
	public void ChicagoPizzaStore_createPizza_Meat() {
		PizzaStoreFactory chicagoStore = new ChicagoPizzaStore();
		Pizza meatPizza = chicagoStore.createPizza("meat");	
		assertEquals(meatPizza.getName(), "Chicago Meat Pizza");
	}
	
	@Test
	public void NYPizzaStore_createPizza_Cheese(){
		PizzaStoreFactory nyStore = new NYPizzaStore();
		Pizza cheesePizza = nyStore.createPizza("cheese");	
		assertEquals(cheesePizza.getName(), "NY Cheese Pizza");
	}
	
	@Test
	public void NYPizzaStore_createPizza_UnknownType_Cheese(){
		PizzaStoreFactory nyStore = new NYPizzaStore();
		Pizza cheesePizza = nyStore.createPizza("UnknownType");	
		assertEquals(cheesePizza.getName(), "NY Cheese Pizza");
	}

}
