class InSufficentFundException extends Exception{
	InSufficentFundException(String msg){
		super(msg);
	}
}

class account{
	double balance = 0;
	account(int bal){
		this.balance = bal;
	}

	void chechbal(){
		System.out.print("Current Balance: "+balance);
	}

	void depositmoney(int bal){
		if(bal>0){
			balance += bal;
		}
	}

	void withdrawmoney(int bal) throws InSufficentFundException {
		if(bal > balance) {
			throw new InSufficentFundException("Current Balance "+balance+" is less than requested amount "+bal);
		}
		balance -= bal;
	}
}

class accexcept{
	public static void main(String args[]){
		account a = new account(3000);

		try{
			a.withdrawmoney(5000);
		} 
		catch(InSufficentFundException e){
			System.out.println(e.getMessage());
			}
	}
}