/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.3 ���ⲿ���ⴴ���ڲ���
 * Sample15_02�����ⲿ���ⴴ���ڲ���
***********************************/

package Sample15_02;

class Outter
{
	class Inner	//�����ڲ���
	{
		public void show()
		{
			System.out.println("��ϲ�㣬�������ڲ���Ķ��󣬲��ҵ������ڲ����еķ�����");
		}
	}
}

public class Sample15_02 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();	//���ȴ����ⲿ��Ķ���
		Outter.Inner i = o.new Inner();	//�ٴ����ڲ���Ķ���(������Ҫ���ⲿ�������Σ�������ҲҪ���ⲿ������)
		i.show();
	}
}
