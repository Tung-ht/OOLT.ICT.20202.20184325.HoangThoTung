package hust.soict.globalict.test.utils.DateTest;

import java.util.ArrayList;

import hust.soict.globalict.aims.utils.DateUtils.DateUtils;
import hust.soict.globalict.aims.utils.MyDate.MyDate;

public class DateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MyDate> arr = new ArrayList<MyDate>();
		MyDate a = new MyDate();	arr.add(a);
		a.print();
		MyDate b = new MyDate(); 	arr.add(b);
		MyDate c = new MyDate();	arr.add(c);
		MyDate d = new MyDate();	arr.add(d);
		System.out.println("Sorting 4 date:");
		DateUtils.sorting(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.printf("yyyy-MM-dd : %s-%s-%s\n", arr.get(i).getYear(), arr.get(i).getMonth(), arr.get(i).getDay());
		}
	}
}
