/***********************************
 * 第14章 集合的使用
 * 14.11 映射
 * Sample14_18：LinkedHashMap类
***********************************/

package Sample14_18;

import java.util.*;

public class Sample14_18
{
	public static void main(String[] args)
	{
		//双链表方式实现，Ordered类型，键按照插入集合的顺序存储
		//插入/删除效率比HashMap略差，遍历效率比HashMap效率略高
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();																		
		
		lhm.put(Integer.valueOf(97005), "Tom");
		lhm.put(Integer.valueOf(97003), "Jerry");
		lhm.put(Integer.valueOf(97004), "Lucy");
		System.out.println("这里是LinkedHashMap操作前的内容：" + lhm);
		
		System.out.print("判断LinkedHashMap对象中是否存在内容为jerry的值：");
		boolean b = lhm.containsValue("Jerry");
		System.out.println((b) ? "存在" : "不存在");
		
		lhm.put(Integer.valueOf(97003), "David");
		System.out.println("这里是LinkedHashMap操作后的内容：" + lhm);
	}
}

