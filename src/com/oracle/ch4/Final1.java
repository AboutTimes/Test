package com.oracle.ch4;
/**
 * final���գ��������η��������ԣ���
 * 1�����η����󣬸÷������ܱ���д
 * 2. �������Ժ󣬸����Ե�ֵ�����޸�
 * 3. ������󣬸��಻�ܱ��̳�
 * @author Administrator
 *
 */
public class Final1 {
	public static void main(String[] args) {
		Final2 f=new Final2();
		//f.a=99;�������Ժ�ֵ�����ڽ����޸�
		Final2 f1=new Final2();
	}
}
 class  Final2{
	//��������ʱ���븳ֵ
	final int a=9;
	//���η������ܱ��̳�
	public final String f(){
		return "";
	}
}
//ʹ��final���ε�������Ϣ�����ܱ��̳�
class Final3 extends Final2{
	
}