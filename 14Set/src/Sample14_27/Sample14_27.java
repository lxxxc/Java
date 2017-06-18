/***********************************
 * 第14章 集合的使用
 * 14.15 集合的元素的常用操作
 * Sample14_27：其它的简单操作
***********************************/

package Sample14_27;

import java.util.*;

public class Sample14_27 
{
	public static void main(String[] args)
	{
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		List l3 = new ArrayList();
		
		for (int i = 0; i < 12; i++)
		{
			l1.add(Integer.valueOf(i));
			l2.add(Integer.valueOf(i + 50));
		}
		
		//复制列表
		System.out.println("==================== copy ====================");
		System.out.println("方法使用前元素为：" + l1);
		Collections.copy(l1, l2);
		System.out.println("方法使用后元素为：" + l1);
		
		//比较集合中是否有相同的元素
		System.out.println("==================== disjoint ====================");
		if (!Collections.disjoint(l1, l2))
			System.out.println("列表l1与l2中有相同的元素！");
		
		//将元素添加到集合
		System.out.println("==================== addAll ====================");
		System.out.println("方法使用前元素为：" + l1);
		Collections.addAll(l1, new String[]{"tom", "jc"});
		System.out.println("方法使用后元素为：" + l1);
		
		//将集合中的元素转变为指定元素
		System.out.println("==================== fill ====================");
		System.out.println("方法使用前元素为：" + l2);
		Collections.fill(l2, "0");
		System.out.println("方法使用后元素为：" + l2);
		
		//获取集合中与指定元素相同的元素个数
		System.out.println("==================== frequency ====================");
		int i = Collections.frequency(l3, "0");
		System.out.println("l3中有元素'0'" + i + "个！");
		
		//将集合中的元素替换为目标元素
		System.out.println("==================== replaceAll ====================");
		System.out.println("方法使用前元素为：" + l2);
		Collections.replaceAll(l2, "0", "3");
		System.out.println("方法使用后元素为：" + l2);
		
		//反转列表中的元素
		System.out.println("==================== reverse ====================");
		System.out.println("方法使用前元素为：" + l1);
		Collections.reverse(l1);
		System.out.println("方法使用后元素为：" + l1);
		
		//将列表中的元素循环移动
		System.out.println("==================== rotate ====================");
		System.out.println("方法使用前元素为：" + l1);
		Collections.rotate(l1, 6);
		System.out.println("方法使用后元素为：" + l1);
		
		//交换列表中的两个元素
		System.out.println("==================== swap ====================");
		System.out.println("方法使用前元素为：" + l1);
		Collections.swap(l1, 6, 10);
		System.out.println("方法使用后元素为：" + l1);
	}
}
