package fr.fms.entities;
/*
 * represents a new vegetable
 */
public class Vegetable extends Product {

	private boolean boolVegetable;
	
	public Vegetable(String name, int stock, double price, String unity, boolean booleanVegetable) {
		super(name, stock, price, unity);
		this.boolVegetable = booleanVegetable;
	}

	/**
	 * @return the boolVegetable
	 */
	public boolean isBoolVegetable() {
		return boolVegetable;
	}

	
}
