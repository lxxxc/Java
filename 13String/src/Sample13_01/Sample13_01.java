/***********************************
 * 第13章 字符串应用
 * 13.1 String类
 * Sample13_01：对象的创建
***********************************/

package Sample13_01;

public class Sample13_01 
{
	public static void main(String[] args)
	{
		String s1 = "Java核心技术大全欢迎您！";	//使用简单语法创建字符串
		String s2 = new String("恭喜你分别用两种不同的语法创建了字符串！");	//使用构造器创建字符串
		String s3 = "";	//创建空字符串对象，打印后什么也没有
		String s4 = null;	//字符串引用s4的值为null，打印为null
		
		System.out.println(s1 + "#" + s2 + "#" + s3 + "#" + s4);
	}
}
