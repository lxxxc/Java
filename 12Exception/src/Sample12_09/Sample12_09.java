/***********************************
 * 第12章 如何处理异常
 * 12.4 再次抛出异常
 * Sample12_09：异常的再抛出
***********************************/

package Sample12_09;

public class Sample12_09 
{
	public static void main(String[] args)
	{
		a();
		System.out.println("恭喜你，调用方法成功，程序正常工作！");
	}
	
	static void a()
	{
		try	//方法a中对异常进行了处理
		{
			b();
		}
		catch (RuntimeException re) 
		{
			System.out.println("异常在a方法被解决掉！");
		}
	}
	
	static void b()
	{
		c();	//b方法中也未对异常进行处理，异常会被调用b方法的上一层方法a
	}
	
	static void c()
	{
		int[] a = new int[3];
		a[4] = 12;	//a方法中产生数组下标越界异常，但没有处理，异常会被调用c方法的上一层方法b
	}
}
