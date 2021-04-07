import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a: ");
		a = Double.parseDouble(sc.nextLine());
		System.out.println("Enter number b: ");
		b = Double.parseDouble(sc.nextLine());
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a x b = " + (a*b));
		if(b != 0) {
			System.out.println("a / b = " + (a/b));
		}
		else {
			System.out.println("a / b is undefined because b = 0");
		} 
	}
}
