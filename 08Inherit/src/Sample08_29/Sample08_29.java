/***********************************
 * 第8章 父与子的继承
 * 8.9 abstract与继承
 * Sample08_29：抽象类
***********************************/

package Sample08_29;

abstract class Car
{
	private double price;
	private String brand;
	private int speed;
}

public class Sample08_29 
{
	public static void main(String[] args)
	{
		Car c;	//可以声明抽象类的引用
//		c = new Car();	//不能创建抽象类的对象
	}
}
