/***********************************
 * 第15章 内部类应用
 * 15.11 内部接口
 * Sample15_15：定义在类中的内部接口
***********************************/

package Sample15_15;

class OuterClass
{
	public interface InnerInterface	//定义内部接口，无论是否使用static修饰，均是静态的
	{
		public void show();
	}
	
	public class InnerClass implements InnerInterface	//定义实现InnerInterface接口的内部类
	{
		@Override
		public void show()
		{
			System.out.println("这里是内部类中的方法，该内部类实现了私有内部接口InnerInterface！");
		}		
	}
	
	public InnerInterface getIn()	//定义获得该内部类对象的方法
	{
		return new InnerClass();
	}
}

class Common implements OuterClass.InnerInterface	//定义实现内部接口的普通类，因为内部接口是静态的，所以可以直接使用，无需依赖所在外部类的对象
{
	public void show()
	{
		System.out.println("这里是普通类中的方法，该普通类实现了私有内部接口InnerInterface！");
	}
}

public class Sample15_15 
{
	public static void main(String[] args)
	{
		OuterClass oc = new OuterClass();
		
		OuterClass.InnerClass ic = oc.new InnerClass();	//从外部类外创建内部类对象
		ic.show();
		
		OuterClass.InnerInterface ii = null;
		ii = oc.getIn();	//获得实现内部接口的内部类对象
		ii.show();
		
		Common c = new Common();	//创建普通类对象
		c.show();
	}
}
