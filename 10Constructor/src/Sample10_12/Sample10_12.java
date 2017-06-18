/***********************************
 * 第10章 构造器应用
 * 10.9 调用兄弟构造器
 * Sample10_12：调用语法
***********************************/

package Sample10_12;

class Animal
{
	public Animal(String name)
	{
		System.out.println("我是Animal类的构造器，参数name = " + name);
	}
	
	public Animal()
	{
		this("tom");	//调用Animal类的有参构造器，必须写在构造器的第一句，同时编译器也不会自动添加super();
	}
}

public class Sample10_12 
{
	public static void main(String[] args)
	{
		new Animal();
	}
}
