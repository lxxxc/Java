/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.6 ����
 * Sample14_05������
***********************************/

package Sample14_05;

import java.util.*;

public class Sample14_05 
{
	public static void main(String[] args)
	{	
		Vector<String> v = new Vector<>();	//��ArrayList������ͬ������Vector��ͬ���ģ�ͬһʱ��ֻ����һ���̷߳���
		
		for	(int i = 0; i < 50; i++)
		{
			v.add(String.valueOf(i));
		}
		for (int i = 50; i < 100; i++)
		{
			v.add(String.valueOf(99 - i + 50));
		}
		
		System.out.println("������Vector������Ľ����");
		System.out.println(v);
	}
}
