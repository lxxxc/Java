/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.4 �����߳�
 * Sample16_01�������߳�
***********************************/

package Sample16_01;

class MyRunnable implements Runnable	//����ʵ��Runnable�ӿڵ���
{
	@Override
	public void run()	//ʵ��run����
	{
		System.out.println("��ϲ�㣬�̱߳������ˣ�ִ����run�����еĴ��룡");
	}
}

public class Sample16_01 
{
	public static void main(String[] args)
	{
		MyRunnable mr = new MyRunnable();	//����ʵ��Runnable�ӿڵ������
		Thread t = new Thread(mr);	//����Thread���󣬽�������ʵ��Runnable�ӿڶ����������Ϊ����������
		t.start();	//�����̣߳��߳�������������ֻ������һ�Σ�����������׳�IllegalThreadStateException�쳣
	}
}
