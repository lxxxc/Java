/***********************************
 * 第10章 构造器应用
 * 10.7 自定义构造器
 * Sample10_09：自定义构造器
***********************************/

package Sample10_09;

class Animal
{
	public Animal(String name)
	{
		System.out.println("我是Animal类的构造器！");
	}
}

public class Sample10_09 
{
	public static void main(String[] args)
	{
//		new Animal();	//自定义构造器后，系统不再提供默认无参构造器，因此调用无参构造器出错
		new Animal("tom");
	}
}
