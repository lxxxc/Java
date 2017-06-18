/***********************************
 * 第8章 父与子的继承
 * 8.4 方法的继承
 * Sample08_14：方法的继承
***********************************/

package Sample08_14;

import Sample08_13.*;

public class Sample08_14 
{
	public static void main(String[] args)
	{
		Sample08_13Son s = new Sample08_13Son();
		
		System.out.print("子类外代码调用结果：");
		s.show();
		s.getShow();
	}
}

class Sample08_13Son extends Sample08_13
{
	public void getShow()
	{
		System.out.print("子类内代码调用结果：");
		this.show();
	}
}
