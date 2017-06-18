/***********************************
 * 第8章 父与子的继承
 * 8.5 方法的重写
 * Sample08_15：方法的重写
***********************************/

package Sample08_15;

class Vehicle
{
	public void startUp()
	{
		System.out.println("一般交通工具的启动方法！");
	}
}

class Car extends Vehicle
{
	public void startUp()
	{
		System.out.println("轿车的启动方法！");	//重写父类的方法：子类中的方法名与参数列表必须与被重写的父类方法完全相同
	}
}

public class Sample08_15 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		Vehicle v = new Car();
		
		System.out.println("实际调用的方法为：");
		c.startUp();	//子类重写了方法，实际调用子类的方法
		v.startUp();	//父类引用指向子类对象时，也将调用子类重写的方法
	}
}
