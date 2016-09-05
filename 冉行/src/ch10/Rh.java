package ch10;

public class Rh {
		
	
		public static void main(String[] args) {
				
				char[] array={'µÂ','Âê','Î÷','Ñ¹'};
				for (int i = 0; i < array.length; i++) {
						System.out.print(array[i]);
				}
				System.out.println();
				String b=new String(array);
				System.out.println (b);
				
				String c=String.valueOf(array);
				System.out.println(c);
		}
}
