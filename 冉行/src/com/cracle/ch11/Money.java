package com.cracle.ch11;

public class Money {
		public static void main(String[] args) {
			Bank bank=new Bank();
			//ATM
			BankThread t=new BankThread(bank);
			//��̨
			BankThread t1=new BankThread(bank);
			t.start();
			t1.start();
		}
}
		class Bank{
			//���д��
			private int Money=1000;
			/**
			 * ȡǮ
			 * 
			 * @param number
			 *            ����Ҫȡ��Ǯ�Ƕ���
			 * @return ���RMB�ж���
			 * synchronized�ùؼ��ֱ�ʾͬ��
			 */
			public synchronized int getMoney(int number){	//������Ҫȡ�ý��
				if(number<0){
					return -1;
					
				}else if(Money<0){
					return -2;
				}else if(number>Money){
					return -3;
				}else{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Money -=number;
					return Money;
				}
			}
		}
		//ȡǮ���߳�
		class BankThread extends Thread{
			Bank bank;
			public BankThread(Bank bank){
				this.bank=bank;
			}
			@Override
			public void run() {
				System.out.println(this.bank.getMoney(800)
						+Thread.currentThread().getName());
			}
		}
