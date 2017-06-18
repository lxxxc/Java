/***********************************
 * 第15章 内部类应用
 * 15.6 局部内部类
 * Sample15_06：定义局部内部类及创建
***********************************/

package Sample15_06;

class Outter
{
	public void getInner()
	{
		class Inner	//定义局部内部类
		{
			public void show()
			{
				System.out.println("恭喜你，定义并创建了局部内部类的对象！");
			}
		}
		Inner i = new Inner();	//创建局部内部类对象
		i.show();
	}
}

public class Sample15_06 
{
	public static void main(String[] args)
	{
		Outter o = new Outter();
		o.getInner();
	}
}
