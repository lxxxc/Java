/***********************************
 * ��10�� ������Ӧ��
 * 10.6 �������õĹ�����
 * Sample10_07����������
***********************************/

package Sample10_07;

class Animal
{
	public Animal()
	{
		System.out.println("����Animal����޲ι�������");
	}
	
	public Animal(int a)
	{
		System.out.println("ִ��Animal�����һ��int�����Ĺ������������յ��Ĳ���ֵΪ" + a + "��");
	}
}

class Bird extends Animal
{
	public Bird()
	{
		super();	//���ø�����޲ι�����
		System.out.println("����Bird����޲ι�������");
	}
	
	public Bird(int a)
	{
		super(a);	//���ø�����вι�����
		System.out.println("ִ��Bird�����һ��int�����Ĺ������������յ��Ĳ���ֵΪ" + a + "��");
	}
}

public class Sample10_07 	
{
	public static void main(String[] args)
	{
		new Bird();
		System.out.println("======================================================");
		new Bird(2);
	}
}
