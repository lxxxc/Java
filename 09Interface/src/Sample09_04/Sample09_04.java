/***********************************
 * ��9�� �ӿڵ�����
 * 9.4 �ӿ����õ�ʹ��
 * Sample09_04���ӿ����ü�ĸ�ֵ
***********************************/

package Sample09_04;

interface Developer
{
}

interface JavaDeveloper extends Developer
{
}

interface Lecturer
{
}

class Person implements JavaDeveloper
{
}

public class Sample09_04 
{
	public static void main(String[] args)
	{
		JavaDeveloper jd = new Person();	//�ӿ����ÿ���ָ���ӻ�֮��ʵ�ָýӿڵ������
		Developer d = jd;	//�ӽӿ����ÿ���ֱ�Ӹ�ֵ�����ӿ�����
		jd = (JavaDeveloper)d;	//���ӿ�������Ҫǿ������ת������ܸ�ֵ���ӽӿ�����
//		Lecturer l = (Lecturer)d;	//
	}
}
