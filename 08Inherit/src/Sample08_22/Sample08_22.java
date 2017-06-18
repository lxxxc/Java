/***********************************
 * 第8章 父与子的继承
 * 8.6 重写与继承的关系
 * Sample08_22：静态方法的隐藏
***********************************/

package Sample08_22;

class Car
{
	public static void brake()
	{
		System.out.println("正在汽车上刹车！");
	}
	
	public static void startUp()
	{
		System.out.println("正在汽车上启动！");
	}
}

class Truck extends Car
{
	public static void brake()
	{
		System.out.println("正在卡车上刹车！");
	}
}

public class Sample08_22 
{
	public static void main(String[] args)
	{
		Truck t = new Truck();
		Car c = t;
		
		System.out.print("t.brake()调用的为：");	//调用父类和子类具有的方法时，子类引用调用的是子类的方法，与非静态方法不同
		t.brake();	
		
		System.out.print("t.startUp()调用的为：");	//调用父类具有而子类没有的方法时，调用的是父类的方法
		t.startUp();
		
		System.out.print("c.brake()调用的为：");	//调用父类和子类具有的方法时，父类引用调用的是父类的方法，与非静态方法不同
		c.brake();
	}
}
