/***********************************
 * 第11章 迷惑的封装类
 * 11.5 其它常用方法
 * Sample11_08：进制转换方法
***********************************/

package Sample11_08;

public class Sample11_08 
{
	public static void main(String[] args)
	{
		String s = "";
		int i = 60;
		
		s = Integer.toBinaryString(i);
		System.out.println(i + "转换为二进制：" + s);
		s = Integer.toOctalString(i);
		System.out.println(i + "转换为八进制：" + s);
		s = Integer.toHexString(i);
		System.out.println(i + "转换为十六制：" + s);
	}
}
