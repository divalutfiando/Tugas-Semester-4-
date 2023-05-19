package com.ibik.library.app.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.ibik.library.app.connection.ConnectionDB;
import com.ibik.library.app.model.User;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class LoginController {

	private JFrame frameMain;
	private JTextField textUsername;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginController window = new LoginController();
					window.frameMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginController() {
		
		ConnectionDB conn =  new ConnectionDB();
		try {
			conn.connect();
			initialize();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMain = new JFrame();
		frameMain.getContentPane().setForeground(SystemColor.textHighlight);
		frameMain.setTitle("Login");
		frameMain.setBounds(100, 100, 292, 494);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.getContentPane().setLayout(null);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.setIcon(new ImageIcon("C:\\Users\\raiha\\Documents\\Kumpulan Tugas Raihan Dwi Pratama\\kumpulan tugas pa febri\\Java\\object-oriented-programming-java\\app_library\\src\\main\\java\\com\\ibik\\library\\images\\logo-ibik-web.png"));
		labelIcon.setBounds(80, 11, 109, 150);
		frameMain.getContentPane().add(labelIcon);
		
		JLabel labelTitle = new JLabel("Sistem Informasi Perpustakaan");
		labelTitle.setForeground(Color.BLACK);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitle.setBounds(10, 163, 256, 31);
		frameMain.getContentPane().add(labelTitle);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login to your account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 227, 256, 159);
		frameMain.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setBounds(10, 35, 70, 14);
		panel.add(labelUsername);
		
		textUsername = new JTextField();
		textUsername.setBounds(90, 32, 138, 20);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(10, 74, 70, 14);
		panel.add(labelPassword);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(90, 71, 138, 20);
		panel.add(textPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textUsername.getText();
				String password = String.valueOf(textPassword.getPassword());
				
				MyResults result = new LoginController().ValidationForm(username, password);
				if (result.getResponce()) {
					frameMain.dispose();
				} else {
					JOptionPane.showMessageDialog(null, result.getLabel(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(139, 114, 89, 23);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frameMain.dispatchEvent();
				frameMain.dispose();
			}
		}
			);
		btnCancel.setBounds(36, 114, 89, 23);
		panel.add(btnCancel);
		
		JLabel labelCopyright = new JLabel("(c) 202310034 2021");
		labelCopyright.setBounds(10, 430, 46, 14);
		frameMain.getContentPane().add(labelCopyright);		
	}
	
	
	public MyResults ValidationForm(String username, String password) {
		MyResults m = new MyResults();
		// kondisi jika username dan password tidak diisi
		if(username.isEmpty() || password.isEmpty()) {
			m.setResponce(false);
			m.setLabel("Username dan password harus diisi");
		}
		// kondisi jika username lebih dari 10 digit
		else if(username.length() > 10) {
			m.setResponce(false);
			m.setLabel("Maximum 10 character untuk username");
		}
		// kondisi jika password lebih dari 6 digit
		else if(password.length() > 6) {
			m.setResponce(false);
			m.setLabel("Maximum 6 character untuk Password");
		}
		// kondisi jika username dan password bukan angka
		else if(username.matches("[a-z]") || password.matches("[a-z]") ) {
			m.setResponce(false);
			m.setLabel("Harap masukan angka.");
		}
		// kondisi jika username dan password diisi
		else {
			// mengirimkan username dan password ke DAO
			User users = new User();
			Long NIK = Long.parseLong(username);
			users.setNIK2(NIK);
			users.setPassword(password);
			// menyimpan ke class user
			// mengirim ke class DAO
			LoginDao loginDao = new LoginDao();
			try {
				User l = loginDao.checkLogin(users);
				System.out.println("NIK " + l.getNIK2());
				System.out.println("Fullname " + l.getFullName());
				m.setResponce(false);
				m.setLabel("Selamat datang di aplikasi Perpustakaan");
			} catch (Exception e) {
				e.printStackTrace();
				m.setResponce(false);
				m.setLabel("Harap isi username dan password yang benar!");
			}
		}
		return m;
	}
		
	public boolean isNumber(String input) {
		
		try {
			Double x = Double.parseDouble(input);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}	
}