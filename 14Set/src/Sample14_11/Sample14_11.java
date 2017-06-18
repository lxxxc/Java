/***********************************
 * 第14章 集合的使用
 * 14.9 SortedSet接口与TreeSet类
 * Sample14_11：SortedSet接口与TreeSet类
***********************************/

package Sample14_11;

import java.util.*;

public class Sample14_11 
{
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();	//元素按天然顺序自动排序	
		
		ts.add(String.valueOf(5));
		ts.add(String.valueOf(6));
		ts.add(String.valueOf(3));
		ts.add(String.valueOf(2));
		ts.add(String.valueOf(4));	
		ts.remove(String.valueOf(5));
		ts.add(String.valueOf(1));
		
		System.out.println("这里是TreeSet操作后的结果：" + ts);
	}
}


