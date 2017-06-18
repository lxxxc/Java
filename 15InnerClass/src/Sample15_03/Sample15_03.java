/***********************************
 * 第15章 内部类应用
 * 15.4 内部类与外部类之间的成员互访
 * Sample15_03：在内部类中访问外部类的成员
***********************************/

package Sample15_03;

class Outter
{
	private int x = 100;
	
	class Inner	//创建内部类
	{
		public void show()
		{
			System.out.println("外部类的成员变量x的值为：" + x + "！");	//在内部类中可以访问外部类的任何成员
		}
	}
}

public class Sample15_03 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		Outter.Inner i = o.new Inner();
		i.show();		
	}
}
