/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.11 ӳ��
 * Sample14_18��LinkedHashMap��
***********************************/

package Sample14_18;

import java.util.*;

public class Sample14_18
{
	public static void main(String[] args)
	{
		//˫����ʽʵ�֣�Ordered���ͣ������ղ��뼯�ϵ�˳��洢
		//����/ɾ��Ч�ʱ�HashMap�Բ����Ч�ʱ�HashMapЧ���Ը�
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();																		
		
		lhm.put(Integer.valueOf(97005), "Tom");
		lhm.put(Integer.valueOf(97003), "Jerry");
		lhm.put(Integer.valueOf(97004), "Lucy");
		System.out.println("������LinkedHashMap����ǰ�����ݣ�" + lhm);
		
		System.out.print("�ж�LinkedHashMap�������Ƿ��������Ϊjerry��ֵ��");
		boolean b = lhm.containsValue("Jerry");
		System.out.println((b) ? "����" : "������");
		
		lhm.put(Integer.valueOf(97003), "David");
		System.out.println("������LinkedHashMap����������ݣ�" + lhm);
	}
}

