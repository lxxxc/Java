/***********************************
 * ��12�� ��δ����쳣
 * 12.6 �Զ����쳣
 * Sample12_15���Լ������쳣��
***********************************/

package Sample12_15;

class MyException extends Exception	//�Զ����쳣�࣬һ���Exception������������쳣��̳�
{
	public MyException()
	{
	}
	
	public MyException(String msg)
	{
		super(msg);	//���ø���Ĺ�����
	}
}

public class Sample12_15 
{
	public static void main(String[] args)
	{
		MyException me = new MyException("�Զ����쳣��");
		
		System.out.println("�Զ����쳣������ַ�����ʾΪ��" + me.toString() +"��");
		System.out.println("�Զ����쳣����Я���ĳ�����ϢΪ��" + me.getMessage() +"��");
	}
}
