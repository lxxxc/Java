/***********************************
 * 第14章 集合的使用
 * 14.12 SortedMap接口与TreeMap类
 * Sample14_19：SortedMap接口与TreeMap类
***********************************/

package Sample14_19;

import java.util.*;

class MyComparator implements Comparator<Object>	//自定义比较器
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.intValue() - i1.intValue();
	}
}

public class Sample14_19 
{
	public static void main(String[] args)
	{
		//SortedMap接口接口的实现，按键的天然顺序排序
		TreeMap<Integer, String> tmp = new TreeMap<>();
		tmp.put(Integer.valueOf(97004), "Lucy");
		tmp.put(Integer.valueOf(97001), "Smith");
		tmp.put(Integer.valueOf(97002), "Jc");
		
		TreeMap<Integer, String> tmc = new TreeMap<>(new MyComparator());
		tmc.put(Integer.valueOf(97004), "Lucy");
		tmc.put(Integer.valueOf(97001), "Smith");
		tmc.put(Integer.valueOf(97002), "Jc");
		
		System.out.println("==============================");
		System.out.println("普通的TreeMap中的内容：" + tmp);
		
		System.out.println("==============================");
		System.out.println("指定比较器的TreeMap中的内容：" + tmc);
		
		tmp.remove(Integer.valueOf(97001));
		tmp.put(Integer.valueOf(97002), "David");
		System.out.println("==============================");
		System.out.println("处理后普通的TreeMap中的内容：" + tmp);
		
	}
}
