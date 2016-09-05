package com.orcle.cha;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class R67 {
			private int delay;
			private boolean flag;
			public R67(int delay,boolean flag){
				this.delay=delay;
				this.flag=flag;
			}
			public void start(){
				class Printer implements ActionListener{

					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						SimpleDateFormat format=new SimpleDateFormat("k:m:s");//��ʽ
						String result=format.format(new Date());
						System.out.println("��ǰ��ʱ���ǣ�"+result);
						if(flag){
							Toolkit.getDefaultToolkit().beep();
						}
					}
					
				}
				new Timer(delay,new Printer()).start();
			}
			public static void main(String[] args) {
				R67 r=new R67(1000, true);
				r.start();
				JOptionPane.showMessageDialog(null, "�Ƿ��˳�");
				System.exit(0);
			}
}
