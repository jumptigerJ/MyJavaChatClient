package com.study.myjavachatclient.main;

import java.awt.EventQueue;

import com.study.myjavachatclient.view.MainWindow;

public class StartClient {

	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
					ChatManager.getCM().setWindow(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}

}
