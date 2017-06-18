/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.7 �̵߳�ʹ��
 * Sample16_07���ػ��߳�
***********************************/

package Sample16_07;

class MyCommon implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.print("[" + i + "] ");
		}
		System.out.print("{ǰ̨�û��߳�ִ����ϣ�} ");
	}
}

class MyDaemon implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 100000; i++)
		{
			System.out.print("<" + i + "> ");
		}
		System.out.print("{��̨�ػ��߳�ִ����ϣ�} ");
	}
}

public class Sample16_07 
{
	public static void main(String[] args)
	{
		Runnable mc = new MyCommon();
		Runnable md = new MyDaemon();
		Thread tc = new Thread(mc);
		Thread td = new Thread(md);
		td.setDaemon(true);	//���߳�td����Ϊ�ػ��߳�
		tc.start();
		td.start();
	}
}
