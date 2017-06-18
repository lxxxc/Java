/***********************************
 * 第13章 字符串应用
 * 13.1 String类
 * Sample13_02：巧用构造器
***********************************/

package Sample13_02;

public class Sample13_02 
{
	public static void main(String[] args) throws Exception
	{
		String s1 = "Java核心技术大全";
		
		String s2 = new String(s1.getBytes(), "iso8859_1");
		System.out.println("将s1转化为ISO8859_1编码格式，结果为：" + s2);
		
		String s3 = new String(s2.getBytes("iso8859_1"), "gb2312");
		System.out.println("将s2再转化为GB2312编码格式，结果为：" + s3);
	}
}
