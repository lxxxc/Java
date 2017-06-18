/***********************************
 * 第12章 如何处理异常
 * 12.4 再次抛出异常
 * Sample12_11：声明异常抛出需要注意的问题
***********************************/

package Sample12_11;

import java.io.*;

public class Sample12_11 
{
	public void myFunction() throws EOFException	//若抛出捕获异常，则类型必须与方法可能抛出的捕获异常类型相同或者为其子类，类型的确定按引用类型进行
	{
//		IOException e = new EOFException();	//引用IOException为EOFExection的超类，抛出的捕获异常类型错误
		EOFException e = new EOFException();
		throw e;
	}
	
	public static void main(String[] args)
	{
		
	}
}
