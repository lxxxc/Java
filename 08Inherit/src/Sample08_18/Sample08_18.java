/***********************************
 * ��8�� �����ӵļ̳�
 * 8.5 ��������д
 * Sample08_18����д�ķ������͹���-������������
***********************************/

package Sample08_18;

class Father
{
}

class Son extends Father
{
}

class Vehicle
{
	public Father getMe()
	{
		Father f = new Father();
		System.out.println("����û�гɹ���д��");
		return f;
	}
}

class Car extends Vehicle
{
	public Son getMe()	//������������������ķ������ͣ�������д
	{
		Son s = new Son();
		System.out.println("�����ɹ���д��");
		return s;
	}
}
public class Sample08_18 
{
	public static void main(String[] args)
	{
		Vehicle v = new Car();
		
		System.out.println("���õĽ��Ϊ��");
		v.getMe();
	}
}
