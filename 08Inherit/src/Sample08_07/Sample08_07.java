/***********************************
 * ��8�� �����ӵļ̳�
 * Sample8_7����Ա����������
***********************************/

package Sample08_07;

class Father
{
	String s = "����ĳ�Ա����";
}

class Son extends Father
{
	String s = "����ĳ�Ա����";
	
	public void show()
	{
		System.out.println("���ｫ���õ��ǣ�" + s);	//ֱ�ӵ���s����������ĳ�Ա����
		System.out.println("���ｫ���õ��ǣ�" + super.s);	//ʹ��super�ؼ��������ʸ����ͬ������
	}
}

public class Sample08_07 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		
		s.show();
	}
}
