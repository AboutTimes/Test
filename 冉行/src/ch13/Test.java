package ch13;

/**
 * forѭ������ǿ
 * 
 * @author Mountain
 * 
 */
public class Test {

	public static void main(String[] args) {
		//��ǰ��д����for�����ʽ�����ʽ1�����ʽ2��{}
		//��ǿ for(����ҪҪ������ ���������߽ж�����:��ȥ����������){}
		int []array={23,1,2,3,4,23,2};
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println("==============");
		//for����ǿ
		for(int a:array){
			System.out.println(a);
		}
	}

}
