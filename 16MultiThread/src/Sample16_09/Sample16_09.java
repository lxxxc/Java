/***********************************
 * 第16章 多线程的功力
 * 16.9 “生产者-消费者”案例
 * Sample16_09：“生产者-消费者”案例
***********************************/

package Sample16_09;

//资源类，将同步方法写在资源类中，从而达到锁定资源的效果
class BreadContainer
{
	public static final int maxNum = 300;	//定义容器的最大容量，static final修饰
	private int num;
	
	public BreadContainer(){};
	
	public BreadContainer(int num)
	{
		this.num = num;
	}
	
	//生产面包的同步方法，调用wait()方法使线程进入资源的等待池
	public synchronized void produceBread(int produceNum, String producerName)
	{
		while(num + produceNum > maxNum)	//不满足生产条件，线程进入等待状态
		{
			System.out.println(producerName + "要生产" + produceNum + "个，当前" + num + "个，资源充足，不需要生产，" + producerName + "去等待！");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		num = num + produceNum;
		System.out.println(producerName + "要生产了" + produceNum + "个，现在有" + num + "个。");
		notifyAll();	//唤醒资源等待池中的所有线程
	}

	//消费面包的同步方法，调用wait()方法使线程进入资源的等待池
	public synchronized void consumeBread(int consumeNum, String consumerName)
	{
		while(consumeNum > num)	//不满足消费条件，线程进入等待状态
		{
			System.out.println(consumerName + "要消费" + consumeNum + "个，由于现在只有" + num + "个，" + consumerName + "于是去等待！");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		num = num - consumeNum;
		System.out.println(consumerName + "要消费" + consumeNum + "个，现在还剩下" + num + "个。");
		this.notifyAll();	//唤醒资源等待池中的所有线程
	}
}

class Producer extends Thread
{
	private int produceNum;
	private BreadContainer bc;
	
	public Producer(){};
	
	public Producer(int produceNum, BreadContainer bc, String producerName)
	{
		this.produceNum = produceNum;
		this.bc = bc;
		this.setName(producerName);	//设置线程名称
	}
	
	public void run()
	{
		bc.produceBread(produceNum, this.getName());	//相应的线程中调用同步方法
	}
}

class Consumer extends Thread
{
	private int consumeNum;
	private BreadContainer bc;
	
	public Consumer(){};
	
	public Consumer(int consumeNum, BreadContainer bc, String consumerName)
	{
		this.consumeNum = consumeNum;
		this.bc = bc;
		this.setName(consumerName);
	}
	
	public void run()
	{
		bc.consumeBread(consumeNum, this.getName());
	}
}

public class Sample16_09 
{
	public static void main(String[] args)
	{
		BreadContainer bc = new BreadContainer(50);
		
		Producer p1 = new Producer(50, bc, "P1");
		Producer p2 = new Producer(200, bc, "P2");
		Producer p3 = new Producer(290, bc, "P3");
		
		Consumer c1 = new Consumer(70, bc, "C1");
		Consumer c2 = new Consumer(80, bc, "C2");
		
		c1.start();
		c2.start();
		p1.start();
		p3.start();
		p2.start();
	}
}
