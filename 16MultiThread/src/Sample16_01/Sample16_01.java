/***********************************
 * 第16章 多线程的功力
 * 16.4 启动线程
 * Sample16_01：启动线程
***********************************/

package Sample16_01;

class MyRunnable implements Runnable	//定义实现Runnable接口的类
{
	@Override
	public void run()	//实现run方法
	{
		System.out.println("恭喜你，线程被启动了，执行了run方法中的代码！");
	}
}

public class Sample16_01 
{
	public static void main(String[] args)
	{
		MyRunnable mr = new MyRunnable();	//创建实现Runnable接口的类对象
		Thread t = new Thread(mr);	//创建Thread对象，将创建的实现Runnable接口对象的引用作为构造器参数
		t.start();	//启动线程，线程在生命周期中只能启动一次，多次启动会抛出IllegalThreadStateException异常
	}
}
