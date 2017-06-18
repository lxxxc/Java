/***********************************
 * 第11章 迷惑的封装类
 * 11.2 字符串与基本数据类型值的转换
 * Sample11_03：基本数据类型值转换为字符串
***********************************/

package Sample11_03;

public class Sample11_03 
{
	public static void main(String[] args)
	{
		String s;
		
		boolean b = true;
		s = String.valueOf(b);
		System.out.println("boolean转换为String：" + s);
		
		char c = 'A';
		s = String.valueOf(c);
		System.out.println("char转换为String：" + s);
		
		char[] cs = new char[]{'A', 'b', 'E', 'h'};
		s = String.valueOf(cs);
		System.out.println("char[]转换为String：" + s);
		s = String.valueOf(cs, 1, 2);
		System.out.println("char[]转换为String：" + s);
		
		double d = -43.325;
		s = String.valueOf(d);
		System.out.println("double转换为String：" + s);
		
		float f = 23.4f;
		s = String.valueOf(f);
		System.out.println("float转换为String：" + s);
		
		int i = -32443;
		s = String.valueOf(i);
		System.out.println("int转换为String：" + s);
		
		long l = 5744845454614561546L;
		s = String.valueOf(l);
		System.out.println("long转换为String：" + s);
	}
}
