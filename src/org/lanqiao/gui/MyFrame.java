package org.lanqiao.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
class MyJDialog extends JDialog{
	public MyJDialog(MyFrame frame){
		//实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
		super(frame , "第一个JDialog窗体" , true);
		Container container = getContentPane();//创建一个容器
		container.add(new JLabel("这是一个对话框"));//在容器添加标签
		setBounds(120,120,100,100);
	}
}

public class MyFrame extends JDialog{
	public static void main(String[] args) {
		new MyFrame();
	}
	public MyFrame(){
		Container container = getContentPane();//创建一个容器
		container.setLayout(null);
		JLabel jl = new JLabel("这是一个JFrame窗体");//在窗体中设置标签
		//将标签的文字置于标签中间位置
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("弹出对话框");//定义一个按钮
		bl.setBounds(10,10,100,21);
		bl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//使MyJDialog可见
				new MyJDialog(MyFrame.this).setVisible(true);
				
			}
		});
		container.add(bl);
		container.add(bl);
		container.setBackground(Color.white);
		setSize(200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}

}
