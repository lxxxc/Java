/***********************************
 * 第18章 内存管理技术
 * 18.2 “垃圾”收集器
 * Sample18_01：申请垃圾收集器运行
***********************************/

package Sample18_01;

public class Sample18_01 
{
	public static void main(String[] args)
	{
		Runtime rt = Runtime.getRuntime();	//调用静态工厂方法得到Runtime对象
		System.out.println("当前JVM使用的总内存量为：" + rt.totalMemory());
		
		System.gc();	//申请垃圾收集器运行
		try
		{
			Thread.sleep(100);	//休眠主线程，提高申请垃圾收集器运行的成功率
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("创建10000000个垃圾对象前JVM中可用内存为：" + rt.freeMemory());
		for (int i = 0; i < 10000000; i++) 
		{
			new String("Rubbish");
		}
		System.out.println("创建10000000个垃圾对象后JVM中可用内存为：" + rt.freeMemory());
		
		System.gc();
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("申请垃圾收集器运行后JVM中可用内存为：" + rt.freeMemory());
	}
}
