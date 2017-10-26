package org.lanqiao.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("my frame");
		f.setBounds(400, 200, 500, 400);
		f.setLayout(new FlowLayout());//设置流式布局
		JButton but = new JButton("一个按钮");
		f.add(but);//将按钮添加到窗体中
		
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
				
			}
		});
		//在按钮加上一个监听器
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		f.setVisible(true);
		System.out.println("over");
	}

}
