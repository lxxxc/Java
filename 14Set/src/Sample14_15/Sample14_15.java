/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.10 �Զ���Sorted���ϵ���
 * Sample14_15��ʹ��for-eachѭ����������
***********************************/

package Sample14_15;

import java.util.*;

class MyEntryForEach
{
	int intMember;
	
	public MyEntryForEach(int intMember)
	{
		this.intMember = intMember;
	}
	
	public String toString()
	{
		return this.intMember + "";
	}
}

public class Sample14_15 
{
	public static void main(String[] args)
	{
		HashSet<MyEntryForEach> hs = new HashSet<MyEntryForEach>();
		
		hs.add(new MyEntryForEach(23));
		hs.add(new MyEntryForEach(24));
		hs.add(new MyEntryForEach(25));
		hs.add(new MyEntryForEach(27));
		hs.add(new MyEntryForEach(29));
		
		System.out.println("������HashSet����ǰ�����ݣ�" + hs);
		
		for (Object o:hs)	//for-each������������
		{
			MyEntryForEach temp = (MyEntryForEach)o;
			temp.intMember = 55;
		}
		System.out.println("������HashSet����������ݣ�" + hs);
	}
}
