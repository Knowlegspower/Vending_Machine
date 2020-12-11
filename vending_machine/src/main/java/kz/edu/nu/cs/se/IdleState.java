package kz.edu.nu.cs.se;

public class IdleState extends State {

	public IdleState(VendingMachine vm) {
		// TODO Auto-generated constructor stub
		vendingMachine = vm;
	}

	@Override
	public void insertCoin(int coin) {
		// TODO Auto-generated method stub    	
    	vendingMachine.setCurrentState(vendingMachine.enteringCoins);
    	vendingMachine.insertCoin(coin);
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
