/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.5 �б�
 * Sample14_04��List�ӿ�
***********************************/

package Sample14_04;

import java.util.*;

public class Sample14_04 
{
	public static void main(String[] args)
	{
		//ArrayList�࣬����������ܺã�����/ɾ�����ܲ�
		ArrayList<String> al = new ArrayList<>();	//��Ҫ��<>��ָ�����������
		
		for (int i = 0; i < 50; i++)
		{
			al.add(String.valueOf(i));	//���Ԫ��
		}
		for(int i = 60; i < 75; i++)
		{
			al.set(i - 45, String.valueOf(i));	//�滻Ԫ��
		}
		
		System.out.println("������ArrayList������Ľ����");
		System.out.println(al);
		
		Object o = al.get(22);	//ʹ��get��������Object���͵�����
		String s = (String)o;
		System.out.println("����Ϊ22��Ԫ�س���Ϊ��" + s.length());
	}
}
