package ch11;

/**
 * ����ģʽ,Ҳ��������java��23�����ģʽ��������ģ���򵥵� �������Ķ�����Զֻ��һ��
 * 
 * @author Mountain
 * 
 */
public class Si {
	// 1.��Ҫ����һ����̬�ı�������ԣ����Լ�����������ʹ��
	private static Si si = null;
	//ע�⣺������ڶ��߳��У�����������д��
	// 2.����һ����ʽ�Ĺ��췽������Ҫ��ʶΪ˽�е�private
	private Si() {

	}
	// 3.����һ��
	public static Si getSi() {
		//�ж�si�Ƿ�Ϊ��
		if(si==null){
			//������new����
			si=new Si();
		}
		return si;
	}

}
