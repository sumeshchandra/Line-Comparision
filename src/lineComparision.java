import java.util.Scanner;

public class lineComparision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Computation"
				+ " Program on Main Branch.");
		System.out.print("Enter x1 : ");
		int x1 = sc.nextInt();
		System.out.print("Enter x2 : ");
		int x2 = sc.nextInt();
		System.out.print("Enter y1 : ");
		int y1 = sc.nextInt();
		System.out.print("Enter y2 : ");
		int y2 = sc.nextInt();
		
		double length = 0;
		double x = Math.pow((x2-x1),2);
		double y = Math.pow((y2-y1),2);
		length = Math.sqrt(x+y);
		System.out.println("Line Length : "+ length);
	}

}
