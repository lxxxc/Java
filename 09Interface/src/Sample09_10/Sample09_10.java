/***********************************
 * 第9章 接口的世界
 * 9.5 接口与抽象类
 * Sample09_10：具体含义的不同
***********************************/

package Sample09_10;

interface Flyer
{
	public abstract void fly();	//接口中的方法默认是public和abstract
}

interface Sailer
{
	public abstract void cruise();
}

abstract class Vehicle
{
	public abstract void consume();	//抽象方法只能出现在抽象类中
}

abstract class Animal
{
	public abstract void eat();
}

abstract class AirPlane extends Vehicle implements Flyer
{
	public void consume()	//实现抽象方法
	{
		System.out.println("我需要消耗汽油！");
	}
	
	public void fly()
	{
		System.out.println("我可以用飞机的方式在天空飞行！");
	}
}

class SeaPlane extends AirPlane implements Sailer
{
	public void cruise()
	{
		System.out.println("我可以用船的方式在水中航行！");
	}
}

class Bird extends Animal implements Flyer
{
	public void eat()
	{
		System.out.println("我需要吃东西！");
	}
	
	public void fly()
	{
		System.out.println("我可以用动物的方式在天空飞行！");
	}
}


public class Sample09_10 
{
	public static void main(String[] args)
	{
		SeaPlane sp = new SeaPlane();
		Bird b = new Bird();
		
		System.out.println("==========水上飞机执行的动作==========");
		sp.fly();
		sp.consume();
		sp.cruise();
		
		System.out.println("==========鸟执行的动作==========");
		b.fly();
		b.eat();
	}
}
