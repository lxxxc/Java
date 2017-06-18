/***********************************
 * 第8章 父与子的继承
 * 8.6 重写与继承的关系
 * Sample08_21：静态方法没有重写
***********************************/

package Sample08_21;

class Car
{
//	public static void brake()	//静态方法，不能被重写，报错
//	{
//		System.out.println("正在汽车上刹车！");
//	}
	
	public void brake()
	{
		System.out.println("正在汽车上刹车！");
	}
}

class Truck extends Car
{
	public void brake()
	{
		System.out.println("正在卡车上刹车！");
	}
}

public class Sample08_21 
{
	public static void main(String[] args)
	{
		
	}
}
