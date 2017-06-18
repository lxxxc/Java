/***********************************
 * 第14章 集合的使用
 * 14.13 映射的遍历
 * Sample14_20：映射的遍历
***********************************/

package Sample14_20;

import java.util.*;

public class Sample14_20 
{
	public static void main(String[] args)
	{
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(Integer.valueOf(10001), "Tom");
		hm.put(Integer.valueOf(10003), "Jerry");
		hm.put(Integer.valueOf(10002), "John");
		hm.put(Integer.valueOf(10004), "Lili");
		
		Set<Integer> keySet = hm.keySet();	//获取Map的键集合
		Iterator<Integer> ii = keySet.iterator();	//获取键集合的迭代器
		System.out.println("==========通过键集合对Map进行遍历==========");	
		while(ii.hasNext())
		{
			Object okey = ii.next();	//获取下一个键对象
			Integer i = (Integer)okey;		
			Object ovalue = hm.get(okey);	//通过键获取对应的值
			String s = (String)ovalue;
			System.out.println("键：" + i.intValue() + "，值：" + s + "，值长度：" + s.length() + "！");
		}
		
		Collection<String> cvalue = hm.values();	//获取Map的值集合
		System.out.println("==========用for-each循环对所有值进行遍历==========");	
		for (Object otemp:cvalue)	//使用for-each循环遍历集合
		{
			String s = (String)otemp;
			System.out.println("值：" + s + "，值长度：" + s.length() + "！");
		}
	}
}
