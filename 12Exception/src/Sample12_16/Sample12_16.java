/***********************************
 * ��12�� ��δ����쳣
 * 12.6 �Զ����쳣
 * Sample12_16��ʹ���Զ����쳣��
***********************************/

package Sample12_16;

class NoSuchScoreException extends Exception	
{
	public NoSuchScoreException()
	{
		
	}
	
	public NoSuchScoreException(String msg)
	{
		super(msg);
	}
}

public class Sample12_16 
{

	public static int findGrade(double score) throws NoSuchScoreException 
	{
		if (score >= 0 && score < 60) 
		{
			return 5;
		} 
		else if (score >= 60 && score < 75) 
		{
			return 4;
		} 
		else if (score >= 75 && score < 85) 
		{
			return 3;
		} 
		else if (score >= 85 && score <= 100) 
		{
			return 1;
		} 
		else 
		{
			throw new NoSuchScoreException("���Ϸ��ĳɼ���" + score + "��");
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			int grade = findGrade(67);
			System.out.println("67�ֵĵȼ�Ϊ��" + grade +"��");
			
			grade = findGrade(-20);
			System.out.println("-20�ֵĵȼ�Ϊ��" + grade +"��");
		}
		catch (NoSuchScoreException e)
		{
			e.printStackTrace();
		}
	}
}
