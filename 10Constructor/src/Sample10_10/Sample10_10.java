/***********************************
 * ��10�� ������Ӧ��
 * 10.7 �Զ��幹����
 * Sample10_10���Զ��幹����
***********************************/

package Sample10_10;

class Animal
{
	public Animal()
	{
		
	}
	
	public Animal(String name)
	{
		System.out.println("����Animal��Ĺ�������");
	}
}

class Bird extends Animal
{
	//����û�ж��幹������������Ĭ�Ϲ�������������ø�����޲ι��������������û���ṩ�޲ι�������������
}

public class Sample10_10 
{
	public static void main(String[] args)
	{
		new Bird();
	}
}
