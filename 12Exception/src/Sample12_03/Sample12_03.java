/***********************************
 * 第12章 如何处理异常
 * 12.1 异常处理
 * Sample12_03：finally语句
***********************************/

/********** try-catch-finally语句 **********/
/* 无catch时finally必须紧跟try
/* catch与finally不能同时省略
/* try、catch以及finally块之间不能插入任何其他代码
/********** try-catch-finally语句 **********/
package Sample12_03;

public class Sample12_03 
{
	public static void main(String[] args)
	{
		try	//出现异常后代码不执行
		{
			int[] a = new int[4];
//			int[] a = null;	//空引用，会被NullPointerException异常捕获
			System.out.println("整型数组创建完毕！");
			
			a[3] = 9;
//			a[4] = 9;	//数据下标越界，没有异常处理，向上传播给main方法
			System.out.println("整型数组中第四个元素的数值为" + a[3] + "！");
		}
		catch(NullPointerException npe)	//不出现异常，代码不执行
		{
			System.out.println("这里出现的错误类型是：空引用！");
		}
		finally	//代码总会被执行(例外：finally语句块本身产生异常/执行finally语句块的线程死亡/finally语句块中执行了System.exit(0);方法/计算机断电)
		{
			System.out.println("这里是finally块，无论是否抛出异常，这里总能执行！");
		}
	}
}
