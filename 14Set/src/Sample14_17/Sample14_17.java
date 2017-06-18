/***********************************
 * 第14章 集合的使用
 * 14.11 映射
 * Sample14_17：Hashtable类
***********************************/

package Sample14_17;

import java.util.*;

public class Sample14_17 
{
	public static void main(String[] args)
	{
		Hashtable<Integer, String> ht = new Hashtable<>();	//对元素的操作为同步方法，不允许null键存在
		
		ht.put(Integer.valueOf(97005), "Tom");
		ht.put(Integer.valueOf(97003), "Jerry");
		ht.put(Integer.valueOf(97004), "Lucy");
		ht.put(Integer.valueOf(97001), "Smith");
		ht.put(Integer.valueOf(97002), "Jc");
		System.out.println("这里是Hashtable操作前的内容：" + ht);
		
		System.out.print("判断Hashtable对象中是否存在键为97001的值：");
		boolean b = ht.containsKey(97001);
		System.out.println((b) ? "存在" : "不存在");
		
		ht.put(Integer.valueOf(97002), "David");
		System.out.println("这里是Hashtable操作后的内容：" + ht);
		
		Object o = ht.get(97003);
		String s = (String)o;
		System.out.println("键97003对应的值为：" + s + "，长度为：" + s.length() + "！");
	}
}
