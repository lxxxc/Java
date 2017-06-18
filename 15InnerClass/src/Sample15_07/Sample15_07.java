/***********************************
 * 第15章 内部类应用
 * 15.6 局部内部类
 * Sample15_07：局部变量与局部内部类
***********************************/

package Sample15_07;

class Outter
{
	public void getInner()
	{
		final int x = 100;	//局部内部类可以访问final的局部变量
		
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

public class Sample15_07 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInner();
	}
}
