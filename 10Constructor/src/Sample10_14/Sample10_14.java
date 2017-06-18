/***********************************
 * 第10章 构造器应用
 * 10.9 调用兄弟构造器
 * Sample10_14：注意事项
***********************************/

package Sample10_14;

class Animal
{
	Animal()
	{
		System.out.println("我是Animal类的构造器！");
	}
	
	public void show()
	{
//		this();	//构造器不能被方法调用
	}
}

public class Sample10_14 
{
	public static void main(String[] args)
	{
		new Animal();
	}
}
