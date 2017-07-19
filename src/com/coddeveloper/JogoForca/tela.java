package com.coddeveloper.JogoForca;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class tela extends JFrame {

	private JPanel contentPane;

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				System.out.println("Tela Run");
				tela careg = new tela();
				TelaGameOver in = new TelaGameOver();
				in.main(null);
			} catch (Exception e) {	e.printStackTrace();}
		}
	});
}
		
			public tela() {
				setUndecorated(true);
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				setIconImage(Toolkit.getDefaultToolkit().getImage(tela.class.getResource("/img/fundo.jpg")));
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 583, 403);
				setOpacity(1);
				contentPane = new JPanel();
				contentPane.setBackground(SystemColor.desktop);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(tela.class.getResource("/img/tiro.png")));
				GroupLayout gl_contentPane = new GroupLayout(contentPane);
				gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addComponent(lblNewLabel).addContainerGap(425, Short.MAX_VALUE)));
				gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(
						gl_contentPane.createSequentialGroup().addComponent(lblNewLabel).addContainerGap(90, Short.MAX_VALUE)));
				contentPane.setLayout(gl_contentPane);
				setVisible(true);
				contadoR();
				System.out.println("Fim tela JFrame");
		
			}
		
			public void contadoR() {
		
				System.out.println("Dentro tela Contador ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "", "Erro Encontrado", 0);
				}
				dispose();
			}
}
