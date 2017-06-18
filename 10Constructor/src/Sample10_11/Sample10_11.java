/***********************************
 * 第10章 构造器应用
 * 10.8 构造器不能继承
 * Sample10_11：构造器不能继承
***********************************/

package Sample10_11;

class Fruit
{
	public Fruit()
	{
		
	}
	
	public Fruit(String name)
	{
		System.out.println("执行Fruit类的构造器！");
	}
}

class Apple extends Fruit
{
	
}

public class Sample10_11 
{
	public static void main(String[] args)
	{
//		new Apple("红富士");	//构造器不能被继承，因此Apple类中没有父类中的构造器
	}
}
