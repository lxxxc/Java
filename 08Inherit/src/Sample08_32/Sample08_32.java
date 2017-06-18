/***********************************
 * 第8章 父与子的继承
 * 8.10 继承的多态
 * Sample08_32：继承的多态
***********************************/

package Sample08_32;

abstract class Car
{
	public abstract void brake();
}

class Truck extends Car
{
	public void brake()
	{
		System.out.println("正在卡车上刹车！");
	}
}

class Mini extends Car
{
	public void brake()
	{
		System.out.println("正在面包车上刹车！");
	}
}

public class Sample08_32 
{
	public static void main(String[] args)
	{
		Car c = new Truck();	//对象类型决定了调用哪个类的方法
		System.out.print("调用的方法是：");
		c.brake();
		
		c = new Mini();
		System.out.print("调用的方法是：");
		c.brake();
	}
}
