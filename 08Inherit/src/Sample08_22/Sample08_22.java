/***********************************
 * ��8�� �����ӵļ̳�
 * 8.6 ��д��̳еĹ�ϵ
 * Sample08_22����̬����������
***********************************/

package Sample08_22;

class Car
{
	public static void brake()
	{
		System.out.println("����������ɲ����");
	}
	
	public static void startUp()
	{
		System.out.println("����������������");
	}
}

class Truck extends Car
{
	public static void brake()
	{
		System.out.println("���ڿ�����ɲ����");
	}
}

public class Sample08_22 
{
	public static void main(String[] args)
	{
		Truck t = new Truck();
		Car c = t;
		
		System.out.print("t.brake()���õ�Ϊ��");	//���ø����������еķ���ʱ���������õ��õ�������ķ�������Ǿ�̬������ͬ
		t.brake();	
		
		System.out.print("t.startUp()���õ�Ϊ��");	//���ø�����ж�����û�еķ���ʱ�����õ��Ǹ���ķ���
		t.startUp();
		
		System.out.print("c.brake()���õ�Ϊ��");	//���ø����������еķ���ʱ���������õ��õ��Ǹ���ķ�������Ǿ�̬������ͬ
		c.brake();
	}
}
