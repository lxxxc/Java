/***********************************
 * ��8�� �����ӵļ̳�
 * 8.6 ��д��̳еĹ�ϵ
 * Sample08_23����д��չ���๦��
***********************************/

package Sample08_23;

class Vehicle
{
	public void startUp()
	{
		System.out.print("һ�㳵��������������");
	}
}

class Car extends Vehicle
{
	public void startUp()
	{
		super.startUp();	//ʹ��superԤ����������õ��ø���ı���д����
		System.out.println("�γ�������������");
	}
}

public class Sample08_23 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		
		System.out.print("c.startUp���õĽ��Ϊ��");
		c.startUp();
	}
}
