/***********************************
 * ��8�� �����ӵļ̳�
 * 8.3 ����
 * Sample8_8��ǿ������ת��
***********************************/

package Sample08_08;

public class Sample08_08 
{
	public static void main(String[] args)
	{
		Car c = new Truck();	//��������ָ��Car�࣬������Truck���͵�
		
		System.out.println("���ʵĳ�ԱΪ��" + c.aMember + "!");	//���ʵ�����������Car��ĳ�Ա����
		System.out.println("���ʵĳ�ԱΪ��" + ((Truck)c).aMember + "!");		//ǿ������ת�������Truck��ĳ�Ա����
	}
}

class Car
{
	String aMember = "����������ĳ�Ա����";
}

class Truck extends Car
{
	String aMember = "���ǿ�����ĳ�Ա������������Ҳ��";
}

