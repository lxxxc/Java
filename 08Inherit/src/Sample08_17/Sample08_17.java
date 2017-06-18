/***********************************
 * 第8章 父与子的继承
 * 8.5 方法的重写
 * Sample08_17：重写的返回类型规则-基本数据类型
***********************************/

package Sample08_17;

class Vehicle
{
	public int getMoney()
	{
		return 20;
	}
}

class Car extends Vehicle
{
//	public long getMoney()	//返回类型与父类方法不一致，报错，不能构成重写
//	{
//		return 110L;
//	}
}

public class Sample08_17 
{
	public static void main(String[] args)
	{
		Vehicle v = new Car();
		
		System.out.println("轿车的价格为：" + v.getMoney());
	}
}
