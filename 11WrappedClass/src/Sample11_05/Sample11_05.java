/***********************************
 * ��11�� �Ի�ķ�װ��
 * 11.5 �������÷���
 * Sample11_05��isNaN()����
***********************************/

package Sample11_05;

public class Sample11_05 
{
	public static void main(String[] args)
	{
		Double wDouble;
		double d;
		d = 0.0 / 0.0;
		boolean b;
		
		b = Double.isNaN(d);	//ʹ�þ�̬�����ж��Ƿ���NaN
		System.out.println("0.0 / 0.0 " + (b ? "is " : "is not ") + "NaN.");
		
		wDouble = Double.valueOf(d);	//ʹ�þ�̬�����������ɶ���
		b = wDouble.isNaN();	//ʹ�ó�Ա�����ж��Ƕ���NaN
		System.out.println("0.0 / 0.0 " + (b ? "is " : "is not ") + "NaN.");
		
		System.out.println(Double.NaN == Double.NaN);	//NaN��Ψһ�������ֵ
	}
}
