/***********************************
 * 第14章 集合的使用
 * 14.8 集合
 * Sample14_09：equals与hashCode方法重写的作用
***********************************/

package Sample14_09;

import java.util.*;

class Student
{
	String name;
	
	public Student()
	{
		
	}
	
	public Student(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "[" + this.name + "]";
	}
	
	public boolean equals(Object o)	//如果两个元素的hashCode相同，则会调用equals方法比较是否是同一个对象
	{
		System.out.println("调用了" + this.name + "的equals方法，与" + ((Student)o).name + "比！");
		
		if (this == o)	return true;
		if (o == null)	return false;
		if (!(o instanceof Student))	return false;
		
		Student s = (Student)o;
		if (this.name.equals(s.name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()	//每次添加元素，都会调用hashCode方法
	{
		int hc = 7 * this.name.charAt(0);		
		System.out.println("调用了" + this.name + "的hashCode方法，哈希码为：" + hc + "！");
		return hc;
	}
}

public class Sample14_09 
{
	public static void main(String[] args)
	{
		HashSet<Student> hs = new HashSet<Student>();
		
		System.out.println("==============================");
		System.out.println("向空HashSet中添加名字为tom的元素");
		hs.add(new Student("tom"));
		System.out.println("此时HashSet里的元素为：" + hs);
		
		System.out.println("==============================");
		System.out.println("向空HashSet中添加名字为wjc的元素");
		hs.add(new Student("wjc"));
		System.out.println("此时HashSet里的元素为：" + hs);
		
		System.out.println("==============================");
		System.out.println("向空HashSet中添加名字为wyf的元素");
		hs.add(new Student("wyf"));
		System.out.println("此时HashSet里的元素为：" + hs);
		
		System.out.println("==============================");
		System.out.println("向空HashSet中再次添加名字为wjc的元素");
		hs.add(new Student("wjc"));
		System.out.println("此时HashSet里的元素为：" + hs);
		System.out.println("==============================");
	}
}
