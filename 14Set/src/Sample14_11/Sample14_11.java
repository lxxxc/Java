/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.9 SortedSet�ӿ���TreeSet��
 * Sample14_11��SortedSet�ӿ���TreeSet��
***********************************/

package Sample14_11;

import java.util.*;

public class Sample14_11 
{
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();	//Ԫ�ذ���Ȼ˳���Զ�����	
		
		ts.add(String.valueOf(5));
		ts.add(String.valueOf(6));
		ts.add(String.valueOf(3));
		ts.add(String.valueOf(2));
		ts.add(String.valueOf(4));	
		ts.remove(String.valueOf(5));
		ts.add(String.valueOf(1));
		
		System.out.println("������TreeSet������Ľ����" + ts);
	}
}


