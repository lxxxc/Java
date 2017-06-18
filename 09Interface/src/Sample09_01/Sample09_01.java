/***********************************
 * 第9章 接口的世界
 * 9.2 接口中的成员变量
 * Sample09_01：语法规则
***********************************/

package Sample09_01;

interface IFEx
{
	int intConst1 = 12;	//接口中只能定义常量属性，并且隐含是public static final类型的
	public static final int intConst2 = 23;
}

public class Sample09_01 
{
	public static void main(String[] args)
	{
//		IFEx.intConst1 = IFEx.intConst1 + 1;
	}
}
