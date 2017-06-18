/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.15 ���ϵ�Ԫ�صĳ��ò���
 * Sample14_27�������ļ򵥲���
***********************************/

package Sample14_27;

import java.util.*;

public class Sample14_27 
{
	public static void main(String[] args)
	{
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		List l3 = new ArrayList();
		
		for (int i = 0; i < 12; i++)
		{
			l1.add(Integer.valueOf(i));
			l2.add(Integer.valueOf(i + 50));
		}
		
		//�����б�
		System.out.println("==================== copy ====================");
		System.out.println("����ʹ��ǰԪ��Ϊ��" + l1);
		Collections.copy(l1, l2);
		System.out.println("����ʹ�ú�Ԫ��Ϊ��" + l1);
		
		//�Ƚϼ������Ƿ�����ͬ��Ԫ��
		System.out.println("==================== disjoint ====================");
		if (!Collections.disjoint(l1, l2))
			System.out.println("�б�l1��l2������ͬ��Ԫ�أ�");
		
		//��Ԫ����ӵ�����
		System.out.println("==================== addAll ====================");
		System.out.println("����ʹ��ǰԪ��Ϊ��" + l1);
		Collections.addAll(l1, new String[]{"tom", "jc"});
		System.out.println("����ʹ�ú�Ԫ��Ϊ��" + l1);
		
		//�������е�Ԫ��ת��Ϊָ��Ԫ��
		System.out.println("==================== fill ====================");
		System.out.println("����ʹ��ǰԪ��Ϊ��" + l2);
		Collections.fill(l2, "0");
		System.out.println("����ʹ�ú�Ԫ��Ϊ��" + l2);
		
		//��ȡ��������ָ��Ԫ����ͬ��Ԫ�ظ���
		System.out.println("==================== frequency ====================");
		int i = Collections.frequency(l3, "0");
		System.out.println("l3����Ԫ��'0'" + i + "����");
		
		//�������е�Ԫ���滻ΪĿ��Ԫ��
		System.out.println("==================== replaceAll ====================");
		System.out.println("����ʹ��ǰԪ��Ϊ��" + l2);
		Collections.replaceAll(l2, "0", "3");
		System.out.println("����ʹ�ú�Ԫ��Ϊ��" + l2);
		
		//��ת�б��е�Ԫ��
		System.out.println("==================== reverse ====================");
		System.out.println("����ʹ��ǰԪ��Ϊ��" + l1);
		Collections.reverse(l1);
		System.out.println("����ʹ�ú�Ԫ��Ϊ��" + l1);
		
		//���б��е�Ԫ��ѭ���ƶ�
		System.out.println("==================== rotate ====================");
		System.out.println("����ʹ��ǰԪ��Ϊ��" + l1);
		Collections.rotate(l1, 6);
		System.out.println("����ʹ�ú�Ԫ��Ϊ��" + l1);
		
		//�����б��е�����Ԫ��
		System.out.println("==================== swap ====================");
		System.out.println("����ʹ��ǰԪ��Ϊ��" + l1);
		Collections.swap(l1, 6, 10);
		System.out.println("����ʹ�ú�Ԫ��Ϊ��" + l1);
	}
}
