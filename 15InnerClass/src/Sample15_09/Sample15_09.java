/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.6 �ֲ��ڲ���
 * Sample15_09����̬�����еľֲ��ڲ���
***********************************/

package Sample15_09;

class Outter
{
	static int x =100;	//λ�ھ�̬�����ڵľֲ��ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա
	
	public static void getInner()
	{
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

public class Sample15_09 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInner();
	}
}
