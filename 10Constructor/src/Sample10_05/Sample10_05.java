/***********************************
 * 第10章 构造器应用
 * 10.5 重载构造器
 * Sample10_05：重载构造器
***********************************/

package Sample10_05;

class Animal
{
	String name;
	int size;
	
	public Animal()
	{
	}
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	public Animal(String name, int size)
	{
		this.name = name;
		this.size = size;
	}
}

public class Sample10_05 
{
	public static void main(String[] args)
	{
		Animal a = new Animal("tom", 40);
		Animal b = new Animal("tom");
		Animal c = new Animal();
		
		System.out.println("我的名字叫" + a.name + "，我的身体长" + a.size + "厘米");
		System.out.println("我的名字叫" + b.name + "，我的身体长" + b.size + "厘米");
		System.out.println("我的名字叫" + c.name + "，我的身体长" + c.size + "厘米");
	}
}
