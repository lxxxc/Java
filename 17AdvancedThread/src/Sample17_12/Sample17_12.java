/***********************************
 * 第17章 高级线程
 * 17.7 队列
 * Sample17_12：BlockingQueue接口介绍
***********************************/

package Sample17_12;

import java.util.*;
import java.util.concurrent.*;

class MyElement
{
	String content;
	
	public MyElement(String content)
	{
		this.content = content;
	}
	
	public String toString()
	{
		return "[内容为“" + content +"”] ";
	}
}

public class Sample17_12 
{
	public static void main(String[] args) throws InterruptedException
	{
		BlockingQueue<MyElement> bq = new ArrayBlockingQueue<>(10);	//创建初始尺寸为10的阻塞队列
		
		for (int i = 0; i < 10; i++) 
		{
			bq.put(new MyElement("No" + i));
		}
		System.out.println("成功向队列中添加10个元素！");
		
		for (int i = 10; i < 20; i++) 	//再次向队列中添加10个元素，由于队列已满，主线程被阻塞，程序处于等待当中
		{
			bq.put(new MyElement("No" + i));
		}
		System.out.println("再次成功向队列中添加10个元素！");
	}
}
