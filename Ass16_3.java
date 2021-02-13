import java.util.Scanner;

interface Area{
        double PI = 3.14;
        double compute( double x, double y);
}
interface Display{
        void show(double r);
}

class Rectangles implements Area,Display{

        
        @Override
        public double compute(double length, double breadth) {
                return length*breadth;
        }
        @Override
        public void show(double area) {
                System.out.println("Area of Rectangle: "+area);
        }

        
}
class Circles implements Area,Display{

        
        @Override
        public double compute(double radius,double diameter) {
                return PI*radius*radius;
        }
        @Override
        public void show(double area) {
                System.out.println("Area of Circle: "+area);


        }


}
public class Ass16_3 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter length and breadth of Rectangle: ");
                double length = sc.nextDouble(); 
                double breadth = sc.nextDouble(); 
                Rectangles r = new Rectangles();
                double area1 = r.compute(length,breadth);
                r.show(area1);

                System.out.println("Enter Diameter of circle: ");
                double diameter = sc.nextDouble();
                double radius = diameter/2;
                Circles c = new Circles();
                double area2 = c.compute(radius, diameter);
                c.show(area2);

                sc.close();
        }
}