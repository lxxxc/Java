/***********************************
 * ��28�� �����̵�����
 * 28.3 Internet��ַ
 * Sample28_01��Internet��ַ(InetAddress��ַ)
***********************************/

package Sample28_01;

import java.net.*;

public class Sample28_01 
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress addr1, addr2;
		
		addr1 = InetAddress.getLocalHost();	//��ȡ������IP��ַ
		System.out.println(addr1);
		
		addr2 = InetAddress.getByName("www.baidu.com");	//��ȡ�ٶȵ�IP��ַ
		System.out.println(addr2);
		
		InetAddress addr3[] = new InetAddress[InetAddress.getAllByName("www.sohu.com").length];	//��ʼ�����鳤��
		addr3 = InetAddress.getAllByName("www.sohu.com");	//��ȡ�Ѻ���վ���е�IP��ַ
		for (int i = 0; i < addr3.length; i++) 
		{
			System.out.println(addr3[i]);
		}
	}
}
