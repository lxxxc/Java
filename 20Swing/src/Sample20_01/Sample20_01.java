/***********************************
 * ��20�� Swing���
 * 20.2 ��һ��SwingС����
 * Sample20_01����һ��SwingС����
***********************************/

package Sample20_01;

import javax.swing.*;

public class Sample20_01 extends JFrame	//����JFrame��
{
	private JLabel jLabelWelcome;
	
	public Sample20_01()
	{
		this.setLayout(null);
		
		jLabelWelcome = new JLabel();	//������ǩ����
		jLabelWelcome.setText("��ӭ������Swing�ı�����磬�⽫������һ��ͼ�ν��潻������");	//���ñ�ǩ����Ҫ��ʾ��������Ϣ
		jLabelWelcome.setBounds(40, 30, 450, 30);	//���ñ�ǩ�ڴ����е�λ�ü���С
		
		this.add(jLabelWelcome);	//����ǩ��ӽ�������
		this.setTitle("��һ��Swing����");	//���ô���ı���
		this.setBounds(330, 250, 500, 150);	//���ô����λ�ü���С
		this.setVisible(true);	//���ô���Ŀɼ���
	}
	
	public static void main(String[] args)
	{
		new Sample20_01();	//�����������
	}
}
