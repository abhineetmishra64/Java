class Calculator {
    public static void main(String[] args){
 
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        int z = 0;
        
        if (args[1].equals("+")) {
            z = x+y;
        } else if (args[1].equals("-")){
            z = x-y;
        } else if (args[1].equals("*")){
            z = x*y;
        } else if (args[1].equals("/")){
            z = x/y;
        } 
        System.out.println(z);
    }
}
