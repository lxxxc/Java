/***********************************
 * ��17�� �߼��߳�
 * 17.7 ����
 * Sample17_10��Queue�ӿڽ���
***********************************/

package Sample17_10;

import java.util.*;

public class Sample17_10 
{
	public static void main(String[] args)
	{
		Queue<String> queue = new LinkedList<>();	//�������ж���
		
		for(int i = 0; i < 10; i++)
		{
			queue.offer("" + i);
		}
		
		System.out.println("�����е�Ԫ��Ϊ��");
		Object o = queue.poll();
		while(o != null)
		{
			System.out.print("[" + o + "] ");
			o = queue.poll();
		}
		System.out.println();
	}
}
