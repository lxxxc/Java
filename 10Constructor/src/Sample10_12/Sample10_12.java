/***********************************
 * ��10�� ������Ӧ��
 * 10.9 �����ֵܹ�����
 * Sample10_12�������﷨
***********************************/

package Sample10_12;

class Animal
{
	public Animal(String name)
	{
		System.out.println("����Animal��Ĺ�����������name = " + name);
	}
	
	public Animal()
	{
		this("tom");	//����Animal����вι�����������д�ڹ������ĵ�һ�䣬ͬʱ������Ҳ�����Զ����super();
	}
}

public class Sample10_12 
{
	public static void main(String[] args)
	{
		new Animal();
	}
}
