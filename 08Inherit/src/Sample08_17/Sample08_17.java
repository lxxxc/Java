/***********************************
 * ��8�� �����ӵļ̳�
 * 8.5 ��������д
 * Sample08_17����д�ķ������͹���-������������
***********************************/

package Sample08_17;

class Vehicle
{
	public int getMoney()
	{
		return 20;
	}
}

class Car extends Vehicle
{
//	public long getMoney()	//���������븸�෽����һ�£��������ܹ�����д
//	{
//		return 110L;
//	}
}

public class Sample08_17 
{
	public static void main(String[] args)
	{
		Vehicle v = new Car();
		
		System.out.println("�γ��ļ۸�Ϊ��" + v.getMoney());
	}
}
