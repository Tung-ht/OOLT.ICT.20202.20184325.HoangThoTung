package hust.soict.globalict.aims.Aims;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order.Order;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order odr = Order.newOrder();
		odr.addDigitalVideoDisc(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
		odr.addDigitalVideoDisc(new DigitalVideoDisc("Star Wars", "Science Fiction" , "Geogre Lucas", 87, 24.95f));
		odr.addDigitalVideoDisc(new DigitalVideoDisc("One two three", "Tragedy", "Huge Jackman", 60, 1.3f));
		odr.addDigitalVideoDisc(new DigitalVideoDisc("One Two", "Action", "David Louis", 120, 3.4f)); 
		odr.addDigitalVideoDisc(new DigitalVideoDisc("Anna Belle", "Thriller", "Leo LuLu", 75, 3.4f));//2 different object;
		odr.addDigitalVideoDisc(new DigitalVideoDisc("Anna Belle", "Thriller", "Leo LuLu", 75, 3.4f));
		odr.addDigitalVideoDisc(new DigitalVideoDisc("one", "Historic", "Mini Diva", 67, 3.4f));
		odr.addDigitalVideoDisc(odr.getALuckyItem());

		odr.printOrder();
//		odr.getdateOrdered().print();
	}

}
