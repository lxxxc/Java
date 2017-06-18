/***********************************
 * 第12章 如何处理异常
 * 12.8 断言
 * Sample12_20：启动断言执行代码
***********************************/

//开启断言：Window->Preferences->Java->Installed JREs->Edit->Default VM arguments:-ea

package Sample12_20;

public class Sample12_20 
{
	public static void main(String[] args)
	{
		myFunction(-12);
	}
	
	private static void myFunction(int i)
	{
		assert (i >= 0):"断言失败，数值i小于0，其值i=" + i;
		System.out.println("恭喜你，断言判断成功，程序继续正常运行！");
	}
}
