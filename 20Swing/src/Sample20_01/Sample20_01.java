/***********************************
 * 第20章 Swing编程
 * 20.2 第一个Swing小程序
 * Sample20_01：第一个Swing小程序
***********************************/

package Sample20_01;

import javax.swing.*;

public class Sample20_01 extends JFrame	//集成JFrame类
{
	private JLabel jLabelWelcome;
	
	public Sample20_01()
	{
		this.setLayout(null);
		
		jLabelWelcome = new JLabel();	//创建标签对象
		jLabelWelcome.setText("欢迎您来到Swing的编程世界，这将是您第一个图形界面交互程序！");	//设置标签中需要显示的文字信息
		jLabelWelcome.setBounds(40, 30, 450, 30);	//设置标签在窗体中的位置及大小
		
		this.add(jLabelWelcome);	//将标签添加进窗体中
		this.setTitle("第一个Swing程序");	//设置窗体的标题
		this.setBounds(330, 250, 500, 150);	//设置窗体的位置及大小
		this.setVisible(true);	//设置窗体的可见性
	}
	
	public static void main(String[] args)
	{
		new Sample20_01();	//创建窗体对象
	}
}
