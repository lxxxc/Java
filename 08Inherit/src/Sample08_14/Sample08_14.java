/***********************************
 * ��8�� �����ӵļ̳�
 * 8.4 �����ļ̳�
 * Sample08_14�������ļ̳�
***********************************/

package Sample08_14;

import Sample08_13.*;

public class Sample08_14 
{
	public static void main(String[] args)
	{
		Sample08_13Son s = new Sample08_13Son();
		
		System.out.print("�����������ý����");
		s.show();
		s.getShow();
	}
}

class Sample08_13Son extends Sample08_13
{
	public void getShow()
	{
		System.out.print("�����ڴ�����ý����");
		this.show();
	}
}
