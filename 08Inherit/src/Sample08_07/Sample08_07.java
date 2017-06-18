/***********************************
 * 第8章 父与子的继承
 * Sample8_7：成员变量的隐藏
***********************************/

package Sample08_07;

class Father
{
	String s = "父类的成员变量";
}

class Son extends Father
{
	String s = "子类的成员变量";
	
	public void show()
	{
		System.out.println("这里将调用的是：" + s);	//直接调用s将访问子类的成员变量
		System.out.println("这里将调用的是：" + super.s);	//使用super关键字来访问父类的同名变量
	}
}

public class Sample08_07 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		
		s.show();
	}
}
