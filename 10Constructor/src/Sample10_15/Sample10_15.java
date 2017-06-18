/***********************************
 * ��10�� ������Ӧ��
 * 10.10 ����ģʽ
 * Sample10_15������ģʽ
***********************************/

package Sample10_15;

class Singleton
{
	private static Singleton singleInstance;
	
	private Singleton()	//��������private�ģ�ֻ�����Լ����е���
	{
		System.out.println("ִ�е���ģʽ��Ĺ�������");
	}
	
	public static Singleton getInstance()	//ͨ����̬������������������
	{
		if (singleInstance == null)
		{
			singleInstance = new Singleton();
		}
		return singleInstance;
	}
}

public class Sample10_15 
{
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2)
		{
			System.out.println("��������ָ��ͬһ������");
		}
		else
		{
			System.out.println("��������ָ��ͬ�Ķ���");
		}
	}
}
