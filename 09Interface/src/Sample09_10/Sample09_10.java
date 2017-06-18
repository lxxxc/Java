/***********************************
 * ��9�� �ӿڵ�����
 * 9.5 �ӿ��������
 * Sample09_10�����庬��Ĳ�ͬ
***********************************/

package Sample09_10;

interface Flyer
{
	public abstract void fly();	//�ӿ��еķ���Ĭ����public��abstract
}

interface Sailer
{
	public abstract void cruise();
}

abstract class Vehicle
{
	public abstract void consume();	//���󷽷�ֻ�ܳ����ڳ�������
}

abstract class Animal
{
	public abstract void eat();
}

abstract class AirPlane extends Vehicle implements Flyer
{
	public void consume()	//ʵ�ֳ��󷽷�
	{
		System.out.println("����Ҫ�������ͣ�");
	}
	
	public void fly()
	{
		System.out.println("�ҿ����÷ɻ��ķ�ʽ����շ��У�");
	}
}

class SeaPlane extends AirPlane implements Sailer
{
	public void cruise()
	{
		System.out.println("�ҿ����ô��ķ�ʽ��ˮ�к��У�");
	}
}

class Bird extends Animal implements Flyer
{
	public void eat()
	{
		System.out.println("����Ҫ�Զ�����");
	}
	
	public void fly()
	{
		System.out.println("�ҿ����ö���ķ�ʽ����շ��У�");
	}
}


public class Sample09_10 
{
	public static void main(String[] args)
	{
		SeaPlane sp = new SeaPlane();
		Bird b = new Bird();
		
		System.out.println("==========ˮ�Ϸɻ�ִ�еĶ���==========");
		sp.fly();
		sp.consume();
		sp.cruise();
		
		System.out.println("==========��ִ�еĶ���==========");
		b.fly();
		b.eat();
	}
}
