package ch21;

/**
 * �ڲ��࣬��Ա�ڲ���:û��ʹ��static�������ǵĳ�Ա�ڲ���
 * 
 * @author Mountain
 * 
 */
public class MemberInnerClassTest {
	public static void main(String[] args) {
		//������Ա���ڲ���
		//�﷨���ⲿ��.�ڲ��� ������ =new �ⲿ��().new �ڲ���();
		Outer.OuterInner inner =new Outer().new OuterInner();
		inner.method();
		
	}
}

class Outer {
	//Outer���ж���һ�����Ժͷ���
	String name="����";
	static int i=11;
	public void t(){
		System.out.println("t");
	}
	public static void t1(){
		System.out.println("t1");
	}
		//��Ա�ڲ���
		public class OuterInner{
			int i=10;
			public void method(){
				System.out.println(name);
				//����ⲿ�ı������ڲ��ı���������ͬ
				//��ʹ���ⲿ��.this.������
				System.out.println(Outer.this.i);
				System.out.println(i);
				t();
				t1();
			}
			
		}
}















