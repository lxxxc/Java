/***********************************
 * 第12章 如何处理异常
 * 12.7 异常的匹配
 * Sample12_19：多个catch语句的先后顺序
***********************************/

package Sample12_19;

public class Sample12_19 
{
	public static void main(String[] args)
	{
		try
		{
			int[] a = null;
			a[4] = 9;
		}
		catch (NullPointerException npe)	//NullPointerException类继承至Exception类，因此捕获异常的代码必须在前面
		{
			System.out.println("产生空引用异常：" + npe.toString() +"！");
		}
		catch (Exception e)
		{
			System.out.println("产生异常：" + e.toString() +"！");
		}

	}
}
