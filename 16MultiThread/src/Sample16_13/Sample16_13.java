/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.14 ��ȡ�����߳�
 * Sample16_13����ȡ�����߳�
***********************************/

package Sample16_13;

public class Sample16_13 
{
	public static void main(String[] args)
	{
		//ʹ��Thread.currentThread()������ȡ��ǰ���е��߳�
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		System.out.println("========================================");
		System.out.println("�߳�id\t|�߳�����\t|�߳����ȼ�");
		System.out.println(id + "\t|" + name + "\t\t|" + priority);
		System.out.println("========================================");
	}
}
