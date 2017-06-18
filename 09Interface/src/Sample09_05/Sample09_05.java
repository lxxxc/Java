/***********************************
 * 第9章 接口的世界
 * 9.4 接口引用的使用
 * Sample09_05：类引用与接口引用间的赋值
***********************************/

package Sample09_05;

interface IFEx1
{
}

interface IFEx2
{
}

class CEx implements IFEx1
{
}

public class Sample09_05 
{
	public static void main(String[] args)
	{
		CEx c = new CEx();	
		IFEx1 ifex1 = c;	//若类引用间接或直接实现了接口，则可以直接赋值给接口引用
		c = (CEx)ifex1;	//若类引用间接或直接实现了接口，则可以将接口引用赋值给类引用，但需要经过强制类型转换
	}
}
