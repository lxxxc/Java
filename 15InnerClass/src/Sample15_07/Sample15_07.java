/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.6 �ֲ��ڲ���
 * Sample15_07���ֲ�������ֲ��ڲ���
***********************************/

package Sample15_07;

class Outter
{
	public void getInner()
	{
		final int x = 100;	//�ֲ��ڲ�����Է���final�ľֲ�����
		
		class Inner
		{
			public void show()
			{
				System.out.println("���ʷ����еľֲ�������x = " + x);
			}
		}
		Inner i = new Inner();
		i.show();
	}
}

public class Sample15_07 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInner();
	}
}
