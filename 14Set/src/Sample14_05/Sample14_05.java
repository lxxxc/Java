/***********************************
 * 第14章 集合的使用
 * 14.6 向量
 * Sample14_05：向量
***********************************/

package Sample14_05;

import java.util.*;

public class Sample14_05 
{
	public static void main(String[] args)
	{	
		Vector<String> v = new Vector<>();	//与ArrayList基本相同，但是Vector是同步的，同一时刻只能有一个线程访问
		
		for	(int i = 0; i < 50; i++)
		{
			v.add(String.valueOf(i));
		}
		for (int i = 50; i < 100; i++)
		{
			v.add(String.valueOf(99 - i + 50));
		}
		
		System.out.println("这里是Vector操作后的结果：");
		System.out.println(v);
	}
}
