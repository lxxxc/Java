/***********************************
 * 第13章 字符串应用
 * 13.5 StringBuffer类
 * Sample13_09：编写方法链
***********************************/

package Sample13_09;

class MyClass
{
	public MyClass a()
	{
		System.out.println("恭喜你，成功使用了方法链，现在调用到了方法a！");
		return this;
	}
	
	public MyClass b()
	{
		System.out.println("恭喜你，成功使用了方法链，现在调用到了方法b！");
		return this;
	}
	
	public void c()
	{
		System.out.println("恭喜你，成功使用了方法链，现在调用到了方法c！");
	}
}

public class Sample13_09 
{
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();
		mc.a().b().c();	//非最后的方法a、b返回类型必须为对象引用类型，最后的方法任意
	}
}
