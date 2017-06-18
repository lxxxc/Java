/***********************************
 * 第14章 集合的使用
 * 14.10 自定义Sorted集合的类
 * Sample14_12：自定义Sorted集合的类
***********************************/

package Sample14_12;

import java.util.*;

class MyEntry implements Comparable<Object>	//将自己开发的类对象作为元素，此类必须实现Comparable接口
{
	int size;
	
	public MyEntry()
	{
		
	}
	
	public MyEntry(int size)
	{
		this.size = size;
	}
	
	public String toString()
	{
		return "[size=" + this.size + "]";
	}
	
	public int compareTo(Object o)
	{
		MyEntry me = (MyEntry)o;
		System.out.println(this.toString() + "与" + me.toString() + "compareTo比！");
		return this.size - me.size;
	}
	
	public boolean equals(Object o)
	{
		MyEntry me = (MyEntry)o;
		System.out.println(this.toString() + "与" + me.toString() + "equals比！");
		return (me.size == this.size);
	}
	
	public int hashCode()
	{
		System.out.println(this.toString() + "hashCode！");
		return 12;
	}
}

public class Sample14_12 
{
	public static void main(String[] args)
	{
		//TreeSet不使用哈希存储策略，因此不调用hashCode方法
		//实现了compareTo方法，可以替代equals方法，因此插入时也不调用equals方法
		//使用红-黑树来实现二叉平衡树
		TreeSet<MyEntry> ts = new TreeSet<MyEntry>();	
														
		System.out.println("===============插入21===============");
		ts.add(new MyEntry(21));
		
		System.out.println("===============插入19===============");
		ts.add(new MyEntry(19));
		
		System.out.println("===============插入18===============");
		ts.add(new MyEntry(18));
		
		System.out.println("===============插入28===============");
		ts.add(new MyEntry(28));
		
		System.out.println("===============再次插入21===============");
		ts.add(new MyEntry(21));
		
		System.out.println("这里是TreeSet操作后的结果" + ts);
	}
}
