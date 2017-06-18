/***********************************
 * 第11章 迷惑的封装类
 * 11.5 其它常用方法
 * Sample11_07：toString()方法
***********************************/

package Sample11_07;

public class Sample11_07 
{
	public static void main(String[] args)
	{
		Integer wInt = Integer.valueOf("2345");
		System.out.println("wInt: " + wInt.toString());
		
		Boolean wBoolean = Boolean.valueOf(true);
		System.out.println("wBoolean: " + wBoolean.toString());
	}
}
