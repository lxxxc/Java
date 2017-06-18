/***********************************
 * 第9章 接口的世界
 * 9.8 instanceof的使用
 * Sample09_13：基本使用
***********************************/

package Sample09_13;

interface IFather
{
}

interface ISon extends IFather
{
}

class Father
{
}

class Son extends Father implements ISon
{
}

public class Sample09_13 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		
		if (s instanceof Son)	//s是Son类型的对象，可以看作Son类型 
		{
			System.out.println("s指向的对象可以看作Son类型！");
		}
		if (s instanceof Father)	//s是Son类型的对象，Son类继承自Father类，可以看作Father类型  
		{
			System.out.println("s指向的对象可以看作Father类型！");
		}
		if (s instanceof ISon)	//s实现了ISon接口，可以看作ISon类型 
		{
			System.out.println("s指向的对象可以看作ISon类型！");
		}
		if (s instanceof IFather)	//s实现了ISon接口，ISon接口继承自IFather接口，可以看作IFahter类型 
		{
			System.out.println("s指向的对象可以看作IFather类型！");
		}
	}
}
