package demo;

import java.util.ArrayList;
import java.util.Collections;

public class DateUtils {
	
//	default format: mm-dd-yyyy
//	sorting from old orders to new orders
	public static void sorting(ArrayList<MyDate> arrlistDate) {
		Collections.sort(arrlistDate, new DateComparator());
	}
}
