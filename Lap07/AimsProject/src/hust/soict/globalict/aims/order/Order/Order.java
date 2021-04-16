package hust.soict.globalict.aims.order.Order;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.utils.MyDate.MyDate;

public class Order {
//	attribute
	public static final int MAX_QTY = 10;

	// store ordered items
	private ArrayList<Media> arrMedia = new ArrayList<Media>();

	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	private MyDate dateOrdered;

	public MyDate getdateOrdered() {
		return dateOrdered;
	}

	public void setdateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public static int getNbOrders() {
		return nbOrders;
	}

	public static void setNbOrders(int nbOrders) {
		Order.nbOrders = nbOrders;
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

	public void addMedia(Media m) {
		if (arrMedia.size() == MAX_QTY) {
			System.out.println("Your cart is full! Can not add more items!");
		} else {
			arrMedia.add(m);
			System.out.println("Item is added successfully!");
		}
	}
	
//	remove by number from 0 to size-1
	public void removeMedia(int d) {
		if(d < 0 || d >= arrMedia.size()-1) {
			System.out.println("Id is invalid!");
		}
		else {
			if(arrMedia.size() == 0) {
				System.out.println("Your order is empty!");
			}
			else {
				arrMedia.remove(d);
				System.out.println("Remove successfully!");
			}
		}
	}

	public float totalCost() {
		float total = 0;
		for (int i = 0; i < arrMedia.size(); i++) {
			total += arrMedia.get(i).getCost();
		}
		return total;
	}

//	public Media getALuckyItem() {
//		Random rand = new Random();
//		Media tmp = new Media();
//		tmp = Media.arrDB.get(rand.nextInt(Media.arrDB.size())); // random a number between 0 to
//																// arrdb.size - 1
//		return tmp;
//
//	}

	public void printOrder() {
		System.out.println("***********************Order***********************");
		System.out.printf("Date: [%s %s %s]\n", dateOrdered.getDay(), dateOrdered.getMonth(), dateOrdered.getYear());
		if (arrMedia.size() == 0) {
			System.out.println("The order is empty");
		} else {
			System.out.println("Ordered items:");
			for (int i = 0; i < arrMedia.size(); i++) {
				System.out.printf("%-3d", i+1);
				arrMedia.get(i).display();
			}
			System.out.printf("Total cost: %.2f\n", totalCost());
		}
	}
}
