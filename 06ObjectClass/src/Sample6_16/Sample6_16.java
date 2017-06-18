/*************+++++++++++++**********************/
/********** GregorianCalendar类使用范例 **********/
/************************************************/

package Sample6_16;

import java.util.*;

public class Sample6_16 
{
	public static void main(String[] args) 
	{
		GregorianCalendar now = new GregorianCalendar();	
		Date date = now.getTime();	//取出日期对象
		System.out.println(date.toString());	//打印当前日期时间
		System.out.println();
		
		now.setTime(date);	//重新将日期对象设置到日期对象中
		int today = now.get(Calendar.DAY_OF_MONTH);	//从当前日期对象中取出日期
		int month = now.get(Calendar.MONTH);	//从当前日期对象中取出月份
		
		now.set(Calendar.DAY_OF_MONTH, 1);	//设置当前日期为本月开始日期
		int week = now.get(Calendar.DAY_OF_WEEK);	//取出本月开始日期在一周中的编号
		
		System.out.println("星期日    星期一    星期二    星期三    星期四    星期五    星期六");	//打印日历头
		
		for (int i = Calendar.SUNDAY; i < week; i++)	//设置本月第一天在日历中的位置 
			System.out.print("       ");
		
		while (now.get(Calendar.MONTH) == month) 
		{
			int day = now.get(Calendar.DAY_OF_MONTH);
			if (day < 10) 
			{
				if (day == today) 
				{
					System.out.print("  <" + day + ">   ");
				}
				else 
				{
					System.out.print("   " + day + "   ");
				}			
			}
			else
			{
				if (day == today) 
				{
					System.out.print(" <" + day + ">  ");
				}
				else 
				{
					System.out.print("  " + day + "   ");
				}			
			}
			
			if (week == Calendar.SATURDAY)	//打印至周六换行
			{
				System.out.println();
			}
			
			now.add(Calendar.DAY_OF_MONTH, 1);	//修改日历当前日期为下一天
			week = now.get(Calendar.DAY_OF_WEEK);
		}
	}

}
