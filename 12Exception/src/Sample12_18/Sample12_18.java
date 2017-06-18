/***********************************
 * 第12章 如何处理异常
 * 12.7 异常的匹配
 * Sample12_18：同时捕获多种异常
***********************************/

package Sample12_18;

public class Sample12_18 
{
	public static void main(String[] args)
	{
		try
		{
			int[] a = new int[4];
			a[4] = 9;
		}
		catch (Exception e)	//Exception是所有异常类的父类，因此可以捕获所有的异常类
		{
			System.out.println("异常种类及类型为：" + e.toString() +"！");
		}
	}
}
