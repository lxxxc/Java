/***********************************
 * 第13章 字符串应用
 * 13.6 StringBuilder类
 * Sample13_11：StringBuilder类
***********************************/

package Sample13_11;

public class Sample13_11 
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Java7.0");
		System.out.println("操作之前对象sb的内容为：" + sb);
		
		sb.append("核心技术大全").insert(4, "SE").delete(9, 15).reverse();
		System.out.println("一系列操作之后对象sb的内容为：" + sb);
	}
}
