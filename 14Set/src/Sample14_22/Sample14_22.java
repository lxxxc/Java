/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.14 ջ��ʵ��
 * Sample14_22��Deque�ӿ�
***********************************/

package Sample14_22;

import java.util.*;

public class Sample14_22 
{
	public static void main(String[] args)
	{
		Deque<String> stack = new ArrayDeque<>();
		String[] sa = new String[]{"1", "a", "2", "b", "3", "c", "4", "d"};
		System.out.print("������Ԫ�صĳ�ʼ˳��");
		for (String temps:sa)	//ʹ��for-eachѭ����������
		{
			System.out.print(temps + ", ");
			stack.push(temps);			
		}
		System.out.print("\n������Ԫ�ص����Ľ��Ϊ��");
		while (stack.size() != 0)
		{
			System.out.print(stack.pop() + ", ");
		}
		System.out.println("");
	}
}
