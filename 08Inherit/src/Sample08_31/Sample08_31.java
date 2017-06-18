/***********************************
 * 第8章 父与子的继承
 * 8.9 abstract与继承
 * Sample08_30：抽象方法-继承与实现
***********************************/

package Sample08_31;

abstract class Car	//抽象类Car，代表车辆
{
	public abstract void startUp();
}

abstract class Audi extends Car	//抽象类Audi，继承至Car，代表奥迪车
{
	public abstract void turbo();
}

class Audi_A6 extends Audi	//非抽象类Audi_A6，继承至抽象类Audi
{
	public void startUp()	//实现turbo方法
	{
		System.out.println("调用了奥迪A6的启动功能！");
	}
	
	public void turbo()	//实现turbo方法
	{
		System.out.println("调用了奥迪A6的加速功能！");
	}
}

class Audi_A8 extends Audi	//非抽象类Audi_A8，继承至抽象类Audi
{
	public void startUp()	//实现turbo方法
	{
		System.out.println("调用了奥迪A8的启动功能！");
	}
	
	public void turbo()	//实现turbo方法
	{
		System.out.println("调用了奥迪A8的加速功能！");
	}
}

public class Sample08_31 
{
	public static void main(String[] args)
	{
		Audi_A6 a6 = new Audi_A6();
		a6.startUp();
		a6.turbo();
		
		Audi_A8 a8 = new Audi_A8();
		a8.startUp();
		a8.turbo();
	}
}
