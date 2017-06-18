/***********************************
 * 第14章 集合的使用
 * 14.10 自定义Sorted集合的类
 * Sample14_14：集合的遍历
***********************************/

package Sample14_14;

import java.util.*;

class Student
{
	String name;
	int age;
	int classNum;
	
	public Student()
	{
		
	}
	
	public Student(String name, int age, int classNum)
	{
		this.name = name;
		this.age = age;
		this.classNum = classNum;
	}
	
	public String toString()
	{
		return "\nwyf.jc.Student[name=" + this.name + ",age=" + this.age + ",classNum=" + this.classNum + "]\n";
	}
}

public class Sample14_14 
{
	public static void main(String[] args)
	{
		HashSet<Student> hs = new HashSet<Student>();
		
		hs.add(new Student("tom", 21, 97005));
		hs.add(new Student("jerry", 19, 97003));
		hs.add(new Student("lucy", 18, 97004));
		
		System.out.println("这里是HashSet操作前的内容：" + hs);
		
		Iterator it = hs.iterator();	//获取HashSet的迭代器，迭代时元素的顺序由集合的性质决定
		while (it.hasNext())	//测试是否还有没遍历的元素
		{
			Student temp = (Student)it.next();	//需要强制类型转换
			temp.classNum = 2003001;
		}
		
		System.out.println("这里是HashSet操作后的内容：" + hs);
	}
}
