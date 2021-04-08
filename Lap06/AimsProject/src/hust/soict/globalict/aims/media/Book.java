package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
//	constructor
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}

	
// Some methods
	public void addAuthor(String name) {
		authors.add(name);
	}
	
	public void removeAuthor(String name) {
		boolean check = authors.remove(name);
		if(check == true) {
			System.out.println("Remove successfully!");
		}
		else { //check  =  false
			System.out.println("Author "+name+ " does not exist!");
		}
	}
	
	@Override
	public void display() {
		System.out.printf("BOOKS - |%-20s| - |%-20s| - |%-5.2f$| - ", getTitle(), getCategory(), getCost());
		System.out.printf("|");
		for(int i = 0 ;i < authors.size(); i++) {
			System.out.printf("%s, ", authors.get(i).toString());
		}
		System.out.println("|");	
	}
}
