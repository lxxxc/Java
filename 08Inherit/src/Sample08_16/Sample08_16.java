/***********************************
 * 第8章 父与子的继承
 * 8.5 方法的重写
 * Sample08_16：重写的条件
***********************************/

package Sample08_16;

class Vehicle
{
	public void startUp()
	{
		System.out.println("一般交通工具的启动方法！");
	}
}

class Car extends Vehicle
{
	public void startUp(int i)
	{
		System.out.println("轿车的启动方法！");	//子类中的方法与父类中的方法参数列表不一样，不构成重写，只构成重载
	}
}

public class Sample08_16 
{
	public static void main(String[] args)
	{
		Vehicle v = new Car();

		System.out.println("实际调用的方法为：");
		v.startUp();	//父类引用虽然指向子类对象，但是仍然调用的是父类中的方法	
	}
}
