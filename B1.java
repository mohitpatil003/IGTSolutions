import java.util.Scanner;

class B1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a, b, c;
	
		System.out.print("Enter number 1: ");
		a = sc.nextInt();

		System.out.print("Enter number 2: ");
		b = sc.nextInt();

		System.out.print("Enter number 3: ");
		c = sc.nextInt();
	
		if(a > b && a > c) {
			System.out.println("Number 1 is greater: " + a);
		} else if(b > a && b > c) {
			System.out.println("Number 2 is greater: " + b);
		} else {
			System.out.println("Number 3 is greater: " + c);
		}
	}
}