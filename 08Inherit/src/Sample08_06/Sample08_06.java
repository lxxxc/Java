/***********************************
 * ��8�� �����ӵļ̳�
 * Sample8_4����Ա�����ļ̳�-�ܱ�����Ա
***********************************/

package Sample08_06;

import Sample08_03.Sample08_03;

class Sample8_6son extends Sample08_03
{
	public void getShow()
	{
		System.out.println("�����ڴ�����ý����" + this.str2);
	}
}

public class Sample08_06 
{
	public static void main(String[] args)
	{
		Sample8_6son s = new Sample8_6son();
	
//		System.out.println("�����������ý����" + s.str);	//�������ֻ��ͨ���̳в��ܷ���protected��Ա���������ڵĿ�����������
		s.getShow();
	}
}
