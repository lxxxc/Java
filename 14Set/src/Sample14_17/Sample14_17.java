/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.11 ӳ��
 * Sample14_17��Hashtable��
***********************************/

package Sample14_17;

import java.util.*;

public class Sample14_17 
{
	public static void main(String[] args)
	{
		Hashtable<Integer, String> ht = new Hashtable<>();	//��Ԫ�صĲ���Ϊͬ��������������null������
		
		ht.put(Integer.valueOf(97005), "Tom");
		ht.put(Integer.valueOf(97003), "Jerry");
		ht.put(Integer.valueOf(97004), "Lucy");
		ht.put(Integer.valueOf(97001), "Smith");
		ht.put(Integer.valueOf(97002), "Jc");
		System.out.println("������Hashtable����ǰ�����ݣ�" + ht);
		
		System.out.print("�ж�Hashtable�������Ƿ���ڼ�Ϊ97001��ֵ��");
		boolean b = ht.containsKey(97001);
		System.out.println((b) ? "����" : "������");
		
		ht.put(Integer.valueOf(97002), "David");
		System.out.println("������Hashtable����������ݣ�" + ht);
		
		Object o = ht.get(97003);
		String s = (String)o;
		System.out.println("��97003��Ӧ��ֵΪ��" + s + "������Ϊ��" + s.length() + "��");
	}
}
