/***********************************
 * 第13章 字符串应用
 * 13.8 在String类中使用正则表达式
 * Sample13_13：匹配检查
***********************************/

package Sample13_13;

import java.util.regex.*;

public class Sample13_13 
{
	public static void main(String[] args)
	{
		String patternStr = "\\d{4}-\\d{2}-\\d{2}";	//匹配xxxx-xx-xx数字字符串
		String s1 = "9999-66-88";
		String s2 = "内容为9999-66-88";
		
		if (s1.matches(patternStr))	//使用字符串的match方法来匹配，但只能整体匹配
		{
			System.out.println("恭喜你，字符串s1满足指定的格式要求！");
		}
		else
		{
			System.out.println("测试失败，字符串s1不满足指定的格式要求！");
		}
		
		if (s2.matches(patternStr))
		{
			System.out.println("恭喜你，字符串s2满足指定的格式要求！");
		}
		else
		{
			System.out.println("测试失败，字符串s2不满足指定的格式要求！");
		}
	}
}
