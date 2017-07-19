package com.coddeveloper.JogoForca;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaTiro extends JFrame {

	private static JLabel label;
	private String imgDir = "/src/img/tiro.png";
	ImageIcon url = new ImageIcon(imgDir);
	
	JLabel background = new JLabel(url);

	public TelaTiro() {
	

		label.setVisible(true);
		background.setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		background.add(BorderLayout.SOUTH, label);
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(background);
		
		setLayout(new GridBagLayout());
		setOpacity(0);
		setVisible(true);
		contaDor();
		dispose();

	}

	public static void contaDor() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getImgDir() {
		return imgDir;
	}

	public void setImgDir(String imgDir) {
		this.imgDir = imgDir;
	}
}