/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.1 String��
 * Sample13_03��String�����Ҫ����
***********************************/


package Sample13_03;

public class Sample13_03 
{
	public static void main(String[] args)
	{
		String s1 = "JavaSE 7.0���ļ�����ȫ��ӭ����";
		String s2 = new String("��ϲ��ֱ������ֲ�ͬ���﷨�������ַ�����");
		String s3;
		
		System.out.println("========== charAt ==========");
		char c = s1.charAt(4);
		System.out.println("��0��ʼ�����ַ���s1�е�4���ַ�Ϊ��" + c);
		
		System.out.println("========== toCharArray ==========");
		char[] array = s1.toCharArray();
		System.out.print("��char���鵹�Ŵ�ӡ��");
		for (int i = array.length - 1; i >= 0; i--) 
		{
			System.out.println(array[i]);
		}
		
		System.out.println("\n========== concat ==========");
		s3 = s1.concat(s2);
		System.out.println("�������ַ������Ӻ�Ľ��Ϊ��" + s3);
		
		System.out.println("========== equals ==========");
		s3 = "JavaSE 7.0���ļ�����ȫ��ӭ����";
		if (s1.equals(s3))
		{
			System.out.println("��ϲ����Գɹ���s1��s3�е���������ȫ��ͬ�ģ�");
		}
		
		System.out.println("========== equalsIgnoreCase ==========");
		s3 = "JAVASE 7.0���ļ�����ȫ��ӭ����";
		if (s1.equalsIgnoreCase(s3))
		{
			System.out.println("s1��s3�е������ڲ����ִ�Сд�����������ͬ�ģ�");
		}
		
		System.out.println("========== length ==========");
		int size = s1.length();
		System.out.println("s1���ַ��ĸ���Ϊ��" + size);
		
		System.out.println("========== replace ==========");
		s3 = s1.replace('a', 'X');
		System.out.println("��s1�����е���ĸa������ĸX��" + s3);
		
		System.out.println("========== substring ==========");
		s3 = s1.substring(10);
		System.out.println("��0��ʼ����s1�е�10���ַ�������ַ���Ϊ��" + s3);
		s3 = s1.substring(2, 10);
		System.out.println("��0��ʼ����s1�е�2���ַ�����10���ַ����ַ���Ϊ��" + s3);
		
		System.out.println("========== toLowerCase ==========");
		s3 = s1.toLowerCase();
		System.out.println("��s1�е��ַ�ȫ����Сд��" + s3);
		
		System.out.println("========== toUpperCase ==========");
		s3 = s1.toUpperCase();
		System.out.println("��s1�е��ַ�ȫ���ɴ�д��" + s3);
				
		System.out.println("========== trim ==========");
		s3 = "     JavaSE 7.0     ";
		System.out.println("s3û���ù�trim����ǰ��[" + s3 + "]");
		s3 = s3.trim();
		System.out.println("s3�ù�trim������[" + s3 + "]");
	}
}
