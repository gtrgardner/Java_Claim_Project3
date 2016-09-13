package survivalstoremain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.util.Scanner;
//import java.io.*;

public class SurvivalStoreMain {

	public static List<Products> prod = new ArrayList<Products>();

	public static void AdminInterface() {

	}

	public static <getConnection> void UserInterface() {
		SurvivalDAOImpl sd = new SurvivalDAOImpl();

		Scanner sc = new Scanner(System.in);
		boolean select = true;

		while (select == true) {
			System.out.println("0. ADMINISTRATOR");
			System.out.println("1. SEE ALL PRODUCTS.");
			System.out.println("2. VIEW SHOPPING CART.");
			System.out.println("3. VIEW WALLET.");
			System.out.println("4. EXIT PROGRAM.");

			int choice = sc.nextInt();

			if (choice == 0) {
				// Administrator functions
			} else if (choice == 1) {

				prod = sd.findAllProducts();
				System.out.printf("%2s%30s%60s%10s%15s", "Id", "Category", "Name", "Price", "In Stock");
				for (Products pr : prod) {

					System.out.println(pr);

				}
				
			} else if (choice == 2) {

			}else if (choice == 3){
				
			}else if (choice == 4) {
				select = false;
			}
			break;
		}
		sc.close();

	}

	

	public static void main(String[] args) {

		// StoreApp.UserInterface();
		UserInterface();

	}

}

/*
 * prod = sd.byCatagory(); System.out.printf("%2s%30s%60s%10s%15s", "Id",
 * "Category","Name","Price", "In Stock"); for (Products pr: prod){
 * System.out.println(pr);
 */
