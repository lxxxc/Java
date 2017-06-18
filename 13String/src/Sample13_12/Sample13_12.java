/***********************************
 * 第13章 字符串应用
 * 13.7 正则表达式
 * Sample13_12：Pattern与Matcher类的综合实例
***********************************/

package Sample13_12;

import java.util.regex.*;

public class Sample13_12 
{
	public static void main(String[] args)
	{
		String patternStr = "(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";	//匹配"00:00(a/pm)"格式的12小时制字符串，并将其转化为24小时制
		String matcherStr = "现在的时刻为10:51pm，这里的营业时间为：每天8:00am至5:30pm！";		//被匹配的字符串
		Pattern p = Pattern.compile(patternStr);	//使用Pattern类的静态工厂方法创建对象
		Matcher m = p.matcher(matcherStr);	//使用Pattern的match方法生成被匹配字符串的匹配器对象
		
		StringBuffer sb = new StringBuffer();
		int count = 0;
		System.out.println("初始化字符串为：" + matcherStr);
		
		while(m.find())	//成功匹配字符串
		{
			StringBuffer temp = new StringBuffer();
			
			if (m.group(3).equals("am"))	//判断匹配到的字符串的第3分组来确定是am还是pm
			{
				temp.append(m.group(1));	//将小时添加到替换字符串
				temp.append(":");
				temp.append(m.group(2));	//将分钟添加到替换字符串
			}
			else
			{
				int time = Integer.parseInt(m.group(1));
				time = time + 12;
				temp.append(time + ":" + m.group(2));
			}
			m.appendReplacement(sb, temp.toString());	//将目标字符串中的匹配字符串全部替换为替换字符串
			System.out.println("[" + (++count) +"] 将" +m.group(0) + "替换为" + temp.toString());	//m.group(0)表示整个匹配到的字符串
		}
		m.appendTail(sb);	//将最后一次替换后剩余的字符添加到目标字符串缓冲区
		System.out.println("最后的结果为：" + sb.toString());
	}
}
