/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.8 ����
 * Sample14_09��equals��hashCode������д������
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
	
	public boolean equals(Object o)	//�������Ԫ�ص�hashCode��ͬ��������equals�����Ƚ��Ƿ���ͬһ������
	{
		System.out.println("������" + this.name + "��equals��������" + ((Student)o).name + "�ȣ�");
		
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
	
	public int hashCode()	//ÿ�����Ԫ�أ��������hashCode����
	{
		int hc = 7 * this.name.charAt(0);		
		System.out.println("������" + this.name + "��hashCode��������ϣ��Ϊ��" + hc + "��");
		return hc;
	}
}

public class Sample14_09 
{
	public static void main(String[] args)
	{
		HashSet<Student> hs = new HashSet<Student>();
		
		System.out.println("==============================");
		System.out.println("���HashSet���������Ϊtom��Ԫ��");
		hs.add(new Student("tom"));
		System.out.println("��ʱHashSet���Ԫ��Ϊ��" + hs);
		
		System.out.println("==============================");
		System.out.println("���HashSet���������Ϊwjc��Ԫ��");
		hs.add(new Student("wjc"));
		System.out.println("��ʱHashSet���Ԫ��Ϊ��" + hs);
		
		System.out.println("==============================");
		System.out.println("���HashSet���������Ϊwyf��Ԫ��");
		hs.add(new Student("wyf"));
		System.out.println("��ʱHashSet���Ԫ��Ϊ��" + hs);
		
		System.out.println("==============================");
		System.out.println("���HashSet���ٴ��������Ϊwjc��Ԫ��");
		hs.add(new Student("wjc"));
		System.out.println("��ʱHashSet���Ԫ��Ϊ��" + hs);
		System.out.println("==============================");
	}
}
