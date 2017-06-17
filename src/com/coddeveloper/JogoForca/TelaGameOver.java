package com.coddeveloper.JogoForca;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.FontMetrics;

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
		System.out.println("Resultado e vitoria "+gameForca.isVitoriA());
		System.out.println("Resultaod Game Over: "+gameForca.isOver());
	if(gameForca.isVitoriA()==true){
		setIniCialiZacao(false);
		lblOuver.setText("Obaa... Você Ganhou");
		lblGame.setText("Mesu Parabensss....>!!<"+"\n"+"De mais..");
	}else if(gameForca.isOver()==true){
		setIniCialiZacao(false);
		lblOuver.setText("GAME");
		lblGame.setText("OVER..> !!");
		System.out.println("Metodos seta Settext lblOuver - lblGame "+lblGame.getText()+" e "+lblOuver.getText());
		System.out.println("Systema detectoru que foi game Over...");
	}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			try {
		System.out.println("Metodo Rum. Lendo Variavel Game Over -- = "+gameForca.isOver());
				
					TelaGameOver frame = new TelaGameOver();
					frame.setExtendedState(Frame.MAXIMIZED_BOTH);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
			} catch (Exception e) {
					e.printStackTrace();
	}}});}

	public TelaGameOver() {
		System.out.println("Inicio JFrame Game Over Principal --- ok");
		//Graphics2D g2d = (Graphics2D) g2D.create();
		//g2d.drawImage(fundo.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
		//g2d.dispose();
		//img = new ImageIcon(getClass().getResource(""));
		//imagem = new JLabel(img);
		//Container c = getContentPane();
		//c.setLayout(new BorderLayout());
		System.out.println("Modo img -- ok");
		//img = new ImageIcon(getClass().getResource("/img/fundo.jpg"));
		System.out.println("gerar img -- ok");
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
		//c.add(imagem, BorderLayout.CENTER);
		//c.setBackground(Color.BLACK);
		this.setSize(this.getWidth(),this.getHeight());
		this.getInsets();
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		//getContentPane().getSize(Toolkit.getDefaultToolkit().getScreenSize());
		//panel.add(c).getToolkit().getDefaultToolkit().getScreenSize();
		//pack();
		//setResizable(false);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
	panel_1.setFocusTraversalPolicy(null);
	panel_1.requestFocus();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
					.addGap(38))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(128)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addGap(108))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(75)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
					.addGap(101)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(23))
		);
		
		//JLabel lblOuver = new JLabel("OVER");
	System.out.println("Inicio metodo JFrame Game over. Antes IF Tela Bem Vindo comando Inicialização = "+isIniCialiZacao());
		if (this.isIniCialiZacao() == true) {
			System.out.println("entrou no metodo Inicialização padrão setText .."+isIniCialiZacao());
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
					System.out.println("Clic Botão Start ----  OK ");
					gameForca frame = new gameForca();
					frame.setOver(true);
					gameForca init = new gameForca();
					init.winodwsIN(null);
					dispose();
					//frame.dispose();
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
		System.out.println("Fim metodo JFrame Tela Game  Over Principal.. ok ");
	}

	public static boolean isIniCialiZacao() {
		return iniCialiZacao;
	}

	public static void setIniCialiZacao(boolean iniCialiZacao) {
		TelaGameOver.iniCialiZacao = iniCialiZacao;
	}
	
}