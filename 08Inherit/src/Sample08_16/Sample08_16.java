/***********************************
 * ��8�� �����ӵļ̳�
 * 8.5 ��������д
 * Sample08_16����д������
***********************************/

package Sample08_16;

class Vehicle
{
	public void startUp()
	{
		System.out.println("һ�㽻ͨ���ߵ�����������");
	}
}

class Car extends Vehicle
{
	public void startUp(int i)
	{
		System.out.println("�γ�������������");	//�����еķ����븸���еķ��������б�һ������������д��ֻ��������
	}
}

public class Sample08_16 
{
	public static void main(String[] args)
	{
		Vehicle v = new Car();

		System.out.println("ʵ�ʵ��õķ���Ϊ��");
		v.startUp();	//����������Ȼָ��������󣬵�����Ȼ���õ��Ǹ����еķ���	
	}
}
