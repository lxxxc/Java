/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.2 Object��
 * Sample14_03��equals������hashCode��������д
***********************************/

package Sample14_03;

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
	
	public boolean equals(Object o)	//��дequals�������������ͱ���Ϊpublic����ڲ�������ΪObject����
	{
		if (this == o)	return true;	//�����������ָ��ͬһ������ֱ�ӷ���true
		if (o == null)	return false;	//������ݽ���������Ϊnull��ֱ�ӷ���false
		if (!(o instanceof Student))	return false;	//������ݽ��������ò���ͨ���Լ����͵�instanceof���ԣ�ֱ�ӷ���false
		
		Student s = (Student) o;
		
		if (this.name.equals(s.name) && this.age == s.age && this.classNum == s.classNum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()	//��дequals�������������дhashCode����
	{
		return 7 * this.name.hashCode() + 13 * Integer.valueOf(this.age).hashCode()
				+ 17 * Integer.valueOf(this.classNum).hashCode();
	}
}

public class Sample14_03 
{
	public static void main(String[] args)
	{
		Student s1 = new Student("jc", 21, 97001);
		Student s2 = new Student("jc", 21, 97001);
		
		if (s1.equals(s2))
		{
			System.out.println("ѧ������s1��s2�ǵȼ۵ģ����ϣ��ֱ�Ϊ��");
			System.out.print("s1.hashCode() = " + s1.hashCode() + ", ");
			System.out.println("s2.hashCode() = " + s2.hashCode());
		}
		else
		{
			System.out.println("ѧ������s1��s2�ǲ��ȼ۵�");
		}
	}
}
