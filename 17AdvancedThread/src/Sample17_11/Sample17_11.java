/***********************************
 * ��17�� �߼��߳�
 * 17.7 ����
 * Sample17_11��PriorityQueue���֪ʶ��ʹ��
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
	
	public int compareTo(Object o)	//ʵ�ּ̳���Comparable�ӿڵ�compareTo����
	{
		return this.priority - ((MyElement)o).priority;	//�������ȼ���С��������
	}

	public String toString() 
	{
		return "[���ȼ�Ϊ��" + priority + "������Ϊ��" + content + "��]";
	}
}

class MyComparator implements Comparator<Object>	//�Զ���Ƚ���
{
	public int compare(Object o1, Object o2)
	{
		return ((MyElement)o2).priority - ((MyElement)o1).priority;	//�������ȼ��Ӵ�С����
	}
}

public class Sample17_11 
{
	public static void scanQueue(Queue<MyElement> queue)	//����ָ����������Ԫ�صķ���
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
			ss.add(new MyElement((int)Math.round(Math.random() * 100), "��" + i + "��"));
		}
		
		Queue<MyElement> pq1 = new PriorityQueue<>(ss);
		System.out.println("==========�Ե�һ�����ȼ����з���==========");
		scanQueue(pq1);
		
		Queue<MyElement> pq2 = new PriorityQueue<>(10, new MyComparator());
		for(int i = 0; i < 10; i++)
		{
			pq2.offer(new MyElement((int)Math.round(Math.random() * 100), "��" + i + "��"));
		}
		System.out.println("==========�Եڶ������ȼ����з���==========");
		scanQueue(pq2);
	}
}
