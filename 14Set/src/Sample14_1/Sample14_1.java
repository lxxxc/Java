//��д�̳���Object���toString����
package Sample14_1;

class Student
{
	String	name;
	int		age;
	int		classNum;
	
	//�޲ι�����
	public Student()
	{
	}
	
	//�вι�����
	public Student(String name, int age, int classNum)
	{
		this.name		= name;
		this.age		= age;
		this.classNum	= classNum;
	}
	
	//��дtoString����
	public String toString()
	{
		return "tom.jc.Student[name = " + this.name + ", age = " + this.age 
				+ ", classNum = " + this.classNum + "]";
	}
}

public class Sample14_1 
{
	public static void main(String[] args)
	{
		Object tom = new Student("jc", 21, 97001);
		
		//��ӡ����������ò�Ϊ�գ������ȵ���toString������ȡ�ַ����ٴ�ӡ��������δ�ӡ�Ľ����ͬ
		System.out.println(tom.toString());	
		System.out.println(tom);
	}
}
