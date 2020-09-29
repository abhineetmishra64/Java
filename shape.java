import java.util.*;

class Shape {

    void calculateVolume(int r) {
        System.out.println((4 / 3 * 3.14 * r * r * r));
    }

    void calculateVolume(int a, int b) {
        System.out.println(3.14 * a * a * b / 3);
    }

    void calculateVolume(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        Shape obj = new Shape();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press...\n1 for Sphere\n2 for Cone\n3 for box");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Enter the radius of sphere");
            int a = sc.nextInt();
            obj.calculateVolume(a);
        } else if (n == 2) {
            System.out.println("Enter the radius of cone");
            int a = sc.nextInt();
            System.out.println("Enter the height of cone");
            int b = sc.nextInt();
            obj.calculateVolume(a, b);
        } else if (n == 3) {
            System.out.println("Enter the height of box");
            int a = sc.nextInt();
            System.out.println("Enter the length of box");
            int b = sc.nextInt();
            System.out.println("Enter the thickness of box");
            int c = sc.nextInt();
            obj.calculateVolume(a, b, c);
        }
        sc.close();
    }
}