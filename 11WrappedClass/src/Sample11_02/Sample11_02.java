/***********************************
 * 第11章 迷惑的封装类
 * 11.2 字符串与基本数据类型值的转换
 * Sample11_02：字符串转换为基本数据类型值
***********************************/

package Sample11_02;

public class Sample11_02 
{
	public static void main(String[] args)
	{
		String number;
		
		number = "60";
		byte b = Byte.parseByte(number);
		System.out.println("十进制byte：" + b);
		b = Byte.parseByte(number, 8);
		System.out.println("八进制byte：" + b);
		
		number = "-30";
		short s = Short.parseShort(number);
		System.out.println("十进制short：" + s);
		s = Short.parseShort(number, 8);
		System.out.println("八进制short：" + s);
		
		number = "100101";
		int i = Integer.parseInt(number);
		System.out.println("十进制int：" + i);
		i = Integer.parseInt(number, 2);
		System.out.println("二进制int：" + i);
		
		number = "124.34f";
		float f = Float.parseFloat(number);
		System.out.println("float：" + f);

		number = "111.2431";
		double d = Double.parseDouble(number);
		System.out.println("double：" + d);
		
		number = "725585265655223";
		long l = Long.parseLong(number);
		System.out.println("long：" + l);
	}
}
