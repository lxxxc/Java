/***********************************
 * 第15章 内部类应用
 * 15.3 在外部类外创建内部类
 * Sample15_02：在外部类外创建内部类
***********************************/

package Sample15_02;

class Outter
{
	class Inner	//创建内部类
	{
		public void show()
		{
			System.out.println("恭喜你，创建了内部类的对象，并且调用了内部类中的方法！");
		}
	}
}

public class Sample15_02 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();	//首先创建外部类的对象
		Outter.Inner i = o.new Inner();	//再创建内部类的对象(引用需要用外部类名修饰，构造器也要用外部类修饰)
		i.show();
	}
}
