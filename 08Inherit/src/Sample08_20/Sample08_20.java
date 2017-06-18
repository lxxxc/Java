/***********************************
 * 第8章 父与子的继承
 * 8.6 重写与继承的关系
 * Sample08_20：重写与继承
***********************************/

package Sample08_20;

class Vehicle
{
	private void startUp()	//方法为private，不能被子类继承
	{
		System.out.println("一般车辆的启动方法！");
	}
}

class Car extends Vehicle
{
	public int startUp()	//没有继承父类的方法，不能构成重写，是子类独有的同名方法
	{
		System.out.println("轿车的启动方法！");
		return 0;
	}
}

public class Sample08_20 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		
		System.out.println("调用的结果为：");
		c.startUp();
	}
}
