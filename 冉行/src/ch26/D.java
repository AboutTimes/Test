package ch26;

//4.����װ�ν�ɫ��Concrete Decorator����
//����������������ϡ����ӵ����Ρ�
public class D extends C {
	//��ӹ��췽��
	public D(A a) {
		super(a);
	}
	
	

	public void b(){
		System.out.println("���ǹ���D");
	}
	@Override
	public void a(){
		super.a();
		//��������D�ж���ķ��������ϸ��ӵ�����
		this.b();
	}
	

}




