/***********************************
 * 第10章 构造器应用
 * 10.4 创建对象
 * Sample10_04：创建对象
***********************************/

package Sample10_04;

class Animal
{
	String name;
	int size;
	
	public Animal(String name, int size)	//有参构造器，构造器不能有返回值，名称必须与类名一致
	{
		this.name = name;
		this.size = size;
		System.out.println("有参构造器Animal(String name, int size)执行！");
	}
}

public class Sample10_04 
{
	public static void main(String[] args)
	{
		Animal a = new Animal("tom", 40);
		System.out.println("我的名字叫" + a.name + "，我的身体长" + a.size + "厘米");
	}
}
