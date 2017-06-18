/***********************************
 * 第12章 如何处理异常
 * 12.6 自定义异常
 * Sample12_16：使用自定义异常类
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
			throw new NoSuchScoreException("不合法的成绩：" + score + "！");
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			int grade = findGrade(67);
			System.out.println("67分的等级为：" + grade +"！");
			
			grade = findGrade(-20);
			System.out.println("-20分的等级为：" + grade +"！");
		}
		catch (NoSuchScoreException e)
		{
			e.printStackTrace();
		}
	}
}
