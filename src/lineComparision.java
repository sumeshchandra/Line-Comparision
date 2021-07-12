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
		System.out.print("Enter x3 : ");
		int x3 = sc.nextInt();
		System.out.print("Enter x4 : ");
		int x4 = sc.nextInt();
		System.out.print("Enter y3 : ");
		int y3 = sc.nextInt();
		System.out.print("Enter y4 : ");
		int y4 = sc.nextInt();
	
		double x = Math.pow((x2-x1),2);
		double y = Math.pow((y2-y1),2);
		double a = Math.pow((x4-x3),2);
		double b = Math.pow((y4-y3),2);

		Object length1 = (x+y);
		Object length2 = (a+b);
		String obj1 =String.valueOf(length1);
		String obj2 =String.valueOf(length2);
		
		 double result = obj1.compareTo(obj2);
		if(result == 0 ){
            System.out.println("The Two Lines Are Equal");
        } else  if(result > 0) {
            System.out.println("The Line1 is greater than Line2");
        } else {
        	System.out.println("The Line1 is less than Line2");
        }
    }

}
