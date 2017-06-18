/***********************************
 * 第8章 父与子的继承
 * 8.7 方法的重载
 * Sample08_24：重载方法的匹配-基本参数类型
***********************************/

package Sample08_24;

class Adder
{
	public int add(int i, int j)
	{
		System.out.print("两个int参数的方法被调用，");
		return i+j;
	}
	
	public double add(double i, double j)	//重名方法，构成重载
	{
		System.out.print("两个double参数的方法被调用，");
		return i+j;
	}
}

public class Sample08_24 
{
	public static void main(String[] args)
	{
		Adder a = new Adder();
		
		System.out.println("2+5=" + a.add(2, 5));	//根据参数的类型，调用匹配的方法；如果没有直接匹配的方法，将根据基本数据类型的自动转换关系，调用最匹配的方法
		System.out.println("5+30.8=" + a.add(5,30.8));
	}
}
