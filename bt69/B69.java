package bt69;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class B69 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B69 frame = new B69();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public B69() {
		setTitle("tong 2 so nguyen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("S\u1ED1 nguy\u00EAn th\u1EE9 nh\u1EA5t");
		lblA.setBounds(10, 21, 134, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("S\u1ED1 nguy\u00EAn th\u1EE9 hai");
		lblB.setBounds(10, 46, 134, 14);
		contentPane.add(lblB);
		
		JTextField textField = new JTextField();
		textField.setBounds(154, 18, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(154, 43, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("K\u1EBFt qu\u1EA3");
		lblNewLabel.setBounds(10, 71, 134, 14);
		contentPane.add(lblNewLabel);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(154, 74, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButtonCong = new JButton("T\u1ED5ng");
		btnNewButtonCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int s=a+b;
				textField_2.setText(Integer.toString(s));
			}
		});
		btnNewButtonCong.setBounds(83, 105, 89, 23);
		contentPane.add(btnNewButtonCong);
	}

}
