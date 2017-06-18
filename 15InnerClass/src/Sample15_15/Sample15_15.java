/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.11 �ڲ��ӿ�
 * Sample15_15�����������е��ڲ��ӿ�
***********************************/

package Sample15_15;

class OuterClass
{
	public interface InnerInterface	//�����ڲ��ӿڣ������Ƿ�ʹ��static���Σ����Ǿ�̬��
	{
		public void show();
	}
	
	public class InnerClass implements InnerInterface	//����ʵ��InnerInterface�ӿڵ��ڲ���
	{
		@Override
		public void show()
		{
			System.out.println("�������ڲ����еķ��������ڲ���ʵ����˽���ڲ��ӿ�InnerInterface��");
		}		
	}
	
	public InnerInterface getIn()	//�����ø��ڲ������ķ���
	{
		return new InnerClass();
	}
}

class Common implements OuterClass.InnerInterface	//����ʵ���ڲ��ӿڵ���ͨ�࣬��Ϊ�ڲ��ӿ��Ǿ�̬�ģ����Կ���ֱ��ʹ�ã��������������ⲿ��Ķ���
{
	public void show()
	{
		System.out.println("��������ͨ���еķ���������ͨ��ʵ����˽���ڲ��ӿ�InnerInterface��");
	}
}

public class Sample15_15 
{
	public static void main(String[] args)
	{
		OuterClass oc = new OuterClass();
		
		OuterClass.InnerClass ic = oc.new InnerClass();	//���ⲿ���ⴴ���ڲ������
		ic.show();
		
		OuterClass.InnerInterface ii = null;
		ii = oc.getIn();	//���ʵ���ڲ��ӿڵ��ڲ������
		ii.show();
		
		Common c = new Common();	//������ͨ�����
		c.show();
	}
}
