/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.14 ջ��ʵ��
 * Sample14_21��Stack��
***********************************/

package Sample14_21;

import java.util.*;

public class Sample14_21 
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 50; i++)
		{
			al.add(Integer.valueOf(i));
		}
		System.out.println("ArrayList��Ԫ�صĳ�ʼ˳��" + al);
		
		for (int i = 0; i < 50; i++)
		{
			s.push(al.get(i));	//��ArrayList�е�Ԫ������ѹջ
		}
		for (int i = 0; i < 50; i++)
		{
			al.set(i, s.pop());	//��ջ�е�Ԫ�����γ�ջ��ʵ����Ԫ�صĵ�������
		}
		System.out.println("ʹ�ù�ջ��ArrayList��Ԫ�ص�˳��" + al);
	}
}
