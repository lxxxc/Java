/***********************************
 * 第11章 迷惑的封装类
 * 11.5 其它常用方法
 * Sample11_04：静态工厂方法
***********************************/

package Sample11_04;

public class Sample11_04 
{
	public static void main(String[] args)
	{
		Integer wInt;
		int i = 10;
		int radix = 2;	
		String s = "1001011";
		
		wInt = Integer.valueOf(i);	//调用静态工厂方法valueOf()，通过int变量生成Integer对象
		System.out.println("int：" + i + "; Integer:" + wInt);
		
		wInt = Integer.valueOf(s);	//调用静态工厂方法valueOf()，通过string变量生成Integer对象
		System.out.println("String：" + s + "; Integer(10进制):" + wInt);
		
		wInt = Integer.valueOf(s, radix);
		System.out.println("String：" + s + "; Integer(2进制):" + wInt);
		
		Boolean wBoolean;
		boolean b = true;
		s = "false";
		
		wBoolean = Boolean.valueOf(b);
		System.out.println("boolean：" + b + "; Boolean:" + wBoolean);
		
		wBoolean = Boolean.valueOf(s);
		System.out.println("boolean：" + s + "; Boolean:" + wBoolean);
	}
}
