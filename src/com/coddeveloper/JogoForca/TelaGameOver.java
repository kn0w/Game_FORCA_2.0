package com.coddeveloper.JogoForca;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class TelaGameOver extends JFrame {
	private JPanel contentPane;
	private JTextField txt;
	private JPanel painel;
	private ImageIcon img;
	private JLabel imagem;
	private static JLabel lblOuver = new JLabel();
	private static JLabel lblGame = new JLabel();
	private static String planoFundo = "/img/011.jpg";
	private static boolean iniCialiZacao;

	public static void main(String[] args) {
		setIniCialiZacao(true);
		if (gameForca.isVitoriA() == true) {
			setIniCialiZacao(false);
			lblOuver.setText("Obaa... Você Ganhou");
			lblGame.setText("Mesu Parabensss....>!!<" + "\n" + "De mais..");
		} else if (gameForca.isOver() == true) {
			setIniCialiZacao(false);
			lblOuver.setText("GAME");
			lblGame.setText("OVER..> !!");
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					TelaGameOver frame = new TelaGameOver();
					frame.setExtendedState(Frame.MAXIMIZED_BOTH);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}
	public TelaGameOver() {
		setLocationRelativeTo(null);
		setUndecorated(true);
		setResizable(false);
		setBackground(UIManager.getColor("Button.background"));
		setForeground(new Color(153, 153, 153));
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaGameOver.class.getResource("/img/06.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 51, 51));
		contentPane.setBackground(new Color(0, 0, 0));
		setContentPane(contentPane);
		this.setSize(this.getWidth(), this.getHeight());
		this.getInsets();
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setFocusTraversalPolicy(null);
		panel_1.requestFocus();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(27)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE).addGap(38))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(128)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE).addGap(108)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(75)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE).addGap(101)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE).addGap(23)));

		if (this.isIniCialiZacao() == true) {
			lblGame.setText("Game da F0rcA");
			lblOuver.setText("BEM VINDO ....");
		}
		panel_1.add(lblOuver);
		panel_1.add(lblGame);
		lblOuver.setForeground(new Color(165, 42, 42));
		lblOuver.setFont(new Font("Dialog", Font.BOLD, 30));
		lblGame.setFont(new Font("Dialog", Font.BOLD, 30));
		lblGame.setForeground(SystemColor.desktop);
		JButton btnStart = new JButton("Start");
		panel.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					gameForca frame = new gameForca();
					frame.setOver(true);
					gameForca init = new gameForca();
					init.winodwsIN(null);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		JButton btnStop = new JButton("Stop");
		panel.add(btnStop);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.WIDTH);
			}
		});
		contentPane.setLayout(gl_contentPane);
	}
	public static boolean isIniCialiZacao() {
		return iniCialiZacao;
	}
	public static void setIniCialiZacao(boolean iniCialiZacao) {
		TelaGameOver.iniCialiZacao = iniCialiZacao;
	}
}
