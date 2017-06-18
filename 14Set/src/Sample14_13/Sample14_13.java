/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.10 �Զ���Sorted���ϵ���
 * Sample14_13������SortedSet���������
***********************************/

package Sample14_13;

import java.util.*;

class Student implements Comparable<Object>	//ʵ��Comparable�ӿ�
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
	
	public int compareTo(Object o)	//��Ϊ���Ĭ�����򷽷�
	{
		Student s = (Student)o;
		return this.classNum - s.classNum;
	}
}

class AgeCompare implements Comparator<Object>	//�Ƚ���
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
		TreeSet<Student> ts1 = new TreeSet<>();	//û��ָ���Ƚ������࣬����compareTo��������
		TreeSet<Student> ts2 = new TreeSet<>(new AgeCompare());	//ָ���Ƚ��������ձȽ����е�compare��������
		
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
		System.out.println("�����SortedSet�ǰ���Ž��е�����" + ts1);
		
		System.out.println("==============================");
		System.out.println("�����SortedSet�ǰ�������е�����" + ts2);
	}
}
