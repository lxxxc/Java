/***********************************
 * 第15章 内部类应用
 * 15.7 静态内部类
 * Sample15_10：创建静态内部类的对象
***********************************/

package Sample15_10;

import java.util.*;

class Outter
{
	static class Inner
	{
		public void show()
		{
			System.out.println("恭喜你，成功创建了静态内部类的对象！");
		}
	}
	
	public void getInner()
	{
		Inner ii = new Inner();
		ii.show();
	}
}

public class Sample15_10 
{
	public static void main(String[] args)
	{
		Outter.Inner i = new Outter.Inner();	//直接创建静态内部类对象，无需首先创建外部类对象
		i.show();
		
		Outter o = new Outter();
		o.getInner();
	}
}
