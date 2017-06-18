/***********************************
 * 第12章 如何处理异常
 * 12.6 自定义异常
 * Sample12_17：显性再抛出异常的作用
***********************************/

package Sample12_17;

class MyExceptionToHighLevel extends Exception	//中层向上层报告异常类
{
	public MyExceptionToHighLevel()
	{
		
	}
	
	public MyExceptionToHighLevel(String msg)
	{
		super(msg);
	}
}

class MyExceptionFromLowLevel extends Exception	//低层向中层报告异常类
{
	public MyExceptionFromLowLevel()
	{
		
	}
	
	public MyExceptionFromLowLevel(String msg)
	{
		super(msg);
	}
}

class MyClass
{
	public void doLowLevelStaff(int a) throws MyExceptionFromLowLevel
	{
		if (a > 50)
		{
			System.out.println("恭喜你，低层方法执行成功！");
		}
		else
		{
			System.out.println("低层发生事故，上报！！");
			throw new MyExceptionFromLowLevel("值不大于50，发生事故！");	//执行发生错误，显性将异常抛出
		}
	}
	
	public void doMiddleLevelStaff() throws MyExceptionToHighLevel
	{
		try
		{
			int value = (int)Math.round(Math.random() * 100);
			System.out.println("调用值为：" + value + "！");
			this.doLowLevelStaff(value);	//调用低层处理方法，有可能产生异常
		}
		catch (MyExceptionFromLowLevel e)	//捕获低层异常，然后做处理，之后显性将异常再抛出
		{
			System.out.println("发生事故，中层先进行一些处理，然后上报到上层！");
			throw new MyExceptionToHighLevel("有事故发生，请上层处理！");
		}
	}
	
	public void doHighLevelStaff()
	{
		try
		{
			this.doMiddleLevelStaff();	//调用中层处理方法，有可能产生异常
		}
		catch (MyExceptionToHighLevel e)	
		{
			System.out.println("上层最终处理事故！");
		}
	}
}

public class Sample12_17 
{
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();
		mc.doHighLevelStaff();
	}
}
