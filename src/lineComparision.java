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

		String obj1 =String.valueOf(x);
		String obj2 =String.valueOf(y);
		boolean result = obj1.equals(obj2);
		if(result == true ){
            System.out.println("The Two Lines Are Equal");
        } else {
            System.out.println("The Two Lines Are Not Equal");
        }
	}

}
