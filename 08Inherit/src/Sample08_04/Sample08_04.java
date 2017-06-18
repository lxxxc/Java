/***********************************
 * 第8章 父与子的继承
 * Sample8_4：成员变量的继承-公有成员
***********************************/

package Sample08_04;

import Sample08_03.Sample08_03;

class Sample8_3son extends Sample08_03
{
	public void getShow()
	{
		System.out.println("子类内代码调用结果：" + this.str1);
	}
}

public class Sample08_04 
{
	public static void main(String[] args)
	{
		Sample8_3son s = new Sample8_3son();
	
		System.out.println("子类外代码调用结果：" + s.str1);
		s.getShow();
	}
}
