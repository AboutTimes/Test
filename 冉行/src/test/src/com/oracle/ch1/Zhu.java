package test.src.com.oracle.ch1;

public class Zhu {
  String name;
  String sex;
  int age;
  public Zhu(){
	  
  }
  public Zhu(String name,String sex,int age ){
	  this.name=name;
	  this.sex=sex;
	  this.age=age;
  }
  public void show(){
	  System.out.println("�ҽУ�"+name+"\n�Ա�"+sex+"\n���䣺"+age);
  }
  public static void main(String[] args) {
	Zhu t=new Zhu("С��","Ů",18);
	t.show();
}
}
