/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.2 Object��
 * Sample14_02��equals����
***********************************/

package Sample14_02;

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
}
public class Sample14_02 
{
	public static void main(String[] args)
	{
		//����������ͬ�Ķ���
		Student s1 = new Student("jc", 21, 97001);
		Student s2 = new Student("jc", 21, 97001);
		
		//ʹ��equals�����ж����������Ƿ���ͬ
		//equals����ֱ�Ӽ̳���Object�࣬�൱�ڱȽ����������Ƿ�ָ��ͬһ��������˽��Ϊ����ͬ
		if (s1.equals(s2)) 
		{
			System.out.println("ѧ������s1��s2����ͬ�ģ�");
		}
		else 
		{
			System.out.println("ѧ������s1��s2�ǲ���ͬ�ģ�");
		}
	}
}
