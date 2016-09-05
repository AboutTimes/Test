 package test.src.com.oracle.ch3;
/**
 * 我们就有ＩＢ，ＩＣ的功能
 * @author Administrator
 *
 */
public class D implements IB, IC {

	@Override
	public void c() {
		System.out.println("c");
	}

	@Override
	public void b() {
		System.out.println("b");

	}

}
