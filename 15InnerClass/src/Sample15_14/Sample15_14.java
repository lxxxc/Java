/***********************************
 * 第15章 内部类应用
 * 15.9 匿名内部类
 * Sample15_14：匿名内部类作用的体现
***********************************/

package Sample15_14;

import java.util.*;

class Student implements Comparable
{
	String name;
	int age;
	int classNum;
	
	public Student(){}

	public Student(String name, int age, int classNum) 
	{
		this.name = name;
		this.age = age;
		this.classNum = classNum;
	}

	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", age=" + age + ", classNum=" + classNum + "]";
	}

	@Override
	public int compareTo(Object o) 
	{
		Student s = (Student)o;
		return this.classNum - s.classNum;
	};
}

public class Sample15_14 
{
	public static void main(String[] args)
	{
		//利用匿名内部类，简化代码，无需单写一个类来实现Comparator接口然后创建对象作为比较器
		TreeSet<Student> tsl = new TreeSet<>(new Comparator<Object>()
				{
			public int compare(Object o1, Object o2)
			{
				Student s1 = (Student)o1;
				Student s2 = (Student)o2;
				return s2.age - s1.age;
			}
				});
		
		tsl.add(new Student("mm", 21, 97005));
		tsl.add(new Student("jerry", 19, 97003));
		tsl.add(new Student("lucy", 18, 97004));
		tsl.add(new Student("smith", 28, 97001));
		tsl.add(new Student("jc", 23, 97002));
		
		System.out.println("这里的Sorted集是按年龄从大到小进行的排序：" + tsl);
	}
}
