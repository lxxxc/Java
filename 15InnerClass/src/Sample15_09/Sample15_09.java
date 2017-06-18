/***********************************
 * 第15章 内部类应用
 * 15.6 局部内部类
 * Sample15_09：静态方法中的局部内部类
***********************************/

package Sample15_09;

class Outter
{
	static int x =100;	//位于静态方法内的局部内部类只能访问外部类的静态成员
	
	public static void getInner()
	{
		class Inner
		{
			public void show()
			{
				System.out.println("访问方法中的局部变量，x = " + x);
			}
		}
		Inner i = new Inner();
		i.show();
	}
}

public class Sample15_09 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInner();
	}
}
