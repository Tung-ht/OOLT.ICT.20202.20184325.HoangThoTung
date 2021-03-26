package demo;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order odr = new Order();
		odr.addDigitalVideoDisc(new DigitalVideoDisc("One two three", "Tragedy", "Huge Jackman", 60, 1.3f));
		odr.addDigitalVideoDisc(new DigitalVideoDisc("One Two", "Action", "David Louis", 120, 3.4f)); //2 different object;
		odr.addDigitalVideoDisc(new DigitalVideoDisc("Anna Belle", "Thriller", "Leo LuLu", 75, 3.4f));
		odr.addDigitalVideoDisc(new DigitalVideoDisc("one", "Historic", "Mini Diva", 67, 3.4f));
		
		odr.printOrder();
		odr.getDateOrder().print();
	}


}
