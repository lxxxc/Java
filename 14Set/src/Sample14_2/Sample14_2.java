//重写继承自Object类的equals方法
package Sample14_2;

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
}
public class Sample14_2 
{
	public static void main(String[] args)
	{
		//创建两个相同的对象
		Student s1 = new Student("jc", 21, 97001);
		Student s2 = new Student("jc", 21, 97001);
		
		//使用equals方法判断两个对象是否相同
		//equals方法直接继承自Object类，相当于比较两个引用是否指向同一个对象，因此结果为不相同
		if (s1.equals(s2)) 
		{
			System.out.println("学生对象s1与s2是相同的！");
		}
		else 
		{
			System.out.println("学生对象s1与s2是不相同的！");
		}
	}
}
