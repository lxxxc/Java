/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.15 ���ϵ�Ԫ�صĳ��ò���
 * Sample14_26���������Ԫ��˳��
***********************************/

package Sample14_26;

import java.util.*;

public class Sample14_26 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();

		for (int i = 1; i < 14; i++) 
		{
			String s = null;

			switch (i) 
			{
				case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:	s = (i + 1) + "";	break;
				case 9:		s = "10";	break;
				case 10: 	s = "J";	break;
				case 11:	s = "Q";	break;
				case 12:	s = "K";	break;
				case 13:	s = "A";	break;
				default:	break;
			}
			al.add("����" + s);  
			al.add("����" + s);  
			al.add("÷��" + s);  
			al.add("��Ƭ" + s);  
		}
		al.add("����");  
		al.add("С��"); 
		
		System.out.println("�����˿��Ƶĳ�ʼ˳��");
		System.out.println(al);
		
		Collections.shuffle(al);	//����Ԫ��˳��
		System.out.println("�����˿���ϴ���ƺ�ĳ�ʼ˳��");
		System.out.println(al);
	}
}
