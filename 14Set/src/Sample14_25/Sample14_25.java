/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.15 ���ϵ�Ԫ�صĳ��ò���
 * Sample14_25�������ض�Ԫ��
***********************************/

package Sample14_25;

import java.util.*;

public class Sample14_25 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 20; i++)
		{
			al.add(Integer.valueOf((int)(Math.random() * 100)));
		}
		Collections.sort(al);	//����֮ǰ��Ҫ���б��������
		int index = Collections.binarySearch(al, Integer.valueOf(20));
		if (index < 0)
		{
			System.out.println("���б���û������Ҫ�ҵ������������ٴ��������ԣ�");
		}
		else
		{
			System.out.println("��ϲ�㣬�ҵ�������Ҫ�ҵ�Ԫ�أ��������ǣ�" + index);
			
			System.out.print("{");
			for (int i = 0; i < al.size(); i++)
			{
				if (i == index)
				{
					System.out.print("[" + al.get(i) + "], ");
				}
				else
				{
					System.out.print(al.get(i) + ", ");
				}
			}
			System.out.println("}");
		}
	}
}
