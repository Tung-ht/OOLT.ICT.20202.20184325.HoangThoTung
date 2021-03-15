package demo;

import java.util.ArrayList;

public class Order {
//	attribute
	public static final int MAX_QTY = 10;
	private static ArrayList<DigitalVideoDisc> arrlistDisc = new ArrayList<DigitalVideoDisc>();


//	
//	constructor
	public Order() {
		super();
	}
	
//	methods
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if( arrlistDisc.size() == MAX_QTY) {
			System.out.println("Your cart is full! Can not add more discs");
		}
		else {
			arrlistDisc.add(disc);
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(arrlistDisc.size() == 0) {
			System.out.println("Your cart is empty! Can not remove anything!");
		}
		else {
			int count = 0;
			for(int i = 0; i < arrlistDisc.size(); i++) {
				if( arrlistDisc.get(i).getTitle().equalsIgnoreCase(disc.getTitle()) ) {
					arrlistDisc.remove(i);
					count++;
				}
			}
			if(count > 0) {
				System.out.println("The discs are removed!");
			}
			else {
				System.out.println("Can not find that disc!");
			}
		}
	}
	
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < arrlistDisc.size(); i++) {
			total += arrlistDisc.get(i).getCost();
		}
		return total;
	}
}
