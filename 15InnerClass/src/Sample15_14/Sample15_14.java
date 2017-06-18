/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.9 �����ڲ���
 * Sample15_14�������ڲ������õ�����
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
		//���������ڲ��࣬�򻯴��룬���赥дһ������ʵ��Comparator�ӿ�Ȼ�󴴽�������Ϊ�Ƚ���
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
		
		System.out.println("�����Sorted���ǰ�����Ӵ�С���е�����" + tsl);
	}
}
