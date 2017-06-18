/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.10 �Զ���Sorted���ϵ���
 * Sample14_14�����ϵı���
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
		
		System.out.println("������HashSet����ǰ�����ݣ�" + hs);
		
		Iterator it = hs.iterator();	//��ȡHashSet�ĵ�����������ʱԪ�ص�˳���ɼ��ϵ����ʾ���
		while (it.hasNext())	//�����Ƿ���û������Ԫ��
		{
			Student temp = (Student)it.next();	//��Ҫǿ������ת��
			temp.classNum = 2003001;
		}
		
		System.out.println("������HashSet����������ݣ�" + hs);
	}
}
