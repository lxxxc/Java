/***********************************
 * 第14章 集合的使用
 * 14.8 集合
 * Sample14_10：LinkedHashSet类的使用
***********************************/

package Sample14_10;

import java.util.*;

public class Sample14_10 
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();	//不允许有重复的元素，存储的元素有固定顺序，与元素插入的顺序一致
		
		lhs.add(String.valueOf(5));
		lhs.add(String.valueOf(1));
		lhs.add(String.valueOf(3));
		lhs.add(String.valueOf(2));
		lhs.add(String.valueOf(4));	
		lhs.remove(String.valueOf(5));
		lhs.add(null);	
		
		System.out.println("这里是HashSet操作后的结果：" + lhs);
	}
}

