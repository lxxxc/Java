/***********************************
 * 第13章 字符串应用
 * 13.3 String内存机制的优势
 * Sample13_06：永远不变的字符串对象
***********************************/

package Sample13_06;

public class Sample13_06 
{
	public static void main(String[] args)
	{
		String s1 = "JavaSE 7.0";
		String s2 = "核心技术大全";
		
		s2 = s1.concat(s2);	//执行连接操作后，s1本身没有发生变化，将连接后的字符串对象的引用返回使s2指向新字符串引用
		
		System.out.println("对字符串s1进行连接字符串操作，字符串s1与s2的结果为：");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}
}
