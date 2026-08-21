package fr.fms.entities;

import java.util.List;
/*
 * represents a new cart
 */
public class Cart {

	private List<CartItem> items;
	
	/**
	 * @param items
	 */
	public Cart(List<CartItem> items) {
		super();
		this.items = items;
	}
	
	/**
	 * @return the items
	 */
	public List<CartItem> getItems() {
		return items;
	}
	
	/**
	 * Add a fruit in the list of cartItem with his quantity
	 * @return the items
	 */
	public CartItem addFruit(Fruit fruit, float quantity) {
		return null;
	}
	
	/**
	 * Add a fruit in the list of cartItem with his quantity
	 * @return the items
	 */
	public CartItem addVegetable(Vegetable vegetable, float quantity) {
		return null;
	}
}
