package ch11;

/**
 * 单例模式,也是我们在java中23个设计模式中最好理解的，最简单的 所创建的对象永远只有一个
 * 
 * @author Mountain
 * 
 */
public class Si {
	// 1.需要设置一个静态的本类的属性，把自己当做属性来使用
	private static Si si = null;
	//注意：如果是在多线程中，不是这样的写法
	// 2.创建一个隐式的构造方法，需要标识为私有的private
	private Si() {

	}
	// 3.创建一个
	public static Si getSi() {
		//判断si是否为空
		if(si==null){
			//在这里new对象
			si=new Si();
		}
		return si;
	}

}
