/**
 * 
 */
package w1;

import java.util.Scanner;

/**
 * @author Tunght
 *
 */
public class ex5 {

	/**
	 * @param args
	 */
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
		System.out.println("a / b = " + (a/b));
	}

}
