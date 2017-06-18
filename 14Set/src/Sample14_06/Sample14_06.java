/***********************************
 * 第14章 集合的使用
 * 14.7 链接实现列表
 * Sample14_06：链接实现列表
***********************************/

package Sample14_06;

import java.util.*;

public class Sample14_06 
{
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<>();	//依赖双链表实现，适合插入/删除多，元素随机访问少的场合
		
		for	(int i = 0; i < 50; i++)
		{
			ll.add(String.valueOf(i));
		}
		for	(int i = 15; i < 30; i++)
		{
			ll.add(String.valueOf(30 - i + 15));
		}
		
		System.out.println("这里是LinkedList操作后的结果：");
		System.out.println(ll);
	}
}
