class Max {
    public static void main(String []args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(a>b && a>c){
            System.out.println("Maximum = "+a);
        }
        else if(c>b && c>a){
            System.out.println("Maximum = "+c);
        }
        else if(b>a && b>c){
            System.out.println("Maximum = "+b);
        }
    }
}
