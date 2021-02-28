/**
 * 
 */
package w1;

import java.util.Scanner;

/**
 * @author Tunght
 *
 */
public class SolveThreeTypesOfEquation {
	public static Scanner sc = new Scanner(System.in);
	public static double a,b,c,d;
	/**
	 * @param args
	 */
	
	public static void menu() {
		while(true) {
			System.out.println("---------Menu---------");
			System.out.println("--->1. First-degree equation (linear equation) with one variable.");
			System.out.println("--->2. System of first-degree equations (linear system) with two variables.");
			System.out.println("--->3. The second-degree equation with one variable.");
			System.out.println("--->0. Exit.");
			System.out.println("\n"+"Choose a function: ");
			
			int key= sc.nextInt();
			sc.nextLine();
			switch (key) {
			case 1:
				System.out.println("Equation ax+b=0: ");
				System.out.println("Enter number a: ");
				a = sc.nextDouble();
				System.out.println("Enter number b:");
				b = sc.nextDouble();
				if(a == 0 && b == 0) {
					System.out.println("The equation has infinitely many solutions!");
				}
				else if(a == 0 && b != 0) {
					System.out.println("The equation has no solution!");
				}
				else {
					System.out.println("Root is: " + (-b/a));
				}
				break;
			
			case 2: 
				System.out.println("Enter a1, b1, c1; a2, b2, c2 :");
				double a1, b1, c1, a2, b2, c2;
				a1 = sc.nextDouble();
				b1 = sc.nextDouble();
				c1 = sc.nextDouble();
				a2 = sc.nextDouble();
				b2 = sc.nextDouble();
				c2 = sc.nextDouble();
				double d1, d2, d;
				d = a1*b2 - a2*b1;
				d1 = c1*b2 - c2*b1;
				d2 = a1*c2 - a2*c1;
				if(d == 0) {
					if(d1 == d2 && d1 == 0) {
						System.out.println("The system has infinitely many solutions!");
					}
					else {
						System.out.println("The system has no solution!");
					}
				}
				else{
					System.out.println("The system has a unique solution: " + "(" + d1/d + ";" + d2/d + ")" );
				}
				break;
				
			case 3:
				System.out.println("Enter a,b,c (a must be # 0):");
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				d = b*b - 4*a*c;
				if(d < 0) {
					System.out.println("The equation has no solution!");
				}
				else if(d == 0) {
					System.out.println("The equation has double root : " + (-b/(2*a)));
				}
				else {
					System.out.println("The equation has two roots: " +  (-b+Math.sqrt(d))/(4*a) + " and " + (b+Math.sqrt(d))/(4*a));
				}
				break;

			case 0:
				System.out.println("Exit: Y/N?");
				String str = sc.nextLine();
				if(str.equalsIgnoreCase("y")) {
					return;
				}
				else break;
			default:
				System.out.println("There is no function like this!");
				sc.nextLine();
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		menu();
	}
}
