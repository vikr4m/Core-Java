class intcheck{
	public static void main(String args[]){
		int sum=0;

		for(int i=0;i<args.length;i++){
			int number = Integer.parseInt(args[i]);

			try{
				if(number<0){
					throw new Exception("Number is Negative");
				}

				if(number%10 ==0){
					throw new Exception("Number is evenly divisible by 10");
				}
				if(number > 1000 && number < 2000){
					throw new Exception("Number is between 1000 and 2000");
				}
				if(number>7000){
					throw new Exception("Number greater than 7000");
				}

				sum=sum+number;
			}catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
	System.out.println("Sum: "+sum);
	}
}	
