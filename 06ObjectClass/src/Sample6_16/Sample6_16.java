/*************+++++++++++++**********************/
/********** GregorianCalendar��ʹ�÷��� **********/
/************************************************/

package Sample6_16;

import java.util.*;

public class Sample6_16 
{
	public static void main(String[] args) 
	{
		GregorianCalendar now = new GregorianCalendar();	
		Date date = now.getTime();	//ȡ�����ڶ���
		System.out.println(date.toString());	//��ӡ��ǰ����ʱ��
		System.out.println();
		
		now.setTime(date);	//���½����ڶ������õ����ڶ�����
		int today = now.get(Calendar.DAY_OF_MONTH);	//�ӵ�ǰ���ڶ�����ȡ������
		int month = now.get(Calendar.MONTH);	//�ӵ�ǰ���ڶ�����ȡ���·�
		
		now.set(Calendar.DAY_OF_MONTH, 1);	//���õ�ǰ����Ϊ���¿�ʼ����
		int week = now.get(Calendar.DAY_OF_WEEK);	//ȡ�����¿�ʼ������һ���еı��
		
		System.out.println("������    ����һ    ���ڶ�    ������    ������    ������    ������");	//��ӡ����ͷ
		
		for (int i = Calendar.SUNDAY; i < week; i++)	//���ñ��µ�һ���������е�λ�� 
			System.out.print("       ");
		
		while (now.get(Calendar.MONTH) == month) 
		{
			int day = now.get(Calendar.DAY_OF_MONTH);
			if (day < 10) 
			{
				if (day == today) 
				{
					System.out.print("  <" + day + ">   ");
				}
				else 
				{
					System.out.print("   " + day + "   ");
				}			
			}
			else
			{
				if (day == today) 
				{
					System.out.print(" <" + day + ">  ");
				}
				else 
				{
					System.out.print("  " + day + "   ");
				}			
			}
			
			if (week == Calendar.SATURDAY)	//��ӡ����������
			{
				System.out.println();
			}
			
			now.add(Calendar.DAY_OF_MONTH, 1);	//�޸�������ǰ����Ϊ��һ��
			week = now.get(Calendar.DAY_OF_WEEK);
		}
	}

}
