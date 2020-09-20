class Circle {
    int radius;
    void setRadius(int n){
        radius = n;
    }

    double calArea(){
        return(radius * radius *3.14);
    }

    public static void main(String []args){
        Circle obj= new Circle();
        obj.setRadius(Integer.parseInt(args[0]));
        System.out.println(obj.calArea());
    }
}


    
