/***********************************
 * 第13章 字符串应用
 * 13.3 String内存机制的优势
 * Sample13_05：字符串常量池
***********************************/

package Sample13_05;

public class Sample13_05 
{
	public static void main(String[] args)
	{
		String s1 = "JavaSE 7.0";	//简单语法创建字符串对象->在字符串常量池中创建对象
		String s2 = new String("JavaSE 7.0");	//使用new语法创建字符串对象->在堆(不是字符串常量池)中创建对象，再与字符串常量池中的对象联系起来
		
		if (s1 == s2)	//判断字符串引用是否指向同一个对象->不是同一个对象
		{
			System.out.println("字符串s1与字符串s引用的是同一个变量！");
		}
		else
		{
			System.out.println("字符串s1与字符串s引用的不是同一个变量！");
		}
		
		if (s1.intern() == s2.intern())	//判断字符串引用指向的对象在字符串常量池中联系的是否是同一个对象->内容相同，因此是同一个对象
		{
			System.out.println("字符串s1与字符串s在字符串常量池中联系的是同一个对象！");
		}
		else
		{
			System.out.println("字符串s1与字符串s在字符串常量池中联系的是不同一个对象！");
		}
	}
}
