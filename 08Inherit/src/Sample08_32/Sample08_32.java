/***********************************
 * ��8�� �����ӵļ̳�
 * 8.10 �̳еĶ�̬
 * Sample08_32���̳еĶ�̬
***********************************/

package Sample08_32;

abstract class Car
{
	public abstract void brake();
}

class Truck extends Car
{
	public void brake()
	{
		System.out.println("���ڿ�����ɲ����");
	}
}

class Mini extends Car
{
	public void brake()
	{
		System.out.println("�����������ɲ����");
	}
}

public class Sample08_32 
{
	public static void main(String[] args)
	{
		Car c = new Truck();	//�������;����˵����ĸ���ķ���
		System.out.print("���õķ����ǣ�");
		c.brake();
		
		c = new Mini();
		System.out.print("���õķ����ǣ�");
		c.brake();
	}
}
