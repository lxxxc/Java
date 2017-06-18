/***********************************
 * ��17�� �߼��߳�
 * 17.7 ����
 * Sample17_12��BlockingQueue�ӿڽ���
***********************************/

package Sample17_12;

import java.util.*;
import java.util.concurrent.*;

class MyElement
{
	String content;
	
	public MyElement(String content)
	{
		this.content = content;
	}
	
	public String toString()
	{
		return "[����Ϊ��" + content +"��] ";
	}
}

public class Sample17_12 
{
	public static void main(String[] args) throws InterruptedException
	{
		BlockingQueue<MyElement> bq = new ArrayBlockingQueue<>(10);	//������ʼ�ߴ�Ϊ10����������
		
		for (int i = 0; i < 10; i++) 
		{
			bq.put(new MyElement("No" + i));
		}
		System.out.println("�ɹ�����������10��Ԫ�أ�");
		
		for (int i = 10; i < 20; i++) 	//�ٴ�����������10��Ԫ�أ����ڶ������������̱߳������������ڵȴ�����
		{
			bq.put(new MyElement("No" + i));
		}
		System.out.println("�ٴγɹ�����������10��Ԫ�أ�");
	}
}
