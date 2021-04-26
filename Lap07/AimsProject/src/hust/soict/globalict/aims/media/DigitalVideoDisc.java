package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalVideoDisc extends Disc implements Playable, AdminAction {

	public DigitalVideoDisc(String title, String category, String director, double length, float cost) {
		super();
		this.length = length;
		this.director = director;
		this.title = title;
		this.category = category;
		this.cost = cost;
		Media.arrDB.add(this);
	}

// constructor
	public DigitalVideoDisc() {
		super();
	}

// method
	// search by title;
	public boolean search(String title) {
		String[] arr = title.split(" ");
		boolean check = true;
		for (int i = 0; i < arr.length; i++) {
			if (getTitle().contains(arr[i])) {
				check = true;
			} else {
				check = false;
				break;
			}
		}
		return check;
	}

	public void display() {
		System.out.printf("DVD   - |%-20s| - |%-20s| - |%-15s| - |%-5.0f| - |%-7.2f$|\n", title, category,
				director, length, cost);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.title);
		System.out.println("DVD length: " + this.length + " minutes");
	}
	
	public void createNewItem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--->Import a new DVD: ");
		System.out.println("-Title: "); this.title = sc.nextLine();
		System.out.println("-Category: "); this.category = sc.nextLine();
		System.out.println("-Director: "); this.director = sc.nextLine();
		System.out.println("-Length: "); this.length = sc.nextDouble(); sc.nextLine();
		System.out.println("-Cost: "); this.cost = sc.nextFloat(); sc.nextLine();
		
		Media.arrDB.add(this);
		System.out.println("Item is added successfully!");
	}
}
