package hust.soict.globalict.aims.media;

import java.util.ArrayList;

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
}
