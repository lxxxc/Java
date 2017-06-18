/***********************************
 * 第14章 集合的使用
 * 14.15 集合的元素的常用操作
 * Sample14_24：元素排序
***********************************/

package Sample14_24;

import java.util.*;

class MyComparator implements Comparator<Object>	//继承自Comparator接口，必须实现compare方法
{
	public int compare(Object o1, Object o2)	
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.intValue() - i1.intValue();	//按照元素的降序排列
	}
}

public class Sample14_24 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 50; i++)
		{
			al.add(Integer.valueOf((int)(Math.random() * 100)));
		}
		System.out.println("这里是排序之前ArrayList中的元素：");
		System.out.println(al);
		
		Collections.sort(al);	//默认按照元素的升序排序
		System.out.println("这里是排序之后ArrayList中的元素：");
		System.out.println(al);
		
		Collections.sort(al, new MyComparator());	//使用自定义对元素进行排序
		System.out.println("这里是使用比较器排序之后ArrayList中的元素：");
		System.out.println(al);
	}
}
