package fr.fms.entities;
/*
 * represents a line item in the customer's shopping cart
 */
public class CartItem {
	

	private Product product;
	private float quantity;
	/**
	 * @param product
	 * @param quantity
	 */
	public CartItem(Product product, float quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @return the quantity
	 */
	public float getQuantity() {
		return quantity;
	}
	
}
