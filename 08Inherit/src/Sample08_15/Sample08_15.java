/***********************************
 * ��8�� �����ӵļ̳�
 * 8.5 ��������д
 * Sample08_15����������д
***********************************/

package Sample08_15;

class Vehicle
{
	public void startUp()
	{
		System.out.println("һ�㽻ͨ���ߵ�����������");
	}
}

class Car extends Vehicle
{
	public void startUp()
	{
		System.out.println("�γ�������������");	//��д����ķ����������еķ�����������б�����뱻��д�ĸ��෽����ȫ��ͬ
	}
}

public class Sample08_15 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		Vehicle v = new Car();
		
		System.out.println("ʵ�ʵ��õķ���Ϊ��");
		c.startUp();	//������д�˷�����ʵ�ʵ�������ķ���
		v.startUp();	//��������ָ���������ʱ��Ҳ������������д�ķ���
	}
}
