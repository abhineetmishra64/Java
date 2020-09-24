class Num{
    public static void main(String []args){
        Swap n = new Swap();
        n.a = Integer.parseInt(args [0]);
        n.b = Integer.parseInt(args [1]);
        System.out.println("Before Swapping");
        n.display();
        n.swapn();
        System.out.println("After Swapping");   
        n.display();
    }
}

class Swap{
    int a;
    int b;

    void display() {
        System.out.println("a = "+a+" b = "+b);
    }

    void swapn() {
        int temp = a;
        a = b;
        b = temp;
        }
}