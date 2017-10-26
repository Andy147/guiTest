package org.lanqiao.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyJFrame {
	public static void main(String[] args) {
		//实例化一个JFrame窗体
		JFrame jf = new JFrame();
		//获取一个容器
		Container container = jf.getContentPane();
		//创建一个标签
		JLabel jl = new JLabel("这是一个窗体");
		//让标签上的文字居中
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		//将标签添加到容器中
		container.add(jl);
		//设置容器背景颜色
		container.setBackground(Color.white);
		//使窗体可视化
		jf.setVisible(true);
		//设置窗体的大小
		jf.setSize(400,300);
		//设置窗体关闭方式
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

}
