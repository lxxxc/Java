/***********************************
 * 第13章 字符串应用
 * 13.1 String类
 * Sample13_03：String类的重要方法
***********************************/


package Sample13_03;

public class Sample13_03 
{
	public static void main(String[] args)
	{
		String s1 = "JavaSE 7.0核心技术大全欢迎您！";
		String s2 = new String("恭喜你分别用两种不同的语法创建了字符串！");
		String s3;
		
		System.out.println("========== charAt ==========");
		char c = s1.charAt(4);
		System.out.println("从0开始数，字符串s1中第4个字符为：" + c);
		
		System.out.println("========== toCharArray ==========");
		char[] array = s1.toCharArray();
		System.out.print("将char数组倒着打印：");
		for (int i = array.length - 1; i >= 0; i--) 
		{
			System.out.println(array[i]);
		}
		
		System.out.println("\n========== concat ==========");
		s3 = s1.concat(s2);
		System.out.println("将两个字符串连接后的结果为：" + s3);
		
		System.out.println("========== equals ==========");
		s3 = "JavaSE 7.0核心技术大全欢迎您！";
		if (s1.equals(s3))
		{
			System.out.println("恭喜你测试成功，s1与s3中的内容是完全相同的！");
		}
		
		System.out.println("========== equalsIgnoreCase ==========");
		s3 = "JAVASE 7.0核心技术大全欢迎您！";
		if (s1.equalsIgnoreCase(s3))
		{
			System.out.println("s1与s3中的内容在不区分大小写的情况下是相同的！");
		}
		
		System.out.println("========== length ==========");
		int size = s1.length();
		System.out.println("s1中字符的个数为：" + size);
		
		System.out.println("========== replace ==========");
		s3 = s1.replace('a', 'X');
		System.out.println("将s1中所有的字母a换成字母X：" + s3);
		
		System.out.println("========== substring ==========");
		s3 = s1.substring(10);
		System.out.println("从0开始数，s1中第10个字符往后的字符串为：" + s3);
		s3 = s1.substring(2, 10);
		System.out.println("从0开始数，s1中第2个字符到第10个字符的字符串为：" + s3);
		
		System.out.println("========== toLowerCase ==========");
		s3 = s1.toLowerCase();
		System.out.println("将s1中的字符全换成小写：" + s3);
		
		System.out.println("========== toUpperCase ==========");
		s3 = s1.toUpperCase();
		System.out.println("将s1中的字符全换成大写：" + s3);
				
		System.out.println("========== trim ==========");
		s3 = "     JavaSE 7.0     ";
		System.out.println("s3没有用过trim方法前：[" + s3 + "]");
		s3 = s3.trim();
		System.out.println("s3用过trim方法后：[" + s3 + "]");
	}
}
