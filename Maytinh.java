package vd_gui_swing_builder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Maytinh extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
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
	public Jframe() {
		setTitle("phep tinh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("A=");
		lblA.setBounds(0, 21, 46, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B=");
		lblB.setBounds(0, 48, 46, 14);
		contentPane.add(lblB);
		
		textField = new JTextField();
		textField.setBounds(67, 18, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(67, 45, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("K\u1EBFt qu\u1EA3");
		lblNewLabel.setBounds(0, 174, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(67, 171, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblkq = new JLabel("");
		lblkq.setBounds(67, 193, 86, 23);
		contentPane.add(lblkq);
		lblkq.setBorder(new LineBorder(Color.BLACK));
		
		JButton btnNewButtonCong = new JButton("+");
		btnNewButtonCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int s=a+b;
				textField_2.setText(Integer.toString(s));
				lblkq.setText(Integer.toString(s));
			}
		});
		btnNewButtonCong.setBounds(0, 73, 89, 23);
		contentPane.add(btnNewButtonCong);
		
		JButton btnNewButtonTru = new JButton("-");
		btnNewButtonTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int s=a-b;
				textField_2.setText(Integer.toString(s));
				lblkq.setText(Integer.toString(s));
			}
		});
		btnNewButtonTru.setBounds(99, 73, 89, 23);
		contentPane.add(btnNewButtonTru);
		
		JButton btnNewButtonNhan = new JButton("*");
		btnNewButtonNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int s=a*b;
				textField_2.setText(Integer.toString(s));
				lblkq.setText(Integer.toString(s));
			}
		});
		btnNewButtonNhan.setBounds(198, 73, 89, 23);
		contentPane.add(btnNewButtonNhan);
		
		JButton btnNewButtonChia = new JButton("/");
		btnNewButtonChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int s=a/b;
				textField_2.setText(Integer.toString(s));
				lblkq.setText(Integer.toString(s));
			}
		});
		btnNewButtonChia.setBounds(297, 73, 89, 23);
		contentPane.add(btnNewButtonChia);
		
		JRadioButton rdbtnCong = new JRadioButton("+");
		buttonGroup.add(rdbtnCong);
		rdbtnCong.setBounds(0, 103, 89, 23);
		contentPane.add(rdbtnCong);
		
		JRadioButton rdbtnTru = new JRadioButton("-");
		buttonGroup.add(rdbtnTru);
		rdbtnTru.setBounds(99, 103, 86, 23);
		contentPane.add(rdbtnTru);
		
		JRadioButton rdbtnNhan = new JRadioButton("*");
		buttonGroup.add(rdbtnNhan);
		rdbtnNhan.setBounds(198, 103, 89, 23);
		contentPane.add(rdbtnNhan);
		
		JRadioButton rdbtnChia = new JRadioButton("/");
		buttonGroup.add(rdbtnChia);
		rdbtnChia.setBounds(297, 103, 89, 23);
		contentPane.add(rdbtnChia);
		
		JButton btnTinh = new JButton("T\u00EDnh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				
				if (rdbtnCong.isSelected()==true){
					int s=a+b;
					lblkq.setText(Integer.toString(s));
				}
				if (rdbtnTru.isSelected()==true){
					int s=a-b;
					lblkq.setText(Integer.toString(s));
				}
				if (rdbtnNhan.isSelected()==true){
					int s=a*b;
					lblkq.setText(Integer.toString(s));
				}
				if (rdbtnChia.isSelected()==true){
					int s=(int) (1.0*(a/b));
					lblkq.setText(Integer.toString(s));
				}
			}
		});
		btnTinh.setBounds(0, 133, 89, 23);
		contentPane.add(btnTinh);
		
		


	}
}
