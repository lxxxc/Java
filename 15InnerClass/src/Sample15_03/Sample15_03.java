/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.4 �ڲ������ⲿ��֮��ĳ�Ա����
 * Sample15_03�����ڲ����з����ⲿ��ĳ�Ա
***********************************/

package Sample15_03;

class Outter
{
	private int x = 100;
	
	class Inner	//�����ڲ���
	{
		public void show()
		{
			System.out.println("�ⲿ��ĳ�Ա����x��ֵΪ��" + x + "��");	//���ڲ����п��Է����ⲿ����κγ�Ա
		}
	}
}

public class Sample15_03 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		Outter.Inner i = o.new Inner();
		i.show();		
	}
}
