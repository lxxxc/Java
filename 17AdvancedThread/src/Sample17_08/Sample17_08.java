/***********************************
 * ��17�� �߼��߳�
 * 17.5 ������Դ
 * Sample17_08��ReentrantReadWriteLock��/д��ʹ��ʵ��
***********************************/

package Sample17_08;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class MyResource
{
	public ReadWriteLock lock = new ReentrantReadWriteLock(false);
	private String msg = "init";
	
	public String getMsg()
	{
		return msg;
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}

class MyUser implements Runnable
{
	private String uname;
	private int functionCode;	//�����룺0-��/1-д
	private String msg;
	private MyResource mr;
	
	public MyUser(String uname, int functionCode, String msg, MyResource mr)
	{
		this.uname = uname;
		this.functionCode = functionCode;
		this.msg = msg;
		this.mr = mr;
	}
	
	public void run()
	{
		if(functionCode == 0)	//������
		{
			try
			{
				mr.lock.readLock().lock();	//��ȡ������ͬʱ�����ж���߳�ӵ�ж�������ʱ�����Խ���д����
				System.out.println(uname + "�û��ɹ����ж���������������Ϊ����" + mr.getMsg() + "����");
				Thread.sleep(2000);	//�������ɹ�����Ŷ���˯��
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				mr.lock.readLock().unlock();	//�ͷŶ���
			}
		}
		else	//д����
		{
			try
			{
				mr.lock.writeLock().lock();	//��ȡд����ͬһʱ��ֻ����һ���߳�ӵ��д������ʱ�����Խ���д������������߲���Ч��
				mr.setMsg(msg);
				System.out.println(uname + "�û��ɹ�����д������д�������Ϊ����" + mr.getMsg() + "����");
				Thread.sleep(2000);	//д�����ɹ������д��˯��
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				mr.lock.writeLock().unlock();	//�ͷ�д��
			}
		}
	}
}

public class Sample17_08
{
	public static void main(String[] args)
	{
		MyResource mr = new MyResource();
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		
		threadPool.execute(new MyUser("User1", 0, null, mr));
		threadPool.execute(new MyUser("User2", 0, null, mr));
		threadPool.execute(new MyUser("User3", 1, "Hello World", mr));
//		threadPool.execute(new MyUser("User4", 1, "Hello World2", mr));
		
		threadPool.shutdown();
	}
}
