/***********************************
 * ��8�� �����ӵļ̳�
 * 8.5 ��������д
 * Sample08_19����д�ķ��ʼ���
***********************************/

package Sample08_19;

class Vehicle
{
	public void startUp()
	{
		System.out.println("һ�㽻ͨ���ߵ�����������");
	}
}

class Car extends Vehicle
{
//	protected void startUp()	//��д�ķ����ȱ���д�ķ����������Ƹ��ϸ񣬱���
//	{
//		System.out.println("�γ�������������");	
//	}
	
	public void startUp()
	{
		System.out.println("�γ�������������");	
	}
}

public class Sample08_19 
{
	public static void main(String[] args)
	{
		Car c = new Car();

		System.out.println("���õĽ��Ϊ��");
		c.startUp();
	}
}
