/***********************************
 * 第15章 内部类应用
 * 15.9 匿名内部类
 * Sample15_13：匿名内部类的初始化
***********************************/

package Sample15_13;

abstract class FatherForInner
{
	int count;
	abstract void show();
}

public class Sample15_13 
{
	public static void main(String[] args)
	{
		FatherForInner ffi = new FatherForInner() 
		{
			{	//定义非静态语句块，初始化成员
				count = (int)(100 * Math.random());
			}

			@Override
			public void show() 
			{
				System.out.println("初始化后count的值为：" + count + "！");
			}			
		};
		ffi.show();
	}
}
