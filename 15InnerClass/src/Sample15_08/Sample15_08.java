/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.6 �ֲ��ڲ���
 * Sample15_08���ֲ�������ֲ��ڲ���
***********************************/

package Sample15_08;

interface ForInner
{
	void sayHello();
}

class Outter
{
	ForInner forInner = null;
	
	public void getInner()
	{
		class Inner implements ForInner
		{
			public void sayHello()
			{
				System.out.println("��ã����Ǿֲ��ڲ�������һ����ڣ�");
			}
		}
		forInner = new Inner();	//����ForInner�ӿ������ã��������ⲿָ��ֲ��ڲ���Ķ���
	}
}

public class Sample15_08 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInner();
		o.forInner.sayHello();	//�����ľֲ��ڲ�������������������Ȼ����
	}
}
