/***********************************
 * ��10�� ������Ӧ��
 * 10.6 �������õĹ�����
 * Sample10_08��Ĭ�Ϲ�����
***********************************/

package Sample10_08;

class Animal
{
	public Animal()
	{
		System.out.println("����Animal��Ĺ�������");
	}
}

class Bird extends Animal
{
	//���û����ʽ�ر�д�����������������Զ��ṩһ������super();����Ĭ���޲ι�����
}

public class Sample10_08 
{
	public static void main(String[] args)
	{
		new Bird();
	}
}
