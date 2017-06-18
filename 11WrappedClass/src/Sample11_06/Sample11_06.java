/***********************************
 * 第11章 迷惑的封装类
 * 11.5 其它常用方法
 * Sample11_06：equals()方法
***********************************/

package Sample11_06;

public class Sample11_06 
{
	public static void main(String[] args)
	{
		int i = 125;
		Integer wInt = Integer.valueOf(i);
		System.out.println("wInt " + (wInt.equals(wInt) ? "等于" : "不等于") + " wInt");	//比较对象值是否相等
		System.out.println("wInt " + (wInt == wInt ? "==" : "!=") + " wInt");	//比较对象引用是否相等
		
		Integer wInt1 = Integer.valueOf(i);
		System.out.println("wInt " + (wInt.equals(wInt1) ? "等于" : "不等于") + " wInt");
		System.out.println("wInt " + (wInt == wInt1 ? "==" : "!=") + " wInt");
		
		int i1 = 127;
		wInt = Integer.valueOf(i1);
		System.out.println("wInt " + (wInt.equals(wInt1) ? "等于" : "不等于") + " wInt");
		System.out.println("wInt " + (wInt == wInt1 ? "==" : "!=") + " wInt");
	}
}
