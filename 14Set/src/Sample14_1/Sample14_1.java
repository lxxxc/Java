//重写继承自Object类的toString方法
package Sample14_1;

class Student
{
	String	name;
	int		age;
	int		classNum;
	
	//无参构造器
	public Student()
	{
	}
	
	//有参构造器
	public Student(String name, int age, int classNum)
	{
		this.name		= name;
		this.age		= age;
		this.classNum	= classNum;
	}
	
	//重写toString方法
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
		
		//打印对象，如果引用不为空，则首先调用toString方法获取字符串再打印，因此两次打印的结果相同
		System.out.println(tom.toString());	
		System.out.println(tom);
	}
}
