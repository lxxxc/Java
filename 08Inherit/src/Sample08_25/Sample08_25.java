/***********************************
 * ��8�� �����ӵļ̳�
 * 8.7 ����������
 * Sample08_25�����ط�����ƥ��-������������
***********************************/

package Sample08_25;

class Vehicle{}

class Car extends Vehicle{}

class Truck extends Car{}

class UseCar
{
	public void show(Vehicle v)
	{
		System.out.println("���õ��Ǿ���Vehicle�����ķ�����");
	}
	public void show(Car v)
	{
		System.out.println("���õ��Ǿ���Car�����ķ�����");
	}
}

public class Sample08_25 
{
	public static void main(String[] args)
	{
		UseCar a = new UseCar();
		Vehicle v = new Vehicle();
		Vehicle vc = new Car();
		Car c = new Car();
		Truck t = new Truck();
		
		System.out.print("��Vehicle���Ͳ������ã�");	//���ò�������ƥ��ķ���
		a.show(v);
		System.out.print("��Car���Ͳ������ã�");	//���ò�������ƥ��ķ���
		a.show(c);
		System.out.print("��Truck���Ͳ������ã�");	//û��ֱ��ƥ�䷽��ʱ��Ѱ����ƥ��ķ���
		a.show(t);
		System.out.print("��Vehicle���Ͳ������ã�");	//�������;��������ĸ������������Ƕ�������
		a.show(vc);
	}
}
