package ch13;

/**
 * for循环的增强
 * 
 * @author Mountain
 * 
 */
public class Test {

	public static void main(String[] args) {
		//以前的写法：for（表达式，表达式1，表达式2）{}
		//增强 for(你需要要的类型 变量名或者叫对象名:你去操作的数据){}
		int []array={23,1,2,3,4,23,2};
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println("==============");
		//for的增强
		for(int a:array){
			System.out.println(a);
		}
	}

}
