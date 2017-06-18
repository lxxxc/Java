/***********************************
 * 第15章 内部类应用
 * 15.5 预定义对象引用this
 * Sample15_05：预定义对象引用this
***********************************/

package Sample15_05;

class Outter
{
	int x = 100;
	
	class Inner
	{
		int x = 10000;
		
		public void show()
		{
			System.out.println("访问外部类Outter中的成员变量，x = " + Outter.this.x);	//使用外部类中的成员变量
			System.out.println("访问内部类Outter中的成员变量，x = " + this.x);	//默认this引用指向内部类对象
		}
	}
}

public class Sample15_05 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		Outter.Inner i = o.new Inner();
		i.show();
	}
}
