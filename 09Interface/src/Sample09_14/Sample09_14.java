/***********************************
 * 第9章 接口的世界
 * 9.8 instanceof的使用
 * Sample09_14：null引用的使用
***********************************/

package Sample09_14;

public class Sample09_14 
{
	public static void main(String[] args)
	{
		String s = null;	
		
		if (s instanceof String)	//null引用测试总是返回false 
		{
			System.out.println("恭喜你，测试通过！");
		}
		else 
		{
			System.out.println("很遗憾，测试不通过！");
		}
	}
}
