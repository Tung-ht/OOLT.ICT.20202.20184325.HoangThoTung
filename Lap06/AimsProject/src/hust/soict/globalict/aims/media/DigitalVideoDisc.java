package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	public static ArrayList<DigitalVideoDisc> arrDB = new ArrayList<DigitalVideoDisc>();

//	getter & setter
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

	//	constructor
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}		


	public DigitalVideoDisc() {
		super();
	}

// method
	//search by title;
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
	
	@Override
	public void display() {
		System.out.printf("DVD   - |%-20s| - |%-20s| - |%-15s| - |%-5d| - |%-5.2f$|\n", getTitle(), getCategory(), 
				getDirector(), getLength(), getCost());
	}
}
