import java.util.Scanner;

class Method {

	double max(int a, int b) {
		return (double) ((a > b) ? a : b);
	}

	double max(int a, double b) {
		return ((a > b) ? a : b);
	}

	double max(double a, int b) {
		return ((a > b) ? a : b);
	}

	double max(double a, double b) {
		return ((a > b) ? a : b);
	}

}

class max {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Method mt = new Method();
		System.out.println(
				"Enter....\n1: For two int\n2: For one int and one decimal\n3: For one decimal and one int\n4: For two decimal\n5: Exit");
		int ch = sc.nextInt();

		switch (ch) {
			case 1:
				System.out.println("Enter two number: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				double res = mt.max(a, b);
				System.out.println("Max between " + a + " & " + b + " is = " + res);
				break;

			case 2:
				System.out.println("Enter two number: ");
				int c = sc.nextInt();
				double d = sc.nextDouble();
				double res1 = mt.max(c, d);
				System.out.println("Max between " + c + " & " + d + " is = " + res1);
				break;

			case 3:
				System.out.println("Enter two number: ");
				double e = sc.nextDouble();
				int f = sc.nextInt();
				double res2 = mt.max(e, f);
				System.out.println("Max between " + e + " & " + f + " is = " + res2);
				break;

			case 4:
				System.out.println("Enter two number: ");
				double g = sc.nextDouble();
				double h = sc.nextDouble();
				double res3 = mt.max(g, h);
				System.out.println("Max between " + g + " & " + h + " is = " + res3);
				break;
			

			default:
				System.out.println("Wrong Input");
				break;
		}
		sc.close();

	}
}
