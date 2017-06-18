/***********************************
 * 第10章 构造器应用
 * 10.7 自定义构造器
 * Sample10_10：自定义构造器
***********************************/

package Sample10_10;

class Animal
{
	public Animal()
	{
		
	}
	
	public Animal(String name)
	{
		System.out.println("我是Animal类的构造器！");
	}
}

class Bird extends Animal
{
	//子类没有定义构造器，则会调用默认构造器，并会调用父类的无参构造器，如果父类没有提供无参构造器，则会出错
}

public class Sample10_10 
{
	public static void main(String[] args)
	{
		new Bird();
	}
}
