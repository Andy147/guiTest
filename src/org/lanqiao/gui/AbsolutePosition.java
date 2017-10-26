package org.lanqiao.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AbsolutePosition {
	public static void main(String[] args) {
		//创建一个窗体
		JFrame jf = new JFrame("布局管理");
		//创建一个容器
		Container container = jf.getContentPane();
		//取消布局管理器设置
		container.setLayout(null);
		//绝对窗体的位置和大小
		jf.setBounds(100,10,200,150);
		JButton b1 = new JButton("按钮1");
		//设置按钮的位置和大小
		b1.setBounds(100, 30, 80, 30);
		JButton b2 = new JButton("按钮2");
		//设置按钮的位置和大小
		b2.setBounds(60, 70, 100, 20);
		//将按钮添加到容器中
		container.add(b1);
		container.add(b2);
		jf.setSize(800, 700);
		//设置窗体可视化
		jf.setVisible(true);
		//设置窗体的关闭模式
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}

}
