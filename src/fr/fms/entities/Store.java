package fr.fms.entities;

import java.util.List;
/*
 * represents a new store
 */
public class Store {

	private List<Fruit> fruits;
	private List<Vegetable> vegetables;
	private List<Customer> customers;
	
	/**
	 * @param fruits
	 * @param vegetables
	 * @param customers
	 */
	public Store(List<Fruit> fruits, List<Vegetable> vegetables, List<Customer> customers) {
		super();
		this.fruits = fruits;
		this.vegetables = vegetables;
		this.customers = customers;
	}
	
	/**
	 * 
	 */
	public Store() {
		super();
	}



	/**
	 * @return the fruits
	 */
	public List<Fruit> getFruits() {
		return fruits;
	}

	/**
	 * @return the vegetables
	 */
	public List<Vegetable> getVegetables() {
		return vegetables;
	}

	/**
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	public void getMenu() {
		System.out.println("-------------------------Menu-------------------------\n");
		System.out.println("                  1- Nouveau client                   ");
		System.out.println("                  2- Bilan                            ");
		System.out.println("                  3- Fermer                           \n");
		System.out.println("------------------------------------------------------");
	}
}
