package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected int id; // id of this item in the database: 1 -> size

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
	
	public int getId() {
		return id;
	}

// 	method

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Media) {
			Media item = (Media) obj; // downcasting obj to item, need to check instanceof
			if(this.id == item.id) 	// item nam trong cung class media nen co the truc tiep ".id"
				return true; 
		}
		return false;
	}
	
	
	public abstract void display();
	//id = 1,2,3,4,...size
	public static void deleteItem(int id) {
		arrDB.remove(id-1);
		System.out.println("Remove item successfully!");
	}
}
