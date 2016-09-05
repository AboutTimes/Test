package ch30;

public class Money {
	public static void main(String[] args) {
		// 1.�����˻�����
		Bank bank = new Bank();
		// 2.ATM
		BankThread t = new BankThread(bank);
		// 3.��̨
		BankThread t1 = new BankThread(bank);
		// �����߳�
		t.start();
		t1.start();

	}
}

/**
 * �����˻�
 * 
 * @author Mountain
 * 
 */
class Bank {
	// �������˻���RMB
	private int money = 1000;

	/**
	 * ȡǮ
	 * 
	 * @param number
	 *            ����Ҫȡ��Ǯ�Ƕ���
	 * @return ���RMB�ж���
	 * synchronized�ùؼ��ֱ�ʾͬ��
	 */
	public synchronized int getMoney(int number) {
		// 1���ж�������Ľ��
		if (number < 0) {
			return -1;
		} else
		// 2.�ж����RMB�Ƿ�С��0
		if (money < 0) {
			return -2;
		} else
		// �ж����˻����������ȡǮ�����
		if (number > money) {
			return -3;
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ������ȡ�ֺ�����
			money -= number;
			return money;
		}
	}
}

// ����ȡǮ���߳�
class BankThread extends Thread {
	// ������Ҫ��ͬһ���˻�������
	Bank bank;

	public BankThread(Bank bank) {
		this.bank = bank;
	}

	// ִ���̵߳ķ��� run
	@Override
	public void run() {
		// ȡǮ
		System.out.println(this.bank.getMoney(800)
				+ Thread.currentThread().getName());
	}
}
