/***********************************
 * 第12章 如何处理异常
 * 12.1 异常处理
 * Sample12_01：try-catch语句的执行流程
***********************************/

package Sample12_01;

public class Sample12_01 
{
	public static void main(String[] args)
	{
		try
		{
			int[] a = new int[4];
//			int[] a = null;	//空引用，会被NullPointerException异常捕获
			System.out.println("整型数组创建完毕！");
			
			a[3] = 9;
//			a[4] = 9;	//数据下标越界，会被ArrayIndexOutOfBoundsException异常捕获
			System.out.println("整型数组中第四个元素的数值为" + a[3] + "！");
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("这里出现的错误类型是：数组下标越界！");
		}
		catch(NullPointerException npe)
		{
			System.out.println("这里出现的错误类型是：空引用！");
		}
		System.out.println("主程序正常结束！");
	}
}
