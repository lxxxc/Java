/***********************************
 * ��20�� Swing���
 * 20.5 �����¼�
 * Sample20_04�������¼�
***********************************/

package Sample20_04;

import java.awt.event.*;
import javax.swing.*;

public class Sample20_04 extends JFrame implements WindowListener	//�̳�JFrame�ಢʵ��WindowListener�ӿڣ�����Ϊ�����¼����¼�Դ����Ϊ������
{
	public Sample20_04()
	{
		this.setTitle("�رմ����¼��������¶���Ĵ���");
		this.add(new JLabel("                           ����һ����ʾ���壬������ʾ��μ�������ر��¼���"));
		this.addWindowListener(this);	//�������ע�����������Ϊ�Լ����Ǽ�����������ʹ��this
		this.setBounds(100, 100, 500, 200);
		this.setVisible(true);
	}

	//�ǳ��������ʵ�ֽӿ��е����з���
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) 
	{	
		System.out.println("������ر�ʱ��ִ������Ĵ��룡");
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}

	public static void main(String[] args)
	{
		new Sample20_04();
	}
}
