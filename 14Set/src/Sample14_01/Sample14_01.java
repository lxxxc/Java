/***********************************
 * 第14章 集合的使用
 * 14.2 Object类
 * Sample14_01：toString方法的重写
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
	
	public String toString()	//重写toString方法
	{
		return "tom.jc.Student[name = " + this.name + ", age = " + this.age + ", classNum = " + this.classNum + "]";
	}
}

public class Sample14_01 
{
	public static void main(String[] args)
	{
		Object tom = new Student("jc", 21, 97001);	//多态
		
		//打印对象，如果引用不为空，则首先调用toString方法获取字符串再打印，因此两次打印的结果相同
		System.out.println(tom.toString());	
		System.out.println(tom);
	}
}
