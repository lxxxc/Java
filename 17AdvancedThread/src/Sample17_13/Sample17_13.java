/***********************************
 * 第17章 高级线程
 * 17.8 阻塞栈
 * Sample17_13：BlockingDeque类的使用实例
***********************************/

package Sample17_13;

import java.util.*;
import java.util.concurrent.*;

public class Sample17_13 
{
	public static void main(String[] args) throws InterruptedException
	{
		BlockingDeque<String> blockingStack = new LinkedBlockingDeque<>(8);	//创建固定容量为8的阻塞栈对象
		
		for (int i = 0; i < 8; i++)	//向栈中插入8个元素
		{
			blockingStack.putFirst(i + "");
		}
		System.out.println("恭喜你，成功向栈中插入8个元素！");
		
		for (int i = 8; i < 16; i++)	//继续向栈中插入8个元素，由于栈满主线程被阻塞，程序处于永久的等待中
		{
			blockingStack.putFirst(i + "");
		}
		System.out.println("恭喜你，又成功向栈中插入8个元素！");
	}
}
