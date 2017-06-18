/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.15 ���ϵ�Ԫ�صĳ��ò���
 * Sample14_24��Ԫ������
***********************************/

package Sample14_24;

import java.util.*;

class MyComparator implements Comparator<Object>	//�̳���Comparator�ӿڣ�����ʵ��compare����
{
	public int compare(Object o1, Object o2)	
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.intValue() - i1.intValue();	//����Ԫ�صĽ�������
	}
}

public class Sample14_24 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 50; i++)
		{
			al.add(Integer.valueOf((int)(Math.random() * 100)));
		}
		System.out.println("����������֮ǰArrayList�е�Ԫ�أ�");
		System.out.println(al);
		
		Collections.sort(al);	//Ĭ�ϰ���Ԫ�ص���������
		System.out.println("����������֮��ArrayList�е�Ԫ�أ�");
		System.out.println(al);
		
		Collections.sort(al, new MyComparator());	//ʹ���Զ����Ԫ�ؽ�������
		System.out.println("������ʹ�ñȽ�������֮��ArrayList�е�Ԫ�أ�");
		System.out.println(al);
	}
}
