/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.2 ���ⲿ���д����ڲ���
 * Sample15_01�����ⲿ���д����ڲ���
***********************************/

package Sample15_01;

class Outter
{
	class Inner	//�����ڲ���
	{
		public void show()
		{
			System.out.println("��ϲ�㣬�������ڲ���Ķ��󣬲��ҵ������ڲ����еķ�����");
		}
	}
	
	public void createrInner()
	{
		Inner i = new Inner();	//�����ڲ������
		i.show();	//�����ڲ���ķ���
	}
}

public class Sample15_01 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.createrInner();
	}
}
