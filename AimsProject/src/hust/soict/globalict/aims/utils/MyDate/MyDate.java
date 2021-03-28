package hust.soict.globalict.aims.utils.MyDate;

import java.util.Scanner;

public class MyDate {
	private String day;
	private String month;
	private String year;

//	getter setter:
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

//	constructor
//	default format: dd-mm-yyyy
	public MyDate(String day, String month, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

//	convert month in digit format into word format
	public String convertMonth() {
		if (getMonth().equals("01"))
			return "Jan";
		else if (getMonth().equals("02"))
			return "Feb";
		else if (getMonth().equals("03"))
			return "Mar";
		else if (getMonth().equals("04"))
			return "Apr";
		else if (getMonth().equals("05"))
			return "May";
		else if (getMonth().equals("06"))
			return "Jun";
		else if (getMonth().equals("07"))
			return "Jul";
		else if (getMonth().equals("08"))
			return "Aug";
		else if (getMonth().equals("09"))
			return "Sep";
		else if (getMonth().equals("10"))
			return "Oct";
		else if (getMonth().equals("11"))
			return "Nov";
		else if (getMonth().equals("12"))
			return "Dec";
		else
			return "";
	}

// print date in some different formats
	public void print() {
		System.out.println("Choose a format to display: ");
		System.out.println("1. yyyy-MM-dd (Ex: 1930-02-03).");
		System.out.println("2. MMM d yyyy (Ex: Feb 3 1930).");
		System.out.println("0. Exit this function!");
		System.out.println("You choice: ");
		int key = 0;
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		sc.nextLine();
		switch (key) {
		case 1:
			System.out.printf("yyyy-MM-dd : %s-%s-%s\n", getYear(), getMonth(), getDay());
			return;
		case 2:
			System.out.printf("MMM d yyyy: %s %s %s\n", convertMonth(), getDay(), getYear());
			return;
		case 0:
			// exit
			return;
		default:
			System.out.println("There is no function like this!");
			break;
		}
	}
}
