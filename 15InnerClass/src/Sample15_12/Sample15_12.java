/***********************************
 * 第15章 内部类应用
 * 15.9 匿名内部类
 * Sample15_12：基于接口实现的匿名内部类
***********************************/

package Sample15_12;

interface MyInterface
{
	public void show();
}

public class Sample15_12 
{
	public static void main(String[] args)
	{
		MyInterface mi = new MyInterface()	//定义实现MyInterface接口的匿名内部类并创建对象
		{
			public void show() 
			{
				System.out.println("恭喜你，创建了匿名内部类的对象，该类实现了MyInterface接口！");
			}		
		};
		mi.show();
	}
}
