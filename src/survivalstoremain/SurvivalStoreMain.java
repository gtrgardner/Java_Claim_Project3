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
			System.out.println("2. LIST BY CATEGORY.");
			System.out.println("3. LIST BY NAME");
			System.out.println("4. LIST BY PRICE");
			System.out.println("5. VIEW WALLET.");
			System.out.println("6. VIEW CART");
			System.out.println("7. EXIT PROGRAM.");

			int choice = sc.nextInt();

			if (choice == 0) {
				// Administrator functions
			} else if (choice == 1) {

				prod = sd.ListBy(choice);
				PrintResults();

			} else if (choice == 2) {

				prod = sd.ListBy(choice);
				PrintResults();

			} else if (choice == 3) {

				prod = sd.ListBy(choice);
				PrintResults();

			} else if (choice == 4) {

				prod = sd.ListBy(choice);
				PrintResults();

			} else if (choice == 5) {

			} else if (choice == 6) {

			} else if (choice == 7) {
				select = false;
			}
			break;
		}
		sc.close();

	}

	public static void PrintResults() {

		System.out.printf("%2s%30s%60s%10s%15s\n", "Id", "Category", "Name", "Price", "In Stock");
		for (Products pr : prod) {

			System.out.println(pr);
		}
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
