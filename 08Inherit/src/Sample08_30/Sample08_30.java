/***********************************
 * 第8章 父与子的继承
 * 8.9 abstract与继承
 * Sample08_30：抽象方法-声明
***********************************/

package Sample08_30;
abstract class Car
{
	private double price;
	public abstract void startUp();	//抽象的方法只能存在于抽象类中，没有方法体，不能是private的
	public double getPrice()	//抽象类中可以有非抽象的方法
	{
		return this.price;
	}
}

public class Sample08_30 
{

}
