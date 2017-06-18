/***********************************
 * 第13章 字符串应用
 * 13.8 在String类中使用正则表达式
 * Sample13_15：对字符串进行分拆
***********************************/

package Sample13_15;

public class Sample13_15 
{
	public static void main(String[] args)
	{
		String patternStr = ";|,";	//匹配;或者,
		String str = "Tom;Lucy,Jerry;";
		System.out.println("待切割字符串的初始内容为：" + str);
		
		System.out.print("将字符串切割默认份，结果为：");	
		String[] arrStr = str.split(patternStr);	//将字符串尽可能多的拆分
		for (int i = 0; i < arrStr.length; i++)
		{
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		
		System.out.print("\n将字符串切割3份，结果为：");
		arrStr = str.split(patternStr, 3);	//将字符串拆分成3份
		for (int i = 0; i < arrStr.length; i++)
		{
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		
		System.out.print("\n将字符串切割-2份，结果为：");
		arrStr = str.split(patternStr, -2);	//将字符串尽可能多的拆分，保存空字符串
		for (int i = 0; i < arrStr.length; i++)
		{
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		
		System.out.print("\n将字符串切割0份，结果为：");
		arrStr = str.split(patternStr, 0);	//将字符串尽可能多的拆分，丢弃空字符串
		for (int i = 0; i < arrStr.length; i++)	
		{
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
	}
}
