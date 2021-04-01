package MylittleProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Window.Type;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.Box;

import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;



import java.awt.Button;
import java.awt.CardLayout;
import java.awt.SystemColor;

import javax.swing.UIManager;
import javax.swing.JProgressBar;

public class View extends JFrame {

	private JPanel contentPane;
	public JButton btnStartGame,btnConfirm;
	public JLabel promptUser,result,resultLabel;
	public JTextField textField;
	public JLabel lblRandomGuesser;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Model game = Model.getInstance();
					controller c = new controller();
					View frame = new View(c);
					frame.setVisible(true);
					c.setView(frame);
					c.setModel(game);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View(controller c) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/MylittleProject/202529-me-gusta-rage-face.jpg")));
		setTitle("Stupid Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 469);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnStartGame = new JButton(new ImageIcon(View.class.getResource("/MylittleProject/1.png")));
		btnStartGame.setBounds(263, 267, 125, 27);
		btnStartGame.setRolloverIcon(new ImageIcon(View.class.getResource("/MylittleProject/2.png")));
		btnStartGame.setPressedIcon(new ImageIcon(View.class.getResource("/MylittleProject/3.png")));
		btnStartGame.setForeground(Color.DARK_GRAY);
		btnStartGame.setContentAreaFilled(false);
		btnStartGame.setBorderPainted(false);
		btnStartGame.addActionListener(c);
		btnStartGame.setActionCommand(controller.START);
		contentPane.add(btnStartGame);
		
		lblRandomGuesser = new JLabel();
		lblRandomGuesser.setHorizontalAlignment(SwingConstants.CENTER);
		lblRandomGuesser.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/title.png")));
		lblRandomGuesser.setBounds(8, 132, 635, 66);
		contentPane.add(lblRandomGuesser);
		
		
		result = new JLabel();
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(342, 0, 300, 431);
		result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/welcome.png")));
		//contentPane.add(result);
		
		promptUser = new JLabel("");
		promptUser.setHorizontalAlignment(SwingConstants.CENTER);
		promptUser.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/4.png")));
		promptUser.setBounds(10, 116, 309, 35);
		//contentPane.add(promptUser);
		
		textField = new JTextField();
		textField.setForeground(new Color(235, 128, 0));
		textField.setFont(new Font("Impact", Font.PLAIN, 26));
		textField.setBounds(31, 171, 288, 35);
		textField.setColumns(10);
		textField.addActionListener(c);
		//contentPane.add(textField);
	
		
		resultLabel = new JLabel("The correct number is ");
		resultLabel.setForeground(new Color(235, 128, 0));
		resultLabel.setFont(new Font("Impact", Font.PLAIN, 26));
		resultLabel.setBounds(31, 228, 288, 35);
		//contentPane.add(resultLabel);
		
		btnConfirm = new JButton(new ImageIcon(View.class.getResource("/MylittleProject/6.png")));
		btnConfirm.setRolloverIcon(new ImageIcon(View.class.getResource("/MylittleProject/7.png")));
		btnConfirm.setPressedIcon(new ImageIcon(View.class.getResource("/MylittleProject/5.png")));
		btnConfirm.setForeground(Color.DARK_GRAY);
		btnConfirm.setContentAreaFilled(false);
		btnConfirm.setBorderPainted(false);
		btnConfirm.setBounds(31, 281, 310, 35);
		btnConfirm.addActionListener(c);
		btnConfirm.setActionCommand(controller.CONFIRM);
		//contentPane.add(btnConfirm);
	
	
	}
}
