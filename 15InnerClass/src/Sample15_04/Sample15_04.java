/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.4 �ڲ������ⲿ��֮��ĳ�Ա����
 * Sample15_04�����ⲿ���з����ڲ���ĳ�Ա
***********************************/

package Sample15_04;

class Outter
{
	private int x = 100;
	
	class Inner	//�����ڲ���
	{
//		private static int innerCount = 10;	//�ڲ����в������о�̬��Ա
		
		private void show()
		{
			System.out.println("��ϲ�㣬�ɹ��������ڲ����е�˽�з�����");	
		}
	}
	
	public void getInnerShow()
	{
		Inner i = new Inner();
		i.show();	//�ⲿ����Է����ڲ�����κγ�Ա����Ҫ���ȴ����ڲ���Ķ���
	}
}

public class Sample15_04 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInnerShow();
	}
}
