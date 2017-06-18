/***********************************
 * 第15章 内部类应用
 * 15.9 匿名内部类
 * Sample15_11：基于继承的匿名内部类
***********************************/

package Sample15_11;

class Father
{
	public void show()
	{
		System.out.println("这里是Father类的方法");
	}
}

public class Sample15_11 
{
	public static void main(String[] args)
	{
		Father f = new Father()	//声明一个匿名内部类，同时创建一个匿名内部类对象
		{
			public void show()
			{
				System.out.println("恭喜你，成功创建了匿名内部类的对象！");
			}
		};	//需要一个；		
		f.show();
	}
}
