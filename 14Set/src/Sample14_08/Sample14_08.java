/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.8 ����
 * Sample14_08��HashSet��
***********************************/

package Sample14_08;

import java.util.*;

public class Sample14_08 
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();	//���������ظ���Ԫ�أ��洢��Ԫ��û��˳��
		
		hs.add(String.valueOf(5));
		hs.add(String.valueOf(1));
		hs.add(String.valueOf(3));
		hs.add(String.valueOf(2));
		hs.add(String.valueOf(4));
		
		hs.remove(String.valueOf(5));
		hs.add(String.valueOf(1));	//��ͬ��Ԫ��ֻ����һ�������Ԫ��1û����ӽ�ȥ
		hs.add(null);	//������HashSet�����null����ֻ�����һ��
		
		System.out.println("������HashSet������Ľ����" + hs);
	}
}
