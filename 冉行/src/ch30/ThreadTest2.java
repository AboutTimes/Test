package ch30;

public class ThreadTest2 {
	public static void main(String[] args) {
		Example2 example = new Example2();
		TheThread3 t1 = new TheThread3(example);
		TheThread4 t2 = new TheThread4(example);
		t1.start();
		t2.start();
	}
}

class Example2 {
	private Object object = new Object();

	public void execute() {
		// synchronized (object)
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				try {
					Thread.sleep((long) (Math.random() * 1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("example:" + i);
			}
		}
		System.out.println("AAAA");
	}

	public void execute2() {

		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("execute:" + i);
			}
		}

	}
}

class TheThread3 extends Thread {
	private Example2 example;

	public TheThread3(Example2 example) {
		this.example = example;
	}

	@Override
	public void run() {
		this.example.execute();
	}
}

class TheThread4 extends Thread {
	private Example2 example;

	public TheThread4(Example2 example) {
		this.example = example;
	}

	@Override
	public void run() {
		this.example.execute2();
	}
}