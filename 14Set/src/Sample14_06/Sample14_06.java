/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.7 ����ʵ���б�
 * Sample14_06������ʵ���б�
***********************************/

package Sample14_06;

import java.util.*;

public class Sample14_06 
{
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<>();	//����˫����ʵ�֣��ʺϲ���/ɾ���࣬Ԫ����������ٵĳ���
		
		for	(int i = 0; i < 50; i++)
		{
			ll.add(String.valueOf(i));
		}
		for	(int i = 15; i < 30; i++)
		{
			ll.add(String.valueOf(30 - i + 15));
		}
		
		System.out.println("������LinkedList������Ľ����");
		System.out.println(ll);
	}
}
