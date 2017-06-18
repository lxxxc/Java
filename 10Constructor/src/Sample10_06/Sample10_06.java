/***********************************
 * 第10章 构造器应用
 * 10.6 级联调用的构造器
 * Sample10_06：如何调用构造器
***********************************/

package Sample10_06;

class Animal
{
	public Animal()	//构造器不能被继承
	{
		System.out.println("我是Animal类的构造器！");
	}
}

class Bird extends Animal
{
	public Bird()
	{
		System.out.println("我是Bird类的构造器！");
	}
}

public class Sample10_06 
{
	public static void main(String[] args)
	{
		new Bird();	//构造器是级联调用的，调用子类的构造器会自动调用父类的无参构造器，直至Object构造器
	}
}
