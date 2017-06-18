/***********************************
 * ��17�� �߼��߳�
 * 17.5 ������Դ
 * Sample17_07��ReentrantLock��ʹ��ʵ��
***********************************/

package Sample17_07;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class MyCount
{
	private int count;
	
	public MyCount(int count)
	{
		this.count = count;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
}

class MyUser implements Runnable
{
	private String userName;
	private Lock countLock;
	private MyCount mc;
	
	private int taskSum;
	
	public MyUser(String userName, Lock countLock, MyCount mc, int taskSum)
	{
		this.userName = userName;
		this.countLock = countLock;
		this.mc = mc;
		this.taskSum = taskSum;
	}
	
	public void run()
	{
		boolean okFlag = false;
		
		while(!okFlag)
		{
			try
			{
				countLock.lock();	//��ȡ�˻���
				if(taskSum < 0)	//ȡ�����
				{
					if(taskSum + mc.getCount() >= 0)	//�����㣬ȡ��
					{
						mc.setCount(mc.getCount() + taskSum);
						System.out.println(userName + "�ɹ�ȡ��" + (-taskSum) + "Ԫ�����Ϊ��" + mc.getCount() + "Ԫ��");
						okFlag = true;
					}
				}
				else	//������
				{
					mc.setCount(mc.getCount() + taskSum);
					System.out.println(userName + "�ɹ����" + taskSum + "Ԫ�����Ϊ��" + mc.getCount() + "Ԫ��");
					okFlag = true;
				}
			}
			finally
			{
				countLock.unlock();	//�ͷ��˻�������ֹ�����ͷ�����ʹ��������
			}
			
			if(okFlag == true)	break;	//��������ɹ���������ִ��˯�߲���
			
			try
			{
				//ȡ��ʧ��
				System.out.println(userName + "�����㣬�ȴ�һ��ʱ�����ԣ�");
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Sample17_07 
{
	public static void main(String[] args)
	{
		MyCount mc = new MyCount(50);
		Lock countLock = new ReentrantLock();
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		threadPool.execute(new MyUser("User1", countLock, mc, -200));
		threadPool.execute(new MyUser("User2", countLock, mc, 200));
		threadPool.shutdown();
	}
}
