import java.util.Scanner;

public class lineComparison {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Computation"
				+ " Program on Main Branch.");

		// Line 1
		System.out.print("Enter x2 : ");
		int x2 = sc.nextInt();
		System.out.print("Enter x1 : ");
		int x1 = sc.nextInt();
		System.out.print("Enter y2 : ");
		int y2 = sc.nextInt();
		System.out.print("Enter y1 : ");
		int y1 = sc.nextInt();
		// Line 2
		System.out.print("Enter x4 : ");
		int x4 = sc.nextInt();
		System.out.print("Enter x3 : ");
		int x3 = sc.nextInt();
		System.out.print("Enter y4 : ");
		int y4 = sc.nextInt();
		System.out.print("Enter y3 : ");
		int y3 = sc.nextInt();

		lineComparison lc = new lineComparison();
		lc.lengthOfLines(x2,x1,y2,y1,x4,x3,y4,y3);
	}

	 private void lengthOfLines(int x2, int x1, int y2, int y1, int x4, int x3, int y4, int y3)
       {
			Double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			Double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
			System.out.println(length1);
			System.out.println(length2);
			String obj1 = String.valueOf(length1);
			String obj2 = String.valueOf(length2);
			compare(length1,length2);
       }

		 private void compare (Double length1, Double length2)
		 {
		 double result = length1.compareTo(length2);
			if (result == 0) {
				System.out.println("The Two Lines Are Equal....");
			} else if (result > 0) {
				System.out.println("The  LineOne is greater than LineTwo ");
			} else {
				System.out.println("The LineOne is less than LineTwo");
			}
		 }
}
