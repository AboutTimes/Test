package ch6;

public class Test1 {
		public static void method() {
			
			try{
				System.out.println("�������䡣�����������Ҷ���������ĥ��������");
			
			
			}
			catch(Exception e){
				                       
				System.out.println("�̻�ֻ����һ˲");
				e.printStackTrace();
			}finally{
			System.out.println("��ȴ��ס��һ��");
			}
			System.exit(0);
		}
		public static void main(String[] args) {
			method();
		}
}
