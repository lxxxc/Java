/***********************************
 * 第14章 集合的使用
 * 14.14 栈的实现
 * Sample14_21：Stack类
***********************************/

package Sample14_21;

import java.util.*;

public class Sample14_21 
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 50; i++)
		{
			al.add(Integer.valueOf(i));
		}
		System.out.println("ArrayList中元素的初始顺序：" + al);
		
		for (int i = 0; i < 50; i++)
		{
			s.push(al.get(i));	//将ArrayList中的元素依次压栈
		}
		for (int i = 0; i < 50; i++)
		{
			al.set(i, s.pop());	//将栈中的元素依次出栈，实现了元素的倒序排列
		}
		System.out.println("使用过栈后，ArrayList中元素的顺序：" + al);
	}
}
