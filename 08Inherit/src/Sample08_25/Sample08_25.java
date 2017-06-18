/***********************************
 * 第8章 父与子的继承
 * 8.7 方法的重载
 * Sample08_25：重载方法的匹配-引用数据类型
***********************************/

package Sample08_25;

class Vehicle{}

class Car extends Vehicle{}

class Truck extends Car{}

class UseCar
{
	public void show(Vehicle v)
	{
		System.out.println("调用的是具有Vehicle参数的方法！");
	}
	public void show(Car v)
	{
		System.out.println("调用的是具有Car参数的方法！");
	}
}

public class Sample08_25 
{
	public static void main(String[] args)
	{
		UseCar a = new UseCar();
		Vehicle v = new Vehicle();
		Vehicle vc = new Car();
		Car c = new Car();
		Truck t = new Truck();
		
		System.out.print("用Vehicle类型参数调用：");	//调用参数类型匹配的方法
		a.show(v);
		System.out.print("用Car类型参数调用：");	//调用参数类型匹配的方法
		a.show(c);
		System.out.print("用Truck类型参数调用：");	//没有直接匹配方法时，寻找最匹配的方法
		a.show(t);
		System.out.print("用Vehicle类型参数调用：");	//引用类型决定调用哪个方法，而不是对象类型
		a.show(vc);
	}
}
