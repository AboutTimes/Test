package com.cracle.ch11;

public class Money {
		public static void main(String[] args) {
			Bank bank=new Bank();
			//ATM
			BankThread t=new BankThread(bank);
			//柜台
			BankThread t1=new BankThread(bank);
			t.start();
			t1.start();
		}
}
		class Bank{
			//银行存款
			private int Money=1000;
			/**
			 * 取钱
			 * 
			 * @param number
			 *            你需要取的钱是多少
			 * @return 你的RMB有多少
			 * synchronized该关键字表示同步
			 */
			public synchronized int getMoney(int number){	//定义需要取得金额
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
		//取钱的线程
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
