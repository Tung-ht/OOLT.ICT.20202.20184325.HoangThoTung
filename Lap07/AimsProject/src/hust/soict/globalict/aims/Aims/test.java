package hust.soict.globalict.aims.Aims;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Track;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.order.Order.Order;

public class test {
	static Scanner sc = new Scanner(System.in);
	static Order odr;

//	Function 2:
	public static void addItem() {
		if(odr == null) {
			System.out.println("Your order is invalid!");
			return;
		}
		System.out.println("--->Add item:");
		if(Order.getNbOrders() == 0) {
			System.out.println("You have not created any order!");
		}
		else {
			System.out.println("-----List of media items-----");
			for (int i = 0; i < Media.arrDB.size(); i++) {
				System.out.printf("%-3d", i + 1);
				Media.arrDB.get(i).display();
			}
			while (true) {
				System.out.println("Choose a items to add by number id: ");
				String s = sc.nextLine();
				int tmp = 0;
				try {
					tmp = Integer.parseInt(s);
					odr.addMedia(Media.arrDB.get(tmp-1));
					break;
				} catch (Exception e) {
					System.out.println("Input Error!");
				}
			}
		}
		return;
	}

//	Function 3:
	public static void deleteItem() {
		if(odr == null) {
			System.out.println("Your order is invalid!");
			return;
		}
		System.out.println("--->Delete item:");
		if(Order.getNbOrders() == 0) {
			System.out.println("You have not created any order!");
		}
		else {
			while (true) {
				System.out.println("Choose a items to delete by number id: ");
				String s = sc.nextLine();
				int tmp = 0;
				try {
					tmp = Integer.parseInt(s);
					odr.removeMedia(tmp-1);
					break;
				} catch (Exception e) {
					System.out.println("Input Error!");
				}
			}
		}
		return;
	}

//	Function 4:
	public static void displayListItems() {
		if(odr == null) {
			System.out.println("Your order is invalid!");
			return;
		}
		System.out.println("--->Display the order:");
		if(Order.getNbOrders() == 0) {
			System.out.println("You have not created any order!");
		}
		else {
			odr.printOrder();
		}
		return;
	}

//	Menu 
	public static void menu() {
		while (true) {
			System.out.println("********************************************");
			System.out.println("**    	         Menu Application           ");
			System.out.println();
			System.out.println("*******************MENU*********************");
			System.out.println("**	1. Administrator");
			System.out.println("**	2. User");
			System.out.println("**	0. Exit");
			System.out.println("********************************************");
			System.out.println("** 	Please choose a number: 0-1-2:");

			String key = sc.nextLine();

			switch (key) {
			case "1":
				System.out.println("--->Administrator:");
				AdminMenu();
				break;
			case "2":
				System.out.println("--->User:");
				UserMenu();
				break;
			case "0":
				System.out.println("--->You choose Exit:");
				String c = "";
				do {
					System.out.println("Confirm exit: Y/N?");
					c = sc.nextLine();
					if (c.equalsIgnoreCase("y")) {
						return; // exit from main function
					} else if (c.equalsIgnoreCase("n")) {
						break; // break do-while
					} else {
						System.out.println("! Input Error! Please re-enter!");
					}
				} while (!c.equalsIgnoreCase("y") && !c.equalsIgnoreCase("n")); // c!= y va c!=n
				break; // break case 0
			default:
				System.out.println("There is no function like this!");
				break;
			}
		}
	}
	public static void AdminMenu() {
		while (true) {
			System.out.println("********************************************");
			System.out.println("**    	 Product Management Application     ");
			System.out.println();
			System.out.println("*******************MENU*********************");
			System.out.println("**	1. Create new item");
			System.out.println("**	2. Delete item by id");
			System.out.println("**	3. Display the items list");
			System.out.println("**	0. Exit");
			System.out.println("********************************************");
			System.out.println("** 	Please choose a number: 0-1-2-3:");

			String key = sc.nextLine();

			switch (key) {
			case "1":
				System.out.println("--->Creat a new item:");
				System.out.println("Choose type of item: ");
				break;
			case "2":
				System.out.println("--->Delete item by id");
				break;
			case "3":
				System.out.println("--->Display items:");
				break;
			case "0":
				System.out.println("--->You choose Exit:");
				String c = "";
				do {
					System.out.println("Confirm exit: Y/N?");
					c = sc.nextLine();
					if (c.equalsIgnoreCase("y")) {
						return; // exit
					} else if (c.equalsIgnoreCase("n")) {
						break; // break do-while
					} else {
						System.out.println("! Input Error! Please re-enter!");
					}
				} while (!c.equalsIgnoreCase("y") && !c.equalsIgnoreCase("n")); // c!= y va c!=n
				break; // break case 0
			default:
				System.out.println("There is no function like this!");
				break;
			}
		}
	}
	
	public static void UserMenu() {
		while (true) {
			System.out.println("********************************************");
			System.out.println("**    	 Order Management Application     	");
			System.out.println();
			System.out.println("*******************MENU*********************");
			System.out.println("**	1. Create new order.");
			System.out.println("**	2. Add item to the order.");
			System.out.println("**	3. Delete item by id.");
			System.out.println("** 	4. Display the order.");
			System.out.println("** 	0. Exit.					");
			System.out.println("********************************************");
			System.out.println("** 	Please choose a number: 0-1-2-3-4:");

			String key = sc.nextLine();

			switch (key) {
			case "1":
				System.out.println("--->Creat a new order:");
				odr = Order.newOrder();
				if(odr == null) break;
				break;
			case "2":
				addItem();
				break;
			case "3":
				deleteItem();
				break;
			case "4":
				displayListItems();
				break;
			case "0":
				System.out.println("--->You choose Exit:");
				String c = "";
				do {
					System.out.println("Confirm exit: Y/N?");
					c = sc.nextLine();
					if (c.equalsIgnoreCase("y")) {
						return; // exit
					} else if (c.equalsIgnoreCase("n")) {
						break; // break do-while
					} else {
						System.out.println("! Input Error! Please re-enter!");
					}
				} while (!c.equalsIgnoreCase("y") && !c.equalsIgnoreCase("n")); // c!= y va c!=n
				break; // break case 0
			default:
				System.out.println("There is no function like this!");
				break;
			}
		}
	}

	
//----------------------------------------Main program----------------------------------------------------//
	public static void main(String[] args) {
//		Initialize data: auto be added to the arrDB

//		arraylist of authors:
		ArrayList<String> authors1 = new ArrayList<String>();
		authors1.add("William Shakespeare");
		authors1.add("H. P. Lovecraft");
		authors1.add("Rudyard Kipling");
		ArrayList<String> authors2 = new ArrayList<String>();
		authors2.add("John Donne");
		authors2.add("John Keats");
		authors2.add("Theodor Herzl");
		authors2.add("Percy Bysshe Shelley");

//		Some books:
		new Book("Doraemon", "Comic", 3.00f, authors1);
		new Book("Java in 2 months", "Education", 10f, authors2);
		new Book("Clean Code", "Education", 40f, authors1);
		new Book("Currency War", "Finance", 20f, authors2);
		new Book("Head First Python", "Education", 25f, authors1);
		new Book("Playboy", "Gender", 30.5f, authors1);

//	    Some discs:
		new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		new DigitalVideoDisc("Anna Belle", "Thriller", "Leo LuLu", 75, 3.4f);
		new DigitalVideoDisc("one", "Historic", "Mini Diva", 67, 3.4f);
		new DigitalVideoDisc("Avenger: End Game", "Science Fiction", "James", 120, 20.35f);
		new DigitalVideoDisc("God father", "Action", "Bale", 80, 10.25f);
		new DigitalVideoDisc("Mulan", "Live action", "Ju Jiun", 123, 20f);
		new DigitalVideoDisc("Fantasy Island", "18+", "Sony", 90, 10f);
		new DigitalVideoDisc("Underwater", "Science Fiction", "Fox", 80, 15f);
		new DigitalVideoDisc("Gretel & Hansel", "Fantasy Horro", "Messi", 80, 15.5f);
		new DigitalVideoDisc("League of Legends", "Game", "Riot", 80, 10.5f);
		new DigitalVideoDisc("Thoi su", "Politics", "VTV", 80, 20.25f);
		new DigitalVideoDisc("The thao 24h", "News", "VTV", 80, 31.25f);
		
//		some CDs:
		CompactDisc cd1 = new CompactDisc("Album 1", "R&B", "Osad", 99, "Ju JingYi");
		cd1.addTrack("Don't touch", 453);
		cd1.addTrack("Believer", 519);

		CompactDisc cd2 = new CompactDisc("Album 2", "Ballad", "Osad", 199, "Closer");
		cd2.addTrack("Baby", 691);
		cd2.addTrack("Dancing on my own", 547);
		cd2.addTrack("Home", 590);
/////////////////////////////////////////////////////////////////////////////////////////////////////////
		menu();
	}
}
