/***********************************
 * ��8�� �����ӵļ̳�
 * 8.6 ��д��̳еĹ�ϵ
 * Sample08_20����д��̳�
***********************************/

package Sample08_20;

class Vehicle
{
	private void startUp()	//����Ϊprivate�����ܱ�����̳�
	{
		System.out.println("һ�㳵��������������");
	}
}

class Car extends Vehicle
{
	public int startUp()	//û�м̳и���ķ��������ܹ�����д����������е�ͬ������
	{
		System.out.println("�γ�������������");
		return 0;
	}
}

public class Sample08_20 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		
		System.out.println("���õĽ��Ϊ��");
		c.startUp();
	}
}
