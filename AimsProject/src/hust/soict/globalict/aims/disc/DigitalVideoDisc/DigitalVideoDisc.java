package hust.soict.globalict.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public static ArrayList<DigitalVideoDisc> arrDB = new ArrayList<DigitalVideoDisc>();

//	getter & setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

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

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

//	constructor
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		arrDB.add(this);
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc() {
		super();
	}

// method
	//check equality:
	public boolean isEqual(DigitalVideoDisc disc) {
		if(this.getTitle().equalsIgnoreCase(disc.getTitle()) && this.getCategory().equalsIgnoreCase(disc.getCategory()) && this.getDirector().equalsIgnoreCase(disc.getDirector()) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
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
}
