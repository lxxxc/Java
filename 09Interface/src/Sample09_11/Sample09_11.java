/***********************************
 * ��9�� �ӿڵ�����
 * 9.6 �ӿڵĶ�̬
 * Sample09_11���ӿڵĶ�̬
***********************************/

package Sample09_11;

interface Food
{
	public abstract void doEat();
}

abstract class Fruit
{
}

abstract class Meat
{
}

class Apple extends Fruit implements Food
{
	public void doEat()
	{
		System.out.println("����ƻ����������ˮ�����ҿ��Գ䵱ʳ�ﱻ�Ե���");
	}
}

class Beef extends Meat implements Food
{
	public void doEat()
	{
		System.out.println("����ţ�⣬���������࣬�ҿ��Գ䵱ʳ�ﱻ�Ե���");
	}
}

public class Sample09_11 
{
	public static void main(String[] args)
	{
		Food f = new Apple();	//ʹ�ýӿ�����ָ�򴴽��������
		f.doEat();	//ͨ���ӿ����õ����������ʵ�ֵĽӿ��еķ���
		
		f = new Beef();
		f.doEat();
	}
}
