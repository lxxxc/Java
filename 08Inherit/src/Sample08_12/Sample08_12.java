/***********************************
 * 第8章 父与子的继承
 * 8.3 对象
 * Sample08_12：引用的比较
***********************************/

package Sample08_12;

class Fruit
{
}

class Apple extends Fruit
{
}

class Peer extends Fruit
{
}

public class Sample08_12 
{
	public static void main(String[] args)
	{
		Apple a = new Apple();
		Fruit f = a;
		Peer p = new Peer();
	
		if (a == f)	//a继承至f，可以比较
		{
			System.out.println("引用a与引用f相等！");	
		}
		
//		if (a == p)	//a与p没有派生关系，不能比较
//		{
//			System.out.println("引用a与引用p相等！");
//		}
	}
}
