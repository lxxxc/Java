/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.12 SortedMap�ӿ���TreeMap��
 * Sample14_19��SortedMap�ӿ���TreeMap��
***********************************/

package Sample14_19;

import java.util.*;

class MyComparator implements Comparator<Object>	//�Զ���Ƚ���
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.intValue() - i1.intValue();
	}
}

public class Sample14_19 
{
	public static void main(String[] args)
	{
		//SortedMap�ӿڽӿڵ�ʵ�֣���������Ȼ˳������
		TreeMap<Integer, String> tmp = new TreeMap<>();
		tmp.put(Integer.valueOf(97004), "Lucy");
		tmp.put(Integer.valueOf(97001), "Smith");
		tmp.put(Integer.valueOf(97002), "Jc");
		
		TreeMap<Integer, String> tmc = new TreeMap<>(new MyComparator());
		tmc.put(Integer.valueOf(97004), "Lucy");
		tmc.put(Integer.valueOf(97001), "Smith");
		tmc.put(Integer.valueOf(97002), "Jc");
		
		System.out.println("==============================");
		System.out.println("��ͨ��TreeMap�е����ݣ�" + tmp);
		
		System.out.println("==============================");
		System.out.println("ָ���Ƚ�����TreeMap�е����ݣ�" + tmc);
		
		tmp.remove(Integer.valueOf(97001));
		tmp.put(Integer.valueOf(97002), "David");
		System.out.println("==============================");
		System.out.println("�������ͨ��TreeMap�е����ݣ�" + tmp);
		
	}
}
