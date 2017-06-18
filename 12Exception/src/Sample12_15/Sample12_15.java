/***********************************
 * 第12章 如何处理异常
 * 12.6 自定义异常
 * Sample12_15：自己创建异常类
***********************************/

package Sample12_15;

class MyException extends Exception	//自定义异常类，一般从Exception类或其他捕获异常类继承
{
	public MyException()
	{
	}
	
	public MyException(String msg)
	{
		super(msg);	//调用父类的构造器
	}
}

public class Sample12_15 
{
	public static void main(String[] args)
	{
		MyException me = new MyException("自定义异常类");
		
		System.out.println("自定义异常对象的字符串表示为：" + me.toString() +"！");
		System.out.println("自定义异常对象携带的出错信息为：" + me.getMessage() +"！");
	}
}
