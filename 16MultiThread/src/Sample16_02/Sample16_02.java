/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.5 ͬʱʹ�ö���߳�
 * Sample16_02��ͬʱʹ�ö���߳�
***********************************/

package Sample16_02;

class MyRunnable1 implements Runnable 
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 50; i++) 
		{
			System.out.print("[" + i + "] ");
		}	
	}
}

class MyRunnable2 implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 50; i++) 
		{
			System.out.print("<" + i + "> ");
		}
	}
}

public class Sample16_02 
{
	public static void main(String[] args)
	{
		//����ʵ��Runnable�ӿڵ������
		MyRunnable1 mr1 = new MyRunnable1();
		MyRunnable2 mr2 = new MyRunnable2();
		//�����߳�Thread����
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		t1.start();
		t2.start();
	}
}
