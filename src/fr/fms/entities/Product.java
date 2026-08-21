package fr.fms.entities;
/*
 * represents a new product
 */
public abstract class Product {
	
	private String name;
	private int stock;
	private double price;
	private String unity;
	/**
	 * @param name
	 * @param stock
	 * @param price
	 */
	public Product(String name, int stock, double price, String unity) {
		super();
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.unity = unity;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @return the unity
	 */
	public String getUnity() {
		return unity;
	}
	
}
