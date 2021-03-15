package demo;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order odr = new Order();
		odr.addDigitalVideoDisc(new DigitalVideoDisc("one two three", 1.3f));
		odr.addDigitalVideoDisc(new DigitalVideoDisc("one two", 3.4f)); //2 different object;
		odr.addDigitalVideoDisc(new DigitalVideoDisc("one two", 3.4f));
		odr.addDigitalVideoDisc(new DigitalVideoDisc("one", 3.4f));
		
		DigitalVideoDisc tmp = new DigitalVideoDisc("one two", 3.4f);
		odr.removeDigitalVideoDisc(tmp);
		System.out.println("Total cost: "+ odr.totalCost());
	}

}
