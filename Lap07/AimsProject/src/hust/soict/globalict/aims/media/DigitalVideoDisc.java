package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalVideoDisc extends Disc implements Playable {

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
	
	public static void createNewItem() {
		Scanner sc = new Scanner(System.in);
		DigitalVideoDisc dvd = new DigitalVideoDisc();
		System.out.println("--->Import a new DVD: ");
		System.out.println("-Title: "); dvd.title = sc.nextLine();
		System.out.println("-Category: "); dvd.category = sc.nextLine();
		System.out.println("-Director: "); dvd.director = sc.nextLine();
		System.out.println("-Length: "); dvd.length = sc.nextDouble();
		System.out.println("-Cost: "); dvd.cost = sc.nextFloat();
		
		Media.arrDB.add(dvd);
		System.out.println("Item is added successfully!");
	}
}
