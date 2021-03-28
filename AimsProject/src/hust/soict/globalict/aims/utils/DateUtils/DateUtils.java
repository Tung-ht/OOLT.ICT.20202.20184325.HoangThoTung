package hust.soict.globalict.aims.utils.DateUtils;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.globalict.aims.utils.MyDate.DateComparator;
import hust.soict.globalict.aims.utils.MyDate.MyDate;

public class DateUtils {
	
//	default format: mm-dd-yyyy
//	sorting from old orders to new orders
	public static void sorting(ArrayList<MyDate> arrlistDate) {
		Collections.sort(arrlistDate, new DateComparator());
	}
}
