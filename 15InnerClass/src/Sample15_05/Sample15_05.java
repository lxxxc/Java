/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.5 Ԥ�����������this
 * Sample15_05��Ԥ�����������this
***********************************/

package Sample15_05;

class Outter
{
	int x = 100;
	
	class Inner
	{
		int x = 10000;
		
		public void show()
		{
			System.out.println("�����ⲿ��Outter�еĳ�Ա������x = " + Outter.this.x);	//ʹ���ⲿ���еĳ�Ա����
			System.out.println("�����ڲ���Outter�еĳ�Ա������x = " + this.x);	//Ĭ��this����ָ���ڲ������
		}
	}
}

public class Sample15_05 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		Outter.Inner i = o.new Inner();
		i.show();
	}
}
