/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.7 �̵߳�ʹ��
 * Sample16_04���̵߳����ȼ�
***********************************/

package Sample16_04;

class MyThread1 extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 49; i++) 
		{
			System.out.print("<Min" + i +"> ");
		}
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 49; i++) 
		{
			System.out.print("[Max" + i +"] ");
		}
	}
}

public class Sample16_04 
{
	public static void main(String[] args)
	{
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.setPriority(Thread.MIN_PRIORITY);	//�����̵߳����ȼ�
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
