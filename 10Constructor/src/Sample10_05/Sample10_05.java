/***********************************
 * ��10�� ������Ӧ��
 * 10.5 ���ع�����
 * Sample10_05�����ع�����
***********************************/

package Sample10_05;

class Animal
{
	String name;
	int size;
	
	public Animal()
	{
	}
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	public Animal(String name, int size)
	{
		this.name = name;
		this.size = size;
	}
}

public class Sample10_05 
{
	public static void main(String[] args)
	{
		Animal a = new Animal("tom", 40);
		Animal b = new Animal("tom");
		Animal c = new Animal();
		
		System.out.println("�ҵ����ֽ�" + a.name + "���ҵ����峤" + a.size + "����");
		System.out.println("�ҵ����ֽ�" + b.name + "���ҵ����峤" + b.size + "����");
		System.out.println("�ҵ����ֽ�" + c.name + "���ҵ����峤" + c.size + "����");
	}
}
