/***********************************
 * ��8�� �����ӵļ̳�
 * Sample8_4����Ա�����ļ̳�-���г�Ա
***********************************/

package Sample08_04;

import Sample08_03.Sample08_03;

class Sample8_3son extends Sample08_03
{
	public void getShow()
	{
		System.out.println("�����ڴ�����ý����" + this.str1);
	}
}

public class Sample08_04 
{
	public static void main(String[] args)
	{
		Sample8_3son s = new Sample8_3son();
	
		System.out.println("�����������ý����" + s.str1);
		s.getShow();
	}
}
