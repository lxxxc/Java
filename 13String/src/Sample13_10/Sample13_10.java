/***********************************
 * 第13章 字符串应用
 * 13.5 StringBuffer类
 * Sample13_10：StringBuffer类的重要方法
***********************************/

package Sample13_10;

public class Sample13_10 
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Java7.0");
		System.out.println("操作之前对象sb1的内容为：" + sb1);
		
		sb1.append("核心技术大全").insert(4, "SE").delete(9, 15).reverse();
		System.out.println("一系列操作之后对象sb1的内容为：" + sb1);
		
		
		StringBuffer sb2 = new StringBuffer(sb1.toString());
		System.out.println("===== 使用StringBuffer的equals方法测试对象sb1与sb2的内容 =====");
		if (sb1.equals(sb2))	//StringBuffer类的equals方法相当于比较两个引用是否指向同一个对象，相当于"=="
		{
			System.out.println("对象sb1与sb2的内容相同！");
		}
		else
		{
			System.out.println("对象sb1与sb2的内容不相同！");
		}
		
		System.out.println("===== 使用toString方法后使用equals方法测试对象sb1与sb2的内容 =====");
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if (s1.equals(s2))	//如果要比较两个StringBuffer对象的内容是否相同，需要首先调用toString方法再进行比较
		{
			System.out.println("对象sb1与sb2的内容相同！");
		}
		else
		{
			System.out.println("对象sb1与sb2的内容不相同！");
		}
	}
}
