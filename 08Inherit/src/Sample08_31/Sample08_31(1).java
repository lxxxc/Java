/***********************************
 * ��8�� �����ӵļ̳�
 * 8.9 abstract��̳�
 * Sample08_31�����󷽷�-�̳���ʵ��
***********************************/

package Sample08_31;

abstract class Car	//������Car��������
{
	public abstract void startUp();
}

abstract class Audi extends Car	//������Audi���̳���Car������µϳ�
{
	public abstract void turbo();
}

class Audi_A6 extends Audi	//�ǳ�����Audi_A6���̳���������Audi
{
	public void startUp()	//ʵ��turbo����
	{
		System.out.println("�����˰µ�A6���������ܣ�");
	}
	
	public void turbo()	//ʵ��turbo����
	{
		System.out.println("�����˰µ�A6�ļ��ٹ��ܣ�");
	}
}

class Audi_A8 extends Audi	//�ǳ�����Audi_A8���̳���������Audi
{
	public void startUp()	//ʵ��turbo����
	{
		System.out.println("�����˰µ�A8���������ܣ�");
	}
	
	public void turbo()	//ʵ��turbo����
	{
		System.out.println("�����˰µ�A8�ļ��ٹ��ܣ�");
	}
}

public class Sample08_31 
{
	public static void main(String[] args)
	{
		Audi_A6 a6 = new Audi_A6();
		a6.startUp();
		a6.turbo();
		
		Audi_A8 a8 = new Audi_A8();
		a8.startUp();
		a8.turbo();
	}
}
