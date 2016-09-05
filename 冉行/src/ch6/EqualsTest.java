package ch6;

public class EqualsTest {
	public static void main(String[] args) {
		Object object="33";
		//Object中equalse方法
		/**
		 * public boolean equals(Object obj) {
        	return (this == obj);
        	this表示当前对象
        	obj是我们传入进来的对象
    		}
		 */
		boolean b=object.equals(object);
		System.out.println(b);
		b=object.equals(33);
		System.out.println(b);
		/**
		 * String 中equals他里面是如何实现的
		 */
		//创建二个String对象
		String str=new String("张三");
		String str1=new String("张三");
		System.out.println(str.equals(str1));
		String str2="张三";
		System.out.println(str.equals(str2));
		String str3="张三";
		System.out.println(str2.equals(str3));
		
		String h=new String("helloworld");
		String h1=new String("hello");
		String h2="world";
		String h3=h1+"world";
		System.out.println(h.equals(h3));
		System.out.println(h==h3);
		
		
	}
	/**
	 *  public boolean equals(Object anObject) {
	 *  //当前的对象与传入的对象是否是同一个对象
        if (this == anObject) {
            return true;
        }
        //判断传入的类型是不是 String类型
        if (anObject instanceof String) {
        	//把传入的对象强制转换为String类型
            String anotherString = (String) anObject;
            //定义一个int n
             * value.length取到字符串的长度【当前对象的长度】
             * 
            int n = value.length;
            //判断当前传入进来的对象的长度是否是我们当前对前长度是否相等
            if (n == anotherString.value.length) {
            	//定义字符数组，数组的下标从0开始
                char v1[] = value;
                char v2[] = anotherString.value;
                //定义变量，初始值为0
                int i = 0;
                //判断，当我们的n当前对象的长度不等于0
                while (n-- != 0) {
                	//第一次 比如用当前对象与传入对象
                	 * v1[0] v2[0]
                	 * a       a
                	 * 第二次
                	 * v1[1] v2[1]
                	 * a      b
                    if (v1[i] != v2[i])
                            return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
	 */
}
