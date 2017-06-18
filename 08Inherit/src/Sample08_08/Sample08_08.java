/***********************************
 * 第8章 父与子的继承
 * 8.3 对象
 * Sample8_8：强制类型转换
***********************************/

package Sample08_08;

public class Sample08_08 
{
	public static void main(String[] args)
	{
		Car c = new Truck();	//引用类型指向Car类，对象是Truck类型的
		
		System.out.println("访问的成员为：" + c.aMember + "!");	//访问的是引用类型Car类的成员变量
		System.out.println("访问的成员为：" + ((Truck)c).aMember + "!");		//强制类型转换后访问Truck类的成员变量
	}
}

class Car
{
	String aMember = "我是汽车类的成员变量";
}

class Truck extends Car
{
	String aMember = "我是卡车类的成员变量，汽车类也有";
}

