/***********************************
 * 第15章 内部类应用
 * 15.2 在外部类中创建内部类
 * Sample15_01：在外部类中创建内部类
***********************************/

package Sample15_01;

class Outter
{
	class Inner	//创建内部类
	{
		public void show()
		{
			System.out.println("恭喜你，创建了内部类的对象，并且调用了内部类中的方法！");
		}
	}
	
	public void createrInner()
	{
		Inner i = new Inner();	//创建内部类对象
		i.show();	//调用内部类的方法
	}
}

public class Sample15_01 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.createrInner();
	}
}
