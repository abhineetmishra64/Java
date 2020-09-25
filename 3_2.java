class even {
    public static void main(String []args){
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i%3==0 && i%2==0){
                sum = sum+i;
            }
        }
        System.out.println("Total sum = "+sum);
    }
}
