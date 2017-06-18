/***********************************
 * 第14章 集合的使用
 * 14.8 集合
 * Sample14_08：HashSet类
***********************************/

package Sample14_08;

import java.util.*;

public class Sample14_08 
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();	//不允许有重复的元素，存储的元素没有顺序
		
		hs.add(String.valueOf(5));
		hs.add(String.valueOf(1));
		hs.add(String.valueOf(3));
		hs.add(String.valueOf(2));
		hs.add(String.valueOf(4));
		
		hs.remove(String.valueOf(5));
		hs.add(String.valueOf(1));	//相同的元素只能有一个，因此元素1没有添加进去
		hs.add(null);	//可以像HashSet中添加null，但只能添加一次
		
		System.out.println("这里是HashSet操作后的结果：" + hs);
	}
}
