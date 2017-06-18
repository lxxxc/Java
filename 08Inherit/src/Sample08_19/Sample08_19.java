/***********************************
 * 第8章 父与子的继承
 * 8.5 方法的重写
 * Sample08_19：重写的访问级别
***********************************/

package Sample08_19;

class Vehicle
{
	public void startUp()
	{
		System.out.println("一般交通工具的启动方法！");
	}
}

class Car extends Vehicle
{
//	protected void startUp()	//重写的方法比被重写的方法访问限制更严格，报错
//	{
//		System.out.println("轿车的启动方法！");	
//	}
	
	public void startUp()
	{
		System.out.println("轿车的启动方法！");	
	}
}

public class Sample08_19 
{
	public static void main(String[] args)
	{
		Car c = new Car();

		System.out.println("调用的结果为：");
		c.startUp();
	}
}
