package btth2;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	String HoTen= new String();
	private JTextField txtTen;
	private JPasswordField pwdMK;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnn = new JLabel("T\u00EAn \u0110N");
		lblTnn.setBounds(10, 11, 46, 14);
		contentPane.add(lblTnn);
		
		txtTen = new JTextField();
		txtTen.setBounds(166, 8, 174, 20);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		pwdMK = new JPasswordField();
		pwdMK.setBounds(166, 39, 174, 20);
		contentPane.add(pwdMK);
		
		JLabel lblMtKhu = new JLabel("M\u1EADt Kh\u1EA9u");
		lblMtKhu.setBounds(10, 42, 78, 14);
		contentPane.add(lblMtKhu);
		
		JButton btnDN = new JButton("\u0110\u0103ng Nh\u1EADp");
		btnDN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( ("a".equals(txtTen.getText()) && ("1".equals(pwdMK.getText())))) {
					
					JOptionPane.showMessageDialog(null, "dang nhap thanh cong");
					
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								StudentGUI frame = new StudentGUI();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
				}
			}
		});
		btnDN.setBounds(173, 70, 119, 23);
		contentPane.add(btnDN);
		
		
	}
}
