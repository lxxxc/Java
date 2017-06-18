/***********************************
 * 第8章 父与子的继承
 * 8.5 方法的重写
 * Sample08_18：重写的返回类型规则-对象引用类型
***********************************/

package Sample08_18;

class Father
{
}

class Son extends Father
{
}

class Vehicle
{
	public Father getMe()
	{
		Father f = new Father();
		System.out.println("方法没有成功重写！");
		return f;
	}
}

class Car extends Vehicle
{
	public Son getMe()	//返回类型派生至父类的返回类型，构成重写
	{
		Son s = new Son();
		System.out.println("方法成功重写！");
		return s;
	}
}
public class Sample08_18 
{
	public static void main(String[] args)
	{
		Vehicle v = new Car();
		
		System.out.println("调用的结果为：");
		v.getMe();
	}
}
