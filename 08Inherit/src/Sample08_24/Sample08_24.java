/***********************************
 * ��8�� �����ӵļ̳�
 * 8.7 ����������
 * Sample08_24�����ط�����ƥ��-������������
***********************************/

package Sample08_24;

class Adder
{
	public int add(int i, int j)
	{
		System.out.print("����int�����ķ��������ã�");
		return i+j;
	}
	
	public double add(double i, double j)	//������������������
	{
		System.out.print("����double�����ķ��������ã�");
		return i+j;
	}
}

public class Sample08_24 
{
	public static void main(String[] args)
	{
		Adder a = new Adder();
		
		System.out.println("2+5=" + a.add(2, 5));	//���ݲ��������ͣ�����ƥ��ķ��������û��ֱ��ƥ��ķ����������ݻ����������͵��Զ�ת����ϵ��������ƥ��ķ���
		System.out.println("5+30.8=" + a.add(5,30.8));
	}
}
