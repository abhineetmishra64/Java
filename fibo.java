class Fibo{
	public static void main(String []args){
		int n=Integer.parseInt(args[0]);
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++){
			System.out.println(b);
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
