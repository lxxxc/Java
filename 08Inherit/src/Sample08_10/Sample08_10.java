/***********************************
 * ��8�� �����ӵļ̳�
 * 8.3 ����
 * Sample08_10��������ó�Ա
***********************************/

package Sample08_10;

public class Sample08_10 
{
	public static void main(String[] args)
	{
		Fruit f = new Apple();
		
		System.out.println("���ø�������๲�еĳ�Ա����name=" + f.name);	//���ÿ��Ե�������������еĳ�Ա
//		System.out.println("�������еĳ�Ա����aname" + f.aname);	//���ò��ܵ������������еĳ�Ա
	}
}

class Fruit
{
	String name = "ˮ��";
}

class Apple extends Fruit
{
	String name = "ƻ��";
	String aname = "ƻ��a";
}