package fr.fms.entities;
/*
 * represents a new customer
 */
public class Customer {

	private String firstName;
	private String lastName;
	private Cart cart;
	/**
	 * @param firstName
	 * @param lastName
	 * @param cart
	 */
	public Customer(String firstName, String lastName, Cart cart) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cart = cart;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @return the cart
	 */
	public Cart getCart() {
		return cart;
	}
	
	public String getFullName() {
		String fullName = getFirstName() + " " + getLastName(); 
		return fullName;
	}
}
