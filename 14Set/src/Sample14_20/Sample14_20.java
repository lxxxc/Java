/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.13 ӳ��ı���
 * Sample14_20��ӳ��ı���
***********************************/

package Sample14_20;

import java.util.*;

public class Sample14_20 
{
	public static void main(String[] args)
	{
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(Integer.valueOf(10001), "Tom");
		hm.put(Integer.valueOf(10003), "Jerry");
		hm.put(Integer.valueOf(10002), "John");
		hm.put(Integer.valueOf(10004), "Lili");
		
		Set<Integer> keySet = hm.keySet();	//��ȡMap�ļ�����
		Iterator<Integer> ii = keySet.iterator();	//��ȡ�����ϵĵ�����
		System.out.println("==========ͨ�������϶�Map���б���==========");	
		while(ii.hasNext())
		{
			Object okey = ii.next();	//��ȡ��һ��������
			Integer i = (Integer)okey;		
			Object ovalue = hm.get(okey);	//ͨ������ȡ��Ӧ��ֵ
			String s = (String)ovalue;
			System.out.println("����" + i.intValue() + "��ֵ��" + s + "��ֵ���ȣ�" + s.length() + "��");
		}
		
		Collection<String> cvalue = hm.values();	//��ȡMap��ֵ����
		System.out.println("==========��for-eachѭ��������ֵ���б���==========");	
		for (Object otemp:cvalue)	//ʹ��for-eachѭ����������
		{
			String s = (String)otemp;
			System.out.println("ֵ��" + s + "��ֵ���ȣ�" + s.length() + "��");
		}
	}
}
