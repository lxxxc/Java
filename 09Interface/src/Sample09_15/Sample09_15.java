/***********************************
 * 第9章 接口的世界
 * 9.8 instanceof的使用
 * Sample09_15：数组引用的使用
***********************************/

package Sample09_15;

class Father
{
}

class Son extends Father
{
}

public class Sample09_15 
{
	public static void main(String[] args)
	{
		int[] intArray = new int[5];
		if (intArray instanceof int[])
		{
			System.out.println("intArray是int[]类型的！");
		}
		
		Son[] sonArray = new Son[12];
		if (sonArray instanceof Son[])
		{
			System.out.println("sonArray是Son[]类型的！");
		}
		if (sonArray instanceof Father[])
		{
			System.out.println("sonArray是Father[]类型的！");
		}
	}
}
