/***********************************
 * 第8章 父与子的继承
 * 8.3 对象
 * Sample08_10：对象调用成员
***********************************/

package Sample08_10;

public class Sample08_10 
{
	public static void main(String[] args)
	{
		Fruit f = new Apple();
		
		System.out.println("调用父类和子类共有的成员变量name=" + f.name);	//引用可以调用其所在类具有的成员
//		System.out.println("子类特有的成员变量aname" + f.aname);	//引用不能调用其子类特有的成员
	}
}

class Fruit
{
	String name = "水果";
}

class Apple extends Fruit
{
	String name = "苹果";
	String aname = "苹果a";
}