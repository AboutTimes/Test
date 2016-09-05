package ch30;

public class Money {
	public static void main(String[] args) {
		// 1.创建账户对象
		Bank bank = new Bank();
		// 2.ATM
		BankThread t = new BankThread(bank);
		// 3.柜台
		BankThread t1 = new BankThread(bank);
		// 启动线程
		t.start();
		t1.start();

	}
}

/**
 * 银行账户
 * 
 * @author Mountain
 * 
 */
class Bank {
	// 你银行账户的RMB
	private int money = 1000;

	/**
	 * 取钱
	 * 
	 * @param number
	 *            你需要取的钱是多少
	 * @return 你的RMB有多少
	 * synchronized该关键字表示同步
	 */
	public synchronized int getMoney(int number) {
		// 1。判断你输出的金额
		if (number < 0) {
			return -1;
		} else
		// 2.判断你的RMB是否小于0
		if (money < 0) {
			return -2;
		} else
		// 判断你账户的余额与你取钱的余额
		if (number > money) {
			return -3;
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 返回你取现后的余额
			money -= number;
			return money;
		}
	}
}

// 这是取钱的线程
class BankThread extends Thread {
	// 我们需要对同一个账户操作吧
	Bank bank;

	public BankThread(Bank bank) {
		this.bank = bank;
	}

	// 执行线程的方法 run
	@Override
	public void run() {
		// 取钱
		System.out.println(this.bank.getMoney(800)
				+ Thread.currentThread().getName());
	}
}
