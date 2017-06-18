/***********************************
 * 第12章 如何处理异常
 * 12.5 方法重写对抛出异常的限制
 * Sample12_13：方法重写对抛出异常的限制
***********************************/

package Sample12_13;

import java.io.*;

class Father
{
	public void myFunction() throws Exception
//	public void myFunction() //Son中重写myFunction方法，但抛出了比Father类更多的异常，编译出错
	{
		System.out.println("这里是父类方法，该方法没有异常抛出！");
	}
}

class Son extends Father
{
	public void myFunction() throws InterruptedException	//重写后的方法一定不能声明抛出新的捕获异常或比原方法范畴更广的捕获异常
	{
		System.out.println("这里是子类方法，该方法抛出InterruptedException异常！");
	}
}

public class Sample12_13 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		
		try
		{
			s.myFunction();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
