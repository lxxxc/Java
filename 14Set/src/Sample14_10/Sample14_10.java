/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.8 ����
 * Sample14_10��LinkedHashSet���ʹ��
***********************************/

package Sample14_10;

import java.util.*;

public class Sample14_10 
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();	//���������ظ���Ԫ�أ��洢��Ԫ���й̶�˳����Ԫ�ز����˳��һ��
		
		lhs.add(String.valueOf(5));
		lhs.add(String.valueOf(1));
		lhs.add(String.valueOf(3));
		lhs.add(String.valueOf(2));
		lhs.add(String.valueOf(4));	
		lhs.remove(String.valueOf(5));
		lhs.add(null);	
		
		System.out.println("������HashSet������Ľ����" + lhs);
	}
}

