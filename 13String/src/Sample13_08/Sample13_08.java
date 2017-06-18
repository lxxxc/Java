/***********************************
 * 第13章 字符串应用
 * 13.5 StringBuffer类
 * Sample13_08：StringBuffer类的优势
***********************************/

package Sample13_08;

public class Sample13_08 
{
	public static void main(String[] args)
	{
		String s = "JavaSE 7.0";
		StringBuffer sb = new StringBuffer("JavaSE 7.0");
		String str = "核心技术大全";
		
		s.concat(str);	//String对象字符串连接，返回新字符串对象的引用，但s本身没有变化
		sb.append(str);	//StringBuffer对象字符串连接，sb对象发生了变化
		
		System.out.println("对String对象s以及StringBuffer对象sb做字符串连接操作，结果如下：");
		System.out.println("操作后s = " + s);
		System.out.println("操作后sb = " + sb);
	}
}
