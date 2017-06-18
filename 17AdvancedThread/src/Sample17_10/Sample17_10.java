/***********************************
 * 第17章 高级线程
 * 17.7 队列
 * Sample17_10：Queue接口介绍
***********************************/

package Sample17_10;

import java.util.*;

public class Sample17_10 
{
	public static void main(String[] args)
	{
		Queue<String> queue = new LinkedList<>();	//创建队列对象
		
		for(int i = 0; i < 10; i++)
		{
			queue.offer("" + i);
		}
		
		System.out.println("队列中的元素为：");
		Object o = queue.poll();
		while(o != null)
		{
			System.out.print("[" + o + "] ");
			o = queue.poll();
		}
		System.out.println();
	}
}
