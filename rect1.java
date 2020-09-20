class Rectangle {
	public static void main(String []args){
		int num=Integer.parseInt(args[0]);
		num=num+5;
		int j=0;
		for(int i=1;i<=num;i++){
				j++;
				if(j==3){
					j=0;
					System.out.println();
					continue;
				}
			
			System.out.print("* ");
		}
		}
	}
