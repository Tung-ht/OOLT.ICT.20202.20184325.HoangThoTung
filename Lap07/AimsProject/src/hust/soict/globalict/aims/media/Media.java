package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;

//	arrDB to store Books and Discs created as a database 
	public static ArrayList<Media> arrDB = new ArrayList<Media>();

// only getter:
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

// 	method
	public abstract void display();
	//id = 1,2,3,4,...last
	public static void deleteItem(int id) {
		arrDB.remove(id-1);
		System.out.println("Remove item successfully!");
	}
}
