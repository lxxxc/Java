/***********************************
 * 第18章 内存管理技术
 * 18.4 最终守护者实例
 * Sample18_04：最终守护者实例
***********************************/

package Sample18_04;

class FinalGuarder
{
	private Object fg = new Object()	//最终守护者，必须为private，当子类对象成为垃圾时，父类对象也将成为垃圾，也要被收集，执行finalize方法，达到了自动级联调用的效果
			{
		public void finalize() throws Throwable
		{
			System.out.println("FinalGuarder类被进行垃圾收集时需要执行的finalize工作！");
		}
			};
}

class FinalGuarderSon extends FinalGuarder
{
	public void finalize() throws Throwable
	{
		System.out.println("FinalGuarderSon类被进行垃圾收集时需要执行的finalize工作！");
	}
}

public class Sample18_04 
{
	public static void main(String[] args)
	{
		new FinalGuarderSon();
		
		System.gc();
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
