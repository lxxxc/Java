/***********************************
 * 第9章 接口的世界
 * 9.3 接口中的方法
 * Sample09_03：接口中方法的实现与使用
***********************************/

package Sample09_03;

interface Flyer
{
	public void fly();	//所有接口方法隐含都是public和abstract，且不能是static和final
}

interface Sailer
{
	public abstract void dock();
}

abstract class AirPlane implements Flyer
{
	public abstract void doAirPlaneThing();	//AirPlane类为抽象类，因此不需要实现接口中的方法
}

class SeaPlane extends AirPlane implements Sailer	//SeaPlane类不是抽象类，因此需要实现父类中的方法以及实现接口中的方法
{
	public void fly()
	{
		System.out.println("水上飞机可以飞行！");
	}
	
	public void dock()
	{
		System.out.println("水上飞机可以航行！");
	}
	
	public void doAirPlaneThing()
	{
		System.out.println("水上飞机是一个飞机！");
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
