/***********************************
 * ��9�� �ӿڵ�����
 * 9.2 �ӿ��еĳ�Ա����
 * Sample09_02���ӿ��г�Ա����������
***********************************/

package Sample09_02;

interface Flyer
{
	public static final int HIGH = 1;
	public static final int MIDDLE = 2;
	public static final int LOW = 3;
}

class AirPlane implements Flyer
{
	public void setFlyHeight(int height)
	{
		switch (height) 
		{
			case HIGH:
				System.out.println("�����ڴ��ڸ߿շ���״̬��");
				break;
				
			case MIDDLE:
				System.out.println("�����ڴ����еȸ߶ȷ���״̬��");
				break;
				
			case LOW:
				System.out.println("�����ڴ��ڵͿշ���״̬��");
				break;
	
			default:
				break;
		}
	}
}

public class Sample09_02 
{
	public static void main(String[] args)
	{
		AirPlane ap = new AirPlane();
		ap.setFlyHeight(Flyer.LOW);	//ʹ�ýӿ��еĳ�Ա��������Ҫʹ�ýӿڵ����������ã�Flyer.LOW/AirPlace.LOW/ap.LOW
	}
}
