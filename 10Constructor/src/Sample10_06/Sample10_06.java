/***********************************
 * ��10�� ������Ӧ��
 * 10.6 �������õĹ�����
 * Sample10_06����ε��ù�����
***********************************/

package Sample10_06;

class Animal
{
	public Animal()	//���������ܱ��̳�
	{
		System.out.println("����Animal��Ĺ�������");
	}
}

class Bird extends Animal
{
	public Bird()
	{
		System.out.println("����Bird��Ĺ�������");
	}
}

public class Sample10_06 
{
	public static void main(String[] args)
	{
		new Bird();	//�������Ǽ������õģ���������Ĺ��������Զ����ø�����޲ι�������ֱ��Object������
	}
}
