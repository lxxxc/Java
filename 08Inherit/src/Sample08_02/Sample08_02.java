/***********************************
 * ��8�� �����ӵļ̳�
 * Sample8_2�������Ĺ�ϵ-HAS-A��ϵ
***********************************/

package Sample08_02;

class Car
{
	private Tyre t = new Tyre();
	
	public Tyre getTyre()
	{
		return t;
	}
}

class Tyre
{
	private String material = "��";
	private String color = "��ɫ";
	
	public String getMaterial()
	{
		return material;
	}
	
	public String getColor()
	{
		return color;
	}
}

public class Sample08_02 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		
		System.out.println("�γ���ʹ����̥����ɫΪ��" + c.getTyre().getColor());
		System.out.println("�γ���ʹ����̥�Ĳ���Ϊ��" + c.getTyre().getMaterial());
	}
}
