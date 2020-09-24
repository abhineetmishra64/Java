class Day1 {
    public static void display(){
        System.out.println("This is day class");
    }
}

class Night{
    public static void display(){
        System.out.println("This is night class");
    }
}

class Display{
    public static void main(String [] args){
        Day1 obj1 = new Day1();
        Night obj2 = new Night();
        obj1.display();
        obj2.display();
    }
}
