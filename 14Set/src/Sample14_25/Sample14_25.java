/***********************************
 * 第14章 集合的使用
 * 14.15 集合的元素的常用操作
 * Sample14_25：搜索特定元素
***********************************/

package Sample14_25;

import java.util.*;

public class Sample14_25 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 20; i++)
		{
			al.add(Integer.valueOf((int)(Math.random() * 100)));
		}
		Collections.sort(al);	//搜索之前需要对列表进行排序
		int index = Collections.binarySearch(al, Integer.valueOf(20));
		if (index < 0)
		{
			System.out.println("该列表中没有您需要找的整数，请您再次运行试试！");
		}
		else
		{
			System.out.println("恭喜你，找到了您需要找的元素，其索引是：" + index);
			
			System.out.print("{");
			for (int i = 0; i < al.size(); i++)
			{
				if (i == index)
				{
					System.out.print("[" + al.get(i) + "], ");
				}
				else
				{
					System.out.print(al.get(i) + ", ");
				}
			}
			System.out.println("}");
		}
	}
}
