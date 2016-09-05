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
	  System.out.println("我叫："+name+"\n性别："+sex+"\n年龄："+age);
  }
  public static void main(String[] args) {
	Zhu t=new Zhu("小三","女",18);
	t.show();
}
}
