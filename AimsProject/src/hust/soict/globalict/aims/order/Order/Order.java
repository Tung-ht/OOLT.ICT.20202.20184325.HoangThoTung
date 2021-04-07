package hust.soict.globalict.aims.order.Order;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.MyDate.MyDate;

public class Order {
//	attribute
	public static final int MAX_QTY = 10;

	// store ordered items
	private ArrayList<DigitalVideoDisc> arrlistDisc = new ArrayList<DigitalVideoDisc>();

	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	private MyDate dateOrdered;

	public MyDate getdateOrdered() {
		return dateOrdered;
	}

	public void setdateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	// constructor
	public Order() {
		super();
		nbOrders++;
	}

	// return the address of an created-inside-function object
	public static Order newOrder() {
		if (!validOrder()) {
			System.out.println("You reach the maximum number of order! Can not creat a new order");
			return null;
		} else {
			Order tmp = new Order();
			MyDate d = new MyDate();
			tmp.setdateOrdered(d);
			return tmp;
		}
	}

//	methods
	// check whether user can create new order (< max) or not (>=max)
	public static boolean validOrder() {
		if (nbOrders < MAX_LIMITTED_ORDERS) {
			return true;
		} else { // nbOrders >= MAX_LIMITTED_ORDERS
			return false;
		}
	}

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
				if (arrlistDisc.get(i).isEqual(disc)) {
					arrlistDisc.remove(i);
					count++;
				}
			}
			if (count > 0) {
				System.out.printf("Discs \"%s\" are removed!\n", disc.getTitle());
			} else {
				System.out.printf("Can not find discs \"%s\" !\n", disc.getTitle());
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

	public DigitalVideoDisc getALuckyItem() {
		Random rand = new Random();
		DigitalVideoDisc tmp = new DigitalVideoDisc();
		tmp = DigitalVideoDisc.arrDB.get(rand.nextInt(DigitalVideoDisc.arrDB.size())); // random a number between 0 to
																						// arrdb.size - 1
		return tmp;

	}

	public void printOrder() {
		System.out.println("***********************Order***********************");
		System.out.printf("Date: [%s %s %s]\n", dateOrdered.getDay(), dateOrdered.getMonth(), dateOrdered.getYear());
		if (arrlistDisc.size() == 0) {
			System.out.println("The order is empty");
		} else {
			System.out.println("Ordered items:");
			for (int i = 0; i < arrlistDisc.size(); i++) {
				System.out.print((i + 1) + ". ");
				System.out.printf("DVD - |%-20s| - |%-20s| - |%-20s| - |%-5d| - |%-5.2f|\n",
						arrlistDisc.get(i).getTitle(), arrlistDisc.get(i).getCategory(),
						arrlistDisc.get(i).getDirector(), arrlistDisc.get(i).getLength(), arrlistDisc.get(i).getCost());
			}
			System.out.printf("Total cost: %.2f\n", totalCost());
		}
	}
}
