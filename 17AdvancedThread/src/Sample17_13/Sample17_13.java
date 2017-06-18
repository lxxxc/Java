/***********************************
 * ��17�� �߼��߳�
 * 17.8 ����ջ
 * Sample17_13��BlockingDeque���ʹ��ʵ��
***********************************/

package Sample17_13;

import java.util.*;
import java.util.concurrent.*;

public class Sample17_13 
{
	public static void main(String[] args) throws InterruptedException
	{
		BlockingDeque<String> blockingStack = new LinkedBlockingDeque<>(8);	//�����̶�����Ϊ8������ջ����
		
		for (int i = 0; i < 8; i++)	//��ջ�в���8��Ԫ��
		{
			blockingStack.putFirst(i + "");
		}
		System.out.println("��ϲ�㣬�ɹ���ջ�в���8��Ԫ�أ�");
		
		for (int i = 8; i < 16; i++)	//������ջ�в���8��Ԫ�أ�����ջ�����̱߳����������������õĵȴ���
		{
			blockingStack.putFirst(i + "");
		}
		System.out.println("��ϲ�㣬�ֳɹ���ջ�в���8��Ԫ�أ�");
	}
}
