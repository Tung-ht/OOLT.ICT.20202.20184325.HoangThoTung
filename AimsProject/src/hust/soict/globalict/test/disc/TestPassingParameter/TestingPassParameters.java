package hust.soict.globalict.test.disc.TestPassingParameter;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class TestingPassParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc a = new DigitalVideoDisc("a");
		DigitalVideoDisc b = new DigitalVideoDisc("b");
		swap(a,b);
		System.out.println("a title: " + a.getTitle());
		System.out.println("b title: " + b.getTitle());
		
	}
	public static void swap(DigitalVideoDisc a, DigitalVideoDisc b) {
		DigitalVideoDisc tmp = a;
		a = b;
		b = tmp;
	}
}
