class Marks {
    public static void main(String []args){
        int a = Integer.parseInt(args[0]);

        if(a<50){
            System.out.println("Fail");
        }
	else if(a>100 && a<0){
            System.out.println("Invalid marks");
	}
        else if(a<60 && a>=50){
            
            System.out.println("Poor");
        }
        else if(a<70 && a>=60){
            System.out.println("Average");
            
        }
        else if(a<80 && a>=70){
            System.out.println("Good");
        }
        else if(a<90 && a>=80){
            System.out.println("Excellent");
        }
        else if(a>=90 && a<=100){
            System.out.println("Outstanding");
        }
    }
}
