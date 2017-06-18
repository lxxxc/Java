/***********************************
 * 第10章 构造器应用
 * 10.10 单列模式
 * Sample10_15：单列模式
***********************************/

package Sample10_15;

class Singleton
{
	private static Singleton singleInstance;
	
	private Singleton()	//构造器是private的，只能在自己类中调用
	{
		System.out.println("执行单列模式类的构造器！");
	}
	
	public static Singleton getInstance()	//通过静态工厂方法来创建对象
	{
		if (singleInstance == null)
		{
			singleInstance = new Singleton();
		}
		return singleInstance;
	}
}

public class Sample10_15 
{
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2)
		{
			System.out.println("两个引用指向同一个对象！");
		}
		else
		{
			System.out.println("两个引用指向不同的对象！");
		}
	}
}
