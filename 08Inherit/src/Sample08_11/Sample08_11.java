/***********************************
 * 第8章 父与子的继承
 * 8.3 对象
 * Sample08_11：对象的赋值
***********************************/

package Sample08_11;

class Fruit
{
}

class Apple extends Fruit
{
}

public class Sample08_11 
{
	public static void main(String[] args)
	{
		Apple a = new Apple();
		
		Fruit f = a;	//可以将子类引用赋值给父类引用
		
		a = (Apple)f;	//不能将父类引用赋值给子类引用，需要强制类型转换
	}
}
