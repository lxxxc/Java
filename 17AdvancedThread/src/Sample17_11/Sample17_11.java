/***********************************
 * 第17章 高级线程
 * 17.7 队列
 * Sample17_11：PriorityQueue类的知识与使用
***********************************/

package Sample17_11;

import java.util.*;

class MyElement implements Comparable<Object>
{
	int priority;
	String content;
	
	public MyElement(int priority, String content)
	{
		this.priority = priority;
		this.content = content;
	}
	
	public int compareTo(Object o)	//实现继承至Comparable接口的compareTo方法
	{
		return this.priority - ((MyElement)o).priority;	//按照优先级从小到大排序
	}

	public String toString() 
	{
		return "[优先级为：" + priority + "，内容为“" + content + "”]";
	}
}

class MyComparator implements Comparator<Object>	//自定义比较器
{
	public int compare(Object o1, Object o2)
	{
		return ((MyElement)o2).priority - ((MyElement)o1).priority;	//按照优先级从大到小排序
	}
}

public class Sample17_11 
{
	public static void scanQueue(Queue<MyElement> queue)	//访问指定队列所有元素的方法
	{
		Object o = queue.poll();
		while(o != null)
		{
			System.out.print(o);
			o = queue.poll();
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		SortedSet<MyElement> ss = new TreeSet<>();
		for(int i = 0; i < 10; i++)
		{
			ss.add(new MyElement((int)Math.round(Math.random() * 100), "第" + i + "个"));
		}
		
		Queue<MyElement> pq1 = new PriorityQueue<>(ss);
		System.out.println("==========对第一个优先级队列访问==========");
		scanQueue(pq1);
		
		Queue<MyElement> pq2 = new PriorityQueue<>(10, new MyComparator());
		for(int i = 0; i < 10; i++)
		{
			pq2.offer(new MyElement((int)Math.round(Math.random() * 100), "第" + i + "个"));
		}
		System.out.println("==========对第二个优先级队列访问==========");
		scanQueue(pq2);
	}
}
