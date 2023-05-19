package com.ibik.library.app.dashboard;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Dashboard extends JFrame{

	public JFrame frameMain;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dashboard() {
		initialize();
	}

	private void initialize() {
		setTitle("Dashboard");
		setResizable(false);
		setBounds(100, 100, 500, 541); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Wellcome to this application");
		labelTitle.setBounds(62, 44, 364, 29);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(labelTitle);		
		
		Panel panel = new Panel();
		panel.setBounds(53, 113, 373, 328);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIK");
		lblNewLabel.setBounds(25, 22, 27, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(25, 45, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Fullname");
		lblPassword.setBounds(196, 22, 56, 14);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(196, 45, 152, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(25, 123, 121, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(156, 123, 105, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(271, 123, 77, 20);
		panel.add(textField_4);
		
		JLabel lblPlacebirth = new JLabel("Placebirth");
		lblPlacebirth.setBounds(25, 98, 77, 14);
		panel.add(lblPlacebirth);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		lblBirthdate.setBounds(147, 98, 56, 14);
		panel.add(lblBirthdate);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(260, 98, 56, 14);
		panel.add(lblGender);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(25, 190, 323, 48);
		panel.add(textField_5);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(25, 165, 56, 14);
		panel.add(lblAddress);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(25, 284, 130, 20);
		panel.add(textField_6);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 259, 56, 14);
		panel.add(lblEmail);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(196, 259, 92, 14);
		panel.add(lblPassword_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(196, 284, 152, 20);
		panel.add(textField_7);
		
	}
}