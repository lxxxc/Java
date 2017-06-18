/***********************************
 * 第14章 集合的使用
 * 14.14 栈的实现
 * Sample14_22：Deque接口
***********************************/

package Sample14_22;

import java.util.*;

public class Sample14_22 
{
	public static void main(String[] args)
	{
		Deque<String> stack = new ArrayDeque<>();
		String[] sa = new String[]{"1", "a", "2", "b", "3", "c", "4", "d"};
		System.out.print("数组中元素的初始顺序：");
		for (String temps:sa)	//使用for-each循环遍历集合
		{
			System.out.print(temps + ", ");
			stack.push(temps);			
		}
		System.out.print("\n数组中元素倒序后的结果为：");
		while (stack.size() != 0)
		{
			System.out.print(stack.pop() + ", ");
		}
		System.out.println("");
	}
}
