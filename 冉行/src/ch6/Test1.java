package ch6;

public class Test1 {
		public static void method() {
			
			try{
				System.out.println("日升月落。。。。你是我多漫长的折磨。。。。");
			
			
			}
			catch(Exception e){
				                       
				System.out.println("烟花只美了一瞬");
				e.printStackTrace();
			}finally{
			System.out.println("我却记住了一生");
			}
			System.exit(0);
		}
		public static void main(String[] args) {
			method();
		}
}
