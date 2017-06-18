/***********************************
 * 第13章 字符串应用
 * 13.8 在String类中使用正则表达式
 * Sample13_14：查找替换
***********************************/

package Sample13_14;

import java.util.regex.*;

public class Sample13_14 
{
	public static void main(String[] args)
	{
		String patternStr = "\\b\\d*\\.\\d{3,}\\b";	//匹配小数点后超过三位数的数字
		
		String s1 = "123.5 123.56 123.567 123.5600 123.0098";	
		System.out.println("初始字符串内容为：" + s1);
		
		String s2 = s1.replaceAll(patternStr, "Error");
		System.out.println("使用replaceAll对其进行匹配替换后：" + s2);
		
		s2 = s1.replaceFirst(patternStr, "Error");
		System.out.println("使用replaceFirst对其进行匹配替换后：" + s2);
	}
}
