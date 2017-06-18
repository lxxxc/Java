/***********************************/
/********** Date类使用范例 **********/
/***********************************/

package Sample6_15;

import java.util.*;

public class Sample6_15 
{
	public static void main(String[] args) 
	{
		Date now = new Date();
		int year = now.getYear() + 1900;	//提取当前年份
		int month = now.getMonth() + 1;		//提取当前月份
		int date = now.getDate();			//提取当前天
		
		String day = "";					//提取当前日期为星期几
		switch (now.getDay() + 1) 
		{
			case 0:
				day = "星期日";
				break;
			case 1:
				day = "星期一";
				break;
			case 2:
				day = "星期二";
				break;
			case 3:
				day = "星期三";
				break;
			case 4:
				day = "星期四";
				break;
			case 5:
				day = "星期五";
				break;
			case 6:
				day = "星期六";
				break;
			default:
				break;
		}
		
		int hour = now.getHours();		//提取当前小时
		int temp = now.getMinutes();	//提取当前分钟
		String min = temp < 10 ? "0" + temp : "" + temp;
		temp = now.getSeconds();		//提取当前秒数
		String sec = temp < 10 ? "0" + temp : "" + temp;
		
		System.out.println("现在的时刻为：" + year + "年" + month + "月" + date + "日 " + day + " " + hour +"点" + min + "分" + sec + "秒");
		
	}


}
