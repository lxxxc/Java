/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.2 Object��
 * Sample14_01��toString��������д
***********************************/
package Sample14_01;

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
	
	public String toString()	//��дtoString����
	{
		return "tom.jc.Student[name = " + this.name + ", age = " + this.age + ", classNum = " + this.classNum + "]";
	}
}

public class Sample14_01 
{
	public static void main(String[] args)
	{
		Object tom = new Student("jc", 21, 97001);	//��̬
		
		//��ӡ����������ò�Ϊ�գ������ȵ���toString������ȡ�ַ����ٴ�ӡ��������δ�ӡ�Ľ����ͬ
		System.out.println(tom.toString());	
		System.out.println(tom);
	}
}
