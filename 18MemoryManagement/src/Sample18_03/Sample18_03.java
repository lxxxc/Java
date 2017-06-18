/***********************************
 * 第18章 内存管理技术
 * 18.3 如何收集“垃圾”
 * Sample18_03：finalize安全问题
***********************************/

package Sample18_03;

class CallBack
{
	static CallBack help;
	
	public void show()
	{
		System.out.println("show方法还能访问，该对象没有被垃圾收集！");
	}
	
	public void finalize()
	{
		System.out.println("第一次收集CallBack对象，调用了finalize方法！");
		CallBack.help = this;	//挽救自己不成为垃圾
	}
}

class Common
{
	public void finalize()
	{
		System.out.println("收集Common对象，调用了finalize方法！");
	}
}

public class Sample18_03 
{
	public static void main(String[] args)
	{
		System.out.println("==========创建了一个CallBack对象并使其成为垃圾==========");
		new CallBack();
		
		System.gc();	//申请垃圾收集器运行，CallBack对象被挽救，没有被垃圾收集
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		CallBack.help.show();
		
		System.out.println("==========创建了一个Common对象并使其成为垃圾==========");
		new Common();
		System.out.println("==========再次使CallBack对象成为垃圾==========");
		CallBack.help = null;
		
		System.gc();	//再次申请垃圾收集器运行，由于已经执行过CallBack对象的finalize方法，不再执行，直接清除对象
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		CallBack.help.show();
	}
}
