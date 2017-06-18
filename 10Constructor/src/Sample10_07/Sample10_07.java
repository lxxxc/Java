/***********************************
 * 第10章 构造器应用
 * 10.6 级联调用的构造器
 * Sample10_07：级联调用
***********************************/

package Sample10_07;

class Animal
{
	public Animal()
	{
		System.out.println("我是Animal类的无参构造器！");
	}
	
	public Animal(int a)
	{
		System.out.println("执行Animal类的有一个int参数的构造器，本次收到的参数值为" + a + "！");
	}
}

class Bird extends Animal
{
	public Bird()
	{
		super();	//调用父类的无参构造器
		System.out.println("我是Bird类的无参构造器！");
	}
	
	public Bird(int a)
	{
		super(a);	//调用父类的有参构造器
		System.out.println("执行Bird类的有一个int参数的构造器，本次收到的参数值为" + a + "！");
	}
}

public class Sample10_07 	
{
	public static void main(String[] args)
	{
		new Bird();
		System.out.println("======================================================");
		new Bird(2);
	}
}
