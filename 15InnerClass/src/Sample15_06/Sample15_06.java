/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.6 �ֲ��ڲ���
 * Sample15_06������ֲ��ڲ��༰����
***********************************/

package Sample15_06;

class Outter
{
	public void getInner()
	{
		class Inner	//����ֲ��ڲ���
		{
			public void show()
			{
				System.out.println("��ϲ�㣬���岢�����˾ֲ��ڲ���Ķ���");
			}
		}
		Inner i = new Inner();	//�����ֲ��ڲ������
		i.show();
	}
}

public class Sample15_06 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInner();
	}
}
