package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
//	attribute
	public static final int MAX_QTY = 10;
	private ArrayList<DigitalVideoDisc> arrlistDisc = new ArrayList<DigitalVideoDisc>();

	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	private MyDate dateOrder;

	
	public MyDate getDateOrder() {
		return dateOrder;
	}

	//
//	constructor
	public Order() {
		super();
		nbOrders++;
		System.out.println("Enter the date of order (Ex: 10 07 2000) : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		dateOrder = new MyDate(arr[0], arr[1], arr[2]);

		if (nbOrders >= MAX_LIMITTED_ORDERS) {
			System.out.println("You reach the maximum number of order! Can not creat a new order");
			return;
		}
	}

//	methods
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (arrlistDisc.size() == MAX_QTY) {
			System.out.println("Your cart is full! Can not add more discs");
		} else {
			arrlistDisc.add(disc);
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (arrlistDisc.size() == 0) {
			System.out.println("Your cart is empty! Can not remove anything!");
		} else {
			int count = 0;
			for (int i = 0; i < arrlistDisc.size(); i++) {
				if (arrlistDisc.get(i).getTitle().equalsIgnoreCase(disc.getTitle())) {
					arrlistDisc.remove(i);
					count++;
				}
			}
			if (count > 0) {
				System.out.printf("Discs %s are removed!\n", disc.getTitle());
			} else {
				System.out.printf("Can not find discs %s!\n", disc.getTitle());
			}
		}
	}

	public float totalCost() {
		float total = 0;
		for (int i = 0; i < arrlistDisc.size(); i++) {
			total += arrlistDisc.get(i).getCost();
		}
		return total;
	}

	public void printOrder() {
		System.out.println("***********************Order***********************");
		System.out.printf("Date: [%s %s %s]\n", dateOrder.getDay(), dateOrder.getMonth(), dateOrder.getYear());
		if (arrlistDisc.size() == 0) {
			System.out.println("The order is empty");
		} else {
			System.out.println("Ordered items:");
			for (int i = 0; i < arrlistDisc.size(); i++) {
				System.out.print((i + 1) + ". ");
				System.out.printf("DVD - [%-15s] - [%-15s] - [%-15s] - [%-5d] - [%-5.1f]\n",
						arrlistDisc.get(i).getTitle(), arrlistDisc.get(i).getCategory(),
						arrlistDisc.get(i).getDirector(), arrlistDisc.get(i).getLength(), arrlistDisc.get(i).getCost());
			}
			System.out.println("Total cost: " + totalCost());
		}
	}
}
