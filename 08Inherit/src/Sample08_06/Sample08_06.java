/***********************************
 * 第8章 父与子的继承
 * Sample8_4：成员变量的继承-受保护成员
***********************************/

package Sample08_06;

import Sample08_03.Sample08_03;

class Sample8_6son extends Sample08_03
{
	public void getShow()
	{
		System.out.println("子类内代码调用结果：" + this.str2);
	}
}

public class Sample08_06 
{
	public static void main(String[] args)
	{
		Sample8_6son s = new Sample8_6son();
	
//		System.out.println("子类外代码调用结果：" + s.str);	//包外的类只能通过继承才能访问protected成员变量，包内的可以正常访问
		s.getShow();
	}
}
