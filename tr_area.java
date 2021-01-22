import java.util.Scanner;
public class tr_area {

    void calculateArea(int s){
        double area=(Math.sqrt(3)/4)*(s*s);
        System.out.println("Area of equilateral triangle is :"+ area);
    }

    void calculateArea(int b, int h){
        System.out.println("Area of rigth angle triangle is :"+(b*h)/2 );
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        tr_area obj = new tr_area();
        System.out.println("Enter the base of right angle triangle");
        int b = sc.nextInt();
        System.out.println("Enter the height of right angle triangle");
        int h = sc.nextInt();
        obj.calculateArea(b,h);
        System.out.println("Enter the side of equilateral triangle");
        int s = sc.nextInt();
        obj.calculateArea(s);
        sc.close();
    }
}