/***********************************
 * ��8�� �����ӵļ̳�
 * 8.3 ����
 * Sample08_12�����õıȽ�
***********************************/

package Sample08_12;

class Fruit
{
}

class Apple extends Fruit
{
}

class Peer extends Fruit
{
}

public class Sample08_12 
{
	public static void main(String[] args)
	{
		Apple a = new Apple();
		Fruit f = a;
		Peer p = new Peer();
	
		if (a == f)	//a�̳���f�����ԱȽ�
		{
			System.out.println("����a������f��ȣ�");	
		}
		
//		if (a == p)	//a��pû��������ϵ�����ܱȽ�
//		{
//			System.out.println("����a������p��ȣ�");
//		}
	}
}
