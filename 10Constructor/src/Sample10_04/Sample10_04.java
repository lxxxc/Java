/***********************************
 * ��10�� ������Ӧ��
 * 10.4 ��������
 * Sample10_04����������
***********************************/

package Sample10_04;

class Animal
{
	String name;
	int size;
	
	public Animal(String name, int size)	//�вι������������������з���ֵ�����Ʊ���������һ��
	{
		this.name = name;
		this.size = size;
		System.out.println("�вι�����Animal(String name, int size)ִ�У�");
	}
}

public class Sample10_04 
{
	public static void main(String[] args)
	{
		Animal a = new Animal("tom", 40);
		System.out.println("�ҵ����ֽ�" + a.name + "���ҵ����峤" + a.size + "����");
	}
}
