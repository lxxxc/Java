/***********************************
 * 第14章 集合的使用
 * 14.10 自定义Sorted集合的类
 * Sample14_15：使用for-each循环遍历集合
***********************************/

package Sample14_15;

import java.util.*;

class MyEntryForEach
{
	int intMember;
	
	public MyEntryForEach(int intMember)
	{
		this.intMember = intMember;
	}
	
	public String toString()
	{
		return this.intMember + "";
	}
}

public class Sample14_15 
{
	public static void main(String[] args)
	{
		HashSet<MyEntryForEach> hs = new HashSet<MyEntryForEach>();
		
		hs.add(new MyEntryForEach(23));
		hs.add(new MyEntryForEach(24));
		hs.add(new MyEntryForEach(25));
		hs.add(new MyEntryForEach(27));
		hs.add(new MyEntryForEach(29));
		
		System.out.println("这里是HashSet操作前的内容：" + hs);
		
		for (Object o:hs)	//for-each方法遍历集合
		{
			MyEntryForEach temp = (MyEntryForEach)o;
			temp.intMember = 55;
		}
		System.out.println("这里是HashSet操作后的内容：" + hs);
	}
}
