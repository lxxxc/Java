/***********************************
 * ��9�� �ӿڵ�����
 * 9.3 �ӿ��еķ���
 * Sample09_03���ӿ��з�����ʵ����ʹ��
***********************************/

package Sample09_03;

interface Flyer
{
	public void fly();	//���нӿڷ�����������public��abstract���Ҳ�����static��final
}

interface Sailer
{
	public abstract void dock();
}

abstract class AirPlane implements Flyer
{
	public abstract void doAirPlaneThing();	//AirPlane��Ϊ�����࣬��˲���Ҫʵ�ֽӿ��еķ���
}

class SeaPlane extends AirPlane implements Sailer	//SeaPlane�಻�ǳ����࣬�����Ҫʵ�ָ����еķ����Լ�ʵ�ֽӿ��еķ���
{
	public void fly()
	{
		System.out.println("ˮ�Ϸɻ����Է��У�");
	}
	
	public void dock()
	{
		System.out.println("ˮ�Ϸɻ����Ժ��У�");
	}
	
	public void doAirPlaneThing()
	{
		System.out.println("ˮ�Ϸɻ���һ���ɻ���");
	}
}

public class Sample09_03 
{
	public static void main(String[] args)
	{
		SeaPlane sp = new SeaPlane();
		sp.fly();
		sp.dock();
		sp.doAirPlaneThing();
	}
}
