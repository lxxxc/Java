/***********************************
 * 第16章 多线程的功力
 * 16.14 获取运行线程
 * Sample16_13：获取运行线程
***********************************/

package Sample16_13;

public class Sample16_13 
{
	public static void main(String[] args)
	{
		//使用Thread.currentThread()方法获取当前运行的线程
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		System.out.println("========================================");
		System.out.println("线程id\t|线程名称\t|线程优先级");
		System.out.println(id + "\t|" + name + "\t\t|" + priority);
		System.out.println("========================================");
	}
}
