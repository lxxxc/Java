/***********************************
 * 第15章 内部类应用
 * 15.4 内部类与外部类之间的成员互访
 * Sample15_04：在外部类中访问内部类的成员
***********************************/

package Sample15_04;

class Outter
{
	private int x = 100;
	
	class Inner	//创建内部类
	{
//		private static int innerCount = 10;	//内部类中不可以有静态成员
		
		private void show()
		{
			System.out.println("恭喜你，成功调用了内部类中的私有方法！");	
		}
	}
	
	public void getInnerShow()
	{
		Inner i = new Inner();
		i.show();	//外部类可以访问内部类的任何成员，需要首先创建内部类的对象
	}
}

public class Sample15_04 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInnerShow();
	}
}
