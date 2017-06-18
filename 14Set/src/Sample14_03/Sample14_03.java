/***********************************
 * 第14章 集合的使用
 * 14.2 Object类
 * Sample14_03：equals方法与hashCode方法的重写
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
	
	public boolean equals(Object o)	//重写equals方法，返回类型必须为public，入口参数必须为Object类型
	{
		if (this == o)	return true;	//如果两个引用指向同一个对象，直接返回true
		if (o == null)	return false;	//如果传递进来的引用为null，直接返回false
		if (!(o instanceof Student))	return false;	//如果传递进来的引用不能通过自己类型的instanceof测试，直接返回false
		
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
	
	public int hashCode()	//重写equals方法，则必须重写hashCode方法
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
			System.out.println("学生对象s1与s2是等价的，其哈希码分别为：");
			System.out.print("s1.hashCode() = " + s1.hashCode() + ", ");
			System.out.println("s2.hashCode() = " + s2.hashCode());
		}
		else
		{
			System.out.println("学生对象s1与s2是不等价的");
		}
	}
}
