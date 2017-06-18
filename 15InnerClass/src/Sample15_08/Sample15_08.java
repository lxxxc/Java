/***********************************
 * 第15章 内部类应用
 * 15.6 局部内部类
 * Sample15_08：局部变量与局部内部类
***********************************/

package Sample15_08;

interface ForInner
{
	void sayHello();
}

class Outter
{
	ForInner forInner = null;
	
	public void getInner()
	{
		class Inner implements ForInner
		{
			public void sayHello()
			{
				System.out.println("你好，我是局部内部类对象，我还存在！");
			}
		}
		forInner = new Inner();	//创建ForInner接口型引用，用来在外部指向局部内部类的对象
	}
}

public class Sample15_08 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInner();
		o.forInner.sayHello();	//创建的局部内部类对象在语句块结束后，仍然存在
	}
}
