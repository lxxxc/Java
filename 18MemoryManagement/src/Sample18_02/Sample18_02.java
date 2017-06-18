/***********************************
 * 第18章 内存管理技术
 * 18.3 如何收集“垃圾”
 * Sample18_02：finalize重写
***********************************/

package Sample18_02;

class Father
{
	public void finalize() throws Throwable
	{
		super.finalize();	//调用父类的finalize()方法
		System.out.println("恭喜你，这里是Father类，清理前成功调用了finalize方法！");	//自己类的清理代码
	}	
}

class Son extends Father
{
	public void finalize() throws Throwable
	{
		super.finalize();	//调用父类的finalize()方法
		System.out.println("恭喜你，这里是Son类，清理前成功调用了finalize方法！");	//自己类的清理代码
	}	
}

public class Sample18_02 
{
	public static void main(String[] args)
	{
		new Son();
		
		System.gc();	//申请垃圾收集器运行，会调用父类的finalize()方法，直到追溯至Object类的finalize()方法
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
