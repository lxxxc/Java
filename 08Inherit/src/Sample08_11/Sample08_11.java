/***********************************
 * ��8�� �����ӵļ̳�
 * 8.3 ����
 * Sample08_11������ĸ�ֵ
***********************************/

package Sample08_11;

class Fruit
{
}

class Apple extends Fruit
{
}

public class Sample08_11 
{
	public static void main(String[] args)
	{
		Apple a = new Apple();
		
		Fruit f = a;	//���Խ��������ø�ֵ����������
		
		a = (Apple)f;	//���ܽ��������ø�ֵ���������ã���Ҫǿ������ת��
	}
}
