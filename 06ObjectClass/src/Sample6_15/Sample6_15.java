/***********************************/
/********** Date��ʹ�÷��� **********/
/***********************************/

package Sample6_15;

import java.util.*;

public class Sample6_15 
{
	public static void main(String[] args) 
	{
		Date now = new Date();
		int year = now.getYear() + 1900;	//��ȡ��ǰ���
		int month = now.getMonth() + 1;		//��ȡ��ǰ�·�
		int date = now.getDate();			//��ȡ��ǰ��
		
		String day = "";					//��ȡ��ǰ����Ϊ���ڼ�
		switch (now.getDay() + 1) 
		{
			case 0:
				day = "������";
				break;
			case 1:
				day = "����һ";
				break;
			case 2:
				day = "���ڶ�";
				break;
			case 3:
				day = "������";
				break;
			case 4:
				day = "������";
				break;
			case 5:
				day = "������";
				break;
			case 6:
				day = "������";
				break;
			default:
				break;
		}
		
		int hour = now.getHours();		//��ȡ��ǰСʱ
		int temp = now.getMinutes();	//��ȡ��ǰ����
		String min = temp < 10 ? "0" + temp : "" + temp;
		temp = now.getSeconds();		//��ȡ��ǰ����
		String sec = temp < 10 ? "0" + temp : "" + temp;
		
		System.out.println("���ڵ�ʱ��Ϊ��" + year + "��" + month + "��" + date + "�� " + day + " " + hour +"��" + min + "��" + sec + "��");
		
	}


}
