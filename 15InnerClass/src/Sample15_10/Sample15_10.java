/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.7 ��̬�ڲ���
 * Sample15_10��������̬�ڲ���Ķ���
***********************************/

package Sample15_10;

import java.util.*;

class Outter
{
	static class Inner
	{
		public void show()
		{
			System.out.println("��ϲ�㣬�ɹ������˾�̬�ڲ���Ķ���");
		}
	}
	
	public void getInner()
	{
		Inner ii = new Inner();
		ii.show();
	}
}

public class Sample15_10 
{
	public static void main(String[] args)
	{
		Outter.Inner i = new Outter.Inner();	//ֱ�Ӵ�����̬�ڲ�������������ȴ����ⲿ�����
		i.show();
		
		Outter o = new Outter();
		o.getInner();
	}
}
