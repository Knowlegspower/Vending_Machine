package kz.edu.nu.cs.se;

public class EnteringCoinsState extends State {
	
	public EnteringCoinsState(VendingMachine vm) {
		// TODO Auto-generated constructor stub
		vendingMachine = vm;
	}

	@Override
	public void insertCoin(int coin) {
		// TODO Auto-generated method stub
    	if (coin != 50 && coin != 100) {
    		throw new IllegalArgumentException();
    	}
    	vendingMachine.balance +=  coin;
    	
		if (vendingMachine.balance >= 200) {
			vendingMachine.setCurrentState(vendingMachine.paid);
			}
		

	}

	@Override
	public int refund() {
		// TODO Auto-generated method stub
    	int money = vendingMachine.balance;
    	vendingMachine.balance = 0;
    	vendingMachine.setCurrentState(vendingMachine.idle);
    	return money;
		
	}

	@Override
	public int vend() {
		// TODO Auto-generated method stub
		throw new IllegalStateException();
	}

}
