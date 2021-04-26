package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class Book extends Media implements AdminAction {
	private ArrayList<String> authors = new ArrayList<String>();
	
//	constructor
	public Book(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.authors = authors;
		Media.arrDB.add(this);
	}
	
	public Book() {
		super();
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
	
	
	public void display() {
		System.out.printf("BOOKS - |%-20s| - |%-20s| - |%-7.2f$| - |", getTitle(), getCategory(), getCost());
		for(int i = 0 ;i < authors.size(); i++) {
			System.out.printf("%s, ", authors.get(i).toString());
		}
		System.out.println("|");	
	}

	public void createNewItem() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("--->Import a new DVD: ");
		System.out.println("-Title: "); this.title = sc.nextLine();
		System.out.println("-Category: "); this.category = sc.nextLine();
		System.out.println("-Cost: "); this.cost = sc.nextFloat(); sc.nextLine();
		
		Media.arrDB.add(this);
		System.out.println("Item is added successfully!");
	}
}
