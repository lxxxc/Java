/***********************************
 * 第10章 构造器应用
 * 10.6 级联调用的构造器
 * Sample10_08：默认构造器
***********************************/

package Sample10_08;

class Animal
{
	public Animal()
	{
		System.out.println("我是Animal类的构造器！");
	}
}

class Bird extends Animal
{
	//如果没有显式地编写构造器，编译器会自动提供一个具有super();语句的默认无参构造器
}

public class Sample10_08 
{
	public static void main(String[] args)
	{
		new Bird();
	}
}
