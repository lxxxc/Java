/***********************************
 * ��8�� �����ӵļ̳�
 * 8.8 final��̳�
 * Sample08_27�����յķ���
***********************************/

package Sample08_28;

class Father
{
	public final void show()
	{
		System.out.println("����final���������Ա��̳У����ǲ��ܱ���д��");
	}
}

class Son extends Father
{
//	public void show()	//final����ֻ�ܱ��̳У����ܱ���д
//	{
//		System.out.println("��дfinal������");
//	}
}

public class Sample08_28 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		s.show();
	}
}
