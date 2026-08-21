package fr.fms.entities;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		Store store = new Store();
		store.getMenu();
		System.out.println("Quelle option choisissez vous? ");
		choice = Integer.parseInt(scan.nextLine());
		
		switch (choice) {
		
		case 1:
			
			break;
		case 2:
			
			break;
			
		case 3:
			
			break;
		
		default:
			
			 System.out.println("Choix invalide");
		}
	}
}
