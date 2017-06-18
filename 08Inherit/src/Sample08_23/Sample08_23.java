/***********************************
 * 第8章 父与子的继承
 * 8.6 重写与继承的关系
 * Sample08_23：重写扩展父类功能
***********************************/

package Sample08_23;

class Vehicle
{
	public void startUp()
	{
		System.out.print("一般车辆的启动方法！");
	}
}

class Car extends Vehicle
{
	public void startUp()
	{
		super.startUp();	//使用super预定义对象引用调用父类的被重写方法
		System.out.println("轿车的启动方法！");
	}
}

public class Sample08_23 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		
		System.out.print("c.startUp调用的结果为：");
		c.startUp();
	}
}
