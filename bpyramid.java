class Bpyramid{
	public static void main(String []args){
		int num=Integer.parseInt(args[0]);
		for (int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				if(i+j>=6){
					System.out.print(j%2);
				}
				else
					System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print((k+1)%2);
			}
			System.out.println();
		}
	}
}
