package hust.soict.globalict.aims.utils.MyDate;

import java.util.Comparator;

public class DateComparator implements Comparator<MyDate>{
	@Override
//	if d1 -> d2 then return -1; d1 = d2 return 0; d2 -> d1 return 1;
//	exception return 0;
	public int compare(MyDate d1, MyDate d2) {
		try {
			if(Double.parseDouble(d1.getYear()) < Double.parseDouble(d2.getYear())) 
				return -1;
			else if(Double.parseDouble(d1.getYear()) > Double.parseDouble(d2.getYear())) 
				return 1;
			else {
				if(Double.parseDouble(d1.getMonth()) < Double.parseDouble(d2.getMonth())) 
					return -1;
				else if(Double.parseDouble(d1.getMonth()) > Double.parseDouble(d2.getMonth())) 
					return 1;
				else {
					if(Double.parseDouble(d1.getDay()) < Double.parseDouble(d2.getDay())) 
						return -1;
					else if(Double.parseDouble(d1.getDay()) > Double.parseDouble(d2.getDay())) 
						return 1;
					else
						return 0;
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
}
