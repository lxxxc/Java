/***********************************
 * 第14章 集合的使用
 * 14.10 自定义Sorted集合的类
 * Sample14_13：定制SortedSet的排序规则
***********************************/

package Sample14_13;

import java.util.*;

class Student implements Comparable<Object>	//实现Comparable接口
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
	
	public int compareTo(Object o)	//作为类的默认排序方法
	{
		Student s = (Student)o;
		return this.classNum - s.classNum;
	}
}

class AgeCompare implements Comparator<Object>	//比较器
{
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		return s1.age - s2.age;
	}
}

public class Sample14_13 
{
	public static void main(String[] args)
	{
		TreeSet<Student> ts1 = new TreeSet<>();	//没有指定比较器的类，按照compareTo方法排序
		TreeSet<Student> ts2 = new TreeSet<>(new AgeCompare());	//指定比较器，按照比较器中的compare方法排序
		
		ts1.add(new Student("tom", 21, 97005));
		ts1.add(new Student("jerry", 19, 97003));
		ts1.add(new Student("lucy", 18, 97004));
		ts1.add(new Student("smith", 28, 97001));
		ts1.add(new Student("jc", 23, 97002));
		
		ts2.add(new Student("tom", 21, 97005));
		ts2.add(new Student("jerry", 19, 97003));
		ts2.add(new Student("lucy", 18, 97004));
		ts2.add(new Student("smith", 28, 97001));
		ts2.add(new Student("jc", 23, 97002));
		
		System.out.println("==============================");
		System.out.println("这里的SortedSet是按班号进行的排序：" + ts1);
		
		System.out.println("==============================");
		System.out.println("这里的SortedSet是按年龄进行的排序：" + ts2);
	}
}
