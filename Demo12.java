import java.util.Scanner;

class Emp {

	int id;
	String name;
	
	Scanner sc = new Scanner(System.in);

	Emp() {
		
		System.out.print("Enter ID: ");
		id = sc.nextInt();
		System.out.print("Enter Name: ");
		name = sc.next();
	}
}

class Clerk extends Emp {

	Clerk() {
		
	}

	void display() {

		System.out.println("ID: " + id);
		System.out.println("Name" + name);
	}
}

class Dev extends Emp {

	Dev() {
		
	}

	void display() {

		System.out.println("ID: " + id);
		System.out.println("Name" + name);
	}
}

class Tester extends Emp {

	Tester() {
		
	}

	void display() {

		System.out.println("ID: " + id);
		System.out.println("Name" + name);
	}
}

class Demo12 {

	public static void main(String[] args) {
	
		Clerk c = new Clerk();
		c.display();

		Dev d = new Dev();
		d.display();

		Tester t = new Tester();
		t.display();
	}
}