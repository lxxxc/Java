/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.7 ������ʽ
 * Sample13_12��Pattern��Matcher����ۺ�ʵ��
***********************************/

package Sample13_12;

import java.util.regex.*;

public class Sample13_12 
{
	public static void main(String[] args)
	{
		String patternStr = "(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";	//ƥ��"00:00(a/pm)"��ʽ��12Сʱ���ַ�����������ת��Ϊ24Сʱ��
		String matcherStr = "���ڵ�ʱ��Ϊ10:51pm�������Ӫҵʱ��Ϊ��ÿ��8:00am��5:30pm��";		//��ƥ����ַ���
		Pattern p = Pattern.compile(patternStr);	//ʹ��Pattern��ľ�̬����������������
		Matcher m = p.matcher(matcherStr);	//ʹ��Pattern��match�������ɱ�ƥ���ַ�����ƥ��������
		
		StringBuffer sb = new StringBuffer();
		int count = 0;
		System.out.println("��ʼ���ַ���Ϊ��" + matcherStr);
		
		while(m.find())	//�ɹ�ƥ���ַ���
		{
			StringBuffer temp = new StringBuffer();
			
			if (m.group(3).equals("am"))	//�ж�ƥ�䵽���ַ����ĵ�3������ȷ����am����pm
			{
				temp.append(m.group(1));	//��Сʱ��ӵ��滻�ַ���
				temp.append(":");
				temp.append(m.group(2));	//��������ӵ��滻�ַ���
			}
			else
			{
				int time = Integer.parseInt(m.group(1));
				time = time + 12;
				temp.append(time + ":" + m.group(2));
			}
			m.appendReplacement(sb, temp.toString());	//��Ŀ���ַ����е�ƥ���ַ���ȫ���滻Ϊ�滻�ַ���
			System.out.println("[" + (++count) +"] ��" +m.group(0) + "�滻Ϊ" + temp.toString());	//m.group(0)��ʾ����ƥ�䵽���ַ���
		}
		m.appendTail(sb);	//�����һ���滻��ʣ����ַ���ӵ�Ŀ���ַ���������
		System.out.println("���Ľ��Ϊ��" + sb.toString());
	}
}
