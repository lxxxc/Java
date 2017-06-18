/***********************************
 * 第9章 接口的世界
 * 9.6 接口的多态
 * Sample09_11：接口的多态
***********************************/

package Sample09_11;

interface Food
{
	public abstract void doEat();
}

abstract class Fruit
{
}

abstract class Meat
{
}

class Apple extends Fruit implements Food
{
	public void doEat()
	{
		System.out.println("我是苹果，我属于水果，我可以充当食物被吃掉！");
	}
}

class Beef extends Meat implements Food
{
	public void doEat()
	{
		System.out.println("我是牛肉，我属于肉类，我可以充当食物被吃掉！");
	}
}

public class Sample09_11 
{
	public static void main(String[] args)
	{
		Food f = new Apple();	//使用接口引用指向创建的类对象
		f.doEat();	//通过接口引用调用类对象中实现的接口中的方法
		
		f = new Beef();
		f.doEat();
	}
}
