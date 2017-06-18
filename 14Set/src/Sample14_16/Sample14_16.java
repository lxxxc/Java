/***********************************
 * 第14章 集合的使用
 * 14.11 映射
 * Sample14_16：HashMap类
***********************************/

package Sample14_16;

import java.util.*;

public class Sample14_16 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(Integer.valueOf(97005), "Tom");
		hm.put(Integer.valueOf(97003), "Jerry");
		hm.put(Integer.valueOf(97004), "Lucy");
		hm.put(Integer.valueOf(97001), "Smith");
		hm.put(Integer.valueOf(97002), "Jc");	
		System.out.println("这里是HashMap操作前的内容：" + hm);
		
		hm.remove(Integer.valueOf(97001));	//删除键为97001的值，解除映射
		hm.put(Integer.valueOf(97002), "David");	//替换键97002的值
		System.out.println("这里是HashMap操作后的内容：" + hm);
		
		Object o = hm.get(97003);	//取出指定键的值
		String s = (String)o;
		System.out.println("键97003对应的值为：" + s + "，长度为：" + s.length() + "！");
	}
}
