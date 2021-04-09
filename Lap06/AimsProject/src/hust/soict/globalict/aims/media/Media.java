package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Media {
	private String title;
	private String category;
	private float cost;
	
//	arrDB to store Books and Discs created as a database 
	public static ArrayList<Media> arrDB = new ArrayList<Media>();
	
//	gettet setter
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

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

//	constructor
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		arrDB.add(this);
	}

	public Media() {
		super();
		arrDB.add(this);
	}
	

// 	method
	public void display() {
	}
	
}
