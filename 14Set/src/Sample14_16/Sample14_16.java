/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.11 ӳ��
 * Sample14_16��HashMap��
***********************************/

package Sample14_16;

import java.util.*;

public class Sample14_16 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(Integer.valueOf(97005), "Tom");
		hm.put(Integer.valueOf(97003), "Jerry");
		hm.put(Integer.valueOf(97004), "Lucy");
		hm.put(Integer.valueOf(97001), "Smith");
		hm.put(Integer.valueOf(97002), "Jc");	
		System.out.println("������HashMap����ǰ�����ݣ�" + hm);
		
		hm.remove(Integer.valueOf(97001));	//ɾ����Ϊ97001��ֵ�����ӳ��
		hm.put(Integer.valueOf(97002), "David");	//�滻��97002��ֵ
		System.out.println("������HashMap����������ݣ�" + hm);
		
		Object o = hm.get(97003);	//ȡ��ָ������ֵ
		String s = (String)o;
		System.out.println("��97003��Ӧ��ֵΪ��" + s + "������Ϊ��" + s.length() + "��");
	}
}
