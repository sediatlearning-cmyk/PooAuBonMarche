package fr.fms.entities;
/*
 * represents a new fruit
 */
public class Fruit extends Product{

	boolean boolFruit;
	
	public Fruit(String name, int stock, double price, String unity, boolean boolFruit) {
		super(name, stock, price, unity);
		this.boolFruit = boolFruit;
	}

	/**
	 * @return the boolFruit
	 */
	public boolean isBoolFruit() {
		return boolFruit;
	}

	
}
