class commandcalc{
	public static void main(String args[]){
		int result = 0;
		try{
			int fno = Integer.parseInt(args[0]);
			int sno = Integer.parseInt(args[2]);
			char operator = args[1].charAt(0);


			switch(operator){
				case ('+'):
					result = fno+sno;
					System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result);
					break;

				case ('-'):
					result = fno-sno;
					System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result);
					break;

				case ('*'):
					result = fno * sno;
					System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result);
					break;

				case ('/'):
					result = fno/sno;
					System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result);
					break;

				default:
					System.out.print("Invalid operator");
			}

		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		} catch (NumberFormatException e){
			System.out.println("Operand is non-numeric");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter operand");
		}	
	}
}